package com.xupt.edu.ttms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.service.UserService;
import com.xupt.edu.ttms.util.ImageUtil;
import com.xupt.edu.ttms.util.Page;
import com.xupt.edu.ttms.util.ResponseUtil;
import com.xupt.edu.ttms.util.UploadedImageFile;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.util.HtmlUtils;

import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.in;

/**
 * @author: zhaowanyue
 * @date: 2018/6/3
 * @description:
 */
@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("user_list")
    @ResponseBody
    public List<User> list()throws Exception{
        List<User> cs= userService.list();
        return cs;

    }
    //文件只能用POST方式进行传递
    @RequestMapping(value = "user_listByPage" ,method = RequestMethod.POST)
    //JSON形式返回给结果
    @ResponseBody
    public List<User> list(Page page, @RequestParam("start") int start,@RequestParam("count") int count){
        page.setStart(start);
        page.setCount(count);
        PageHelper.offsetPage(start,count);
        List<User> cs= userService.list();
        int total = (int) new PageInfo<>(cs).getTotal();
        page.setTotal(total);
        return cs;
    }
    @RequestMapping(value="user_add",method=RequestMethod.POST)
    @ResponseBody
    public User add
            (User user,@RequestParam("emp_no") String emp_no, @RequestParam("emp_pass") String emp_pass,
             @RequestParam("type")int type, @RequestParam("uploadedImageFile") MultipartFile uploadedImageFile
            ,HttpServletRequest request)
            throws IOException {
        user.setEmp_no(emp_no);
        user.setEmp_pass(emp_pass);
        user.setType(type);
        String path = request.getServletContext().getRealPath("/upload/users");
        //创建文件
        File dir=new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        String fileName=uploadedImageFile.getOriginalFilename();
        String img=emp_no+fileName.substring(fileName.lastIndexOf("."));//zhao.jpg
        FileOutputStream imgOut=new FileOutputStream(new File(dir,img));//根据 dir 抽象路径名和 img 路径名字符串创建一个新 File 实例。
        imgOut.write(uploadedImageFile.getBytes());//返回一个字节数组文件的内容
        imgOut.close();
        Map<String, String> map=new HashMap<String, String>();
        map.put("path",img);
        String head_path="http://120.77.215.146:8080/ttms3/upload/users/"+img;
        System.out.println(head_path);
        user.setHead_path(head_path);
        userService.add(user);
        return user;
    }
//    @RequestMapping(value="user_add",method=RequestMethod.POST)
//    @ResponseBody
//    public String add(User user) throws IOException {
//        userService.add(user);
//
//        return null;
//    }
    @RequestMapping(value="user_delete", method=RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestParam("emp_no") String emp_no,HttpServletResponse response,HttpServletRequest request)throws Exception
    {
        User user1 =(User)  request.getSession().getAttribute("user");
        JSONObject result=new JSONObject();
        if(user1.getType()==1)
        {
            userService.delete(emp_no);
            result.put("success","ok");
            ResponseUtil.write(response,result);
        }
        else if(user1.getType()==0)
        {
            result.put("fail","no permission");
            ResponseUtil.write(response,result);
        }
        return null;
    }
    @RequestMapping(value = "user_findById",method = RequestMethod.POST)
    @ResponseBody
    public User findById (@RequestParam("emp_no") String emp_no) throws  IOException{
        User user=userService.findById(emp_no);
        System.out.println(user);
        return user;
    }
    @RequestMapping(value="user_update",method = RequestMethod.POST)
    @ResponseBody
    public String  update(User user,HttpServletResponse response,HttpServletRequest request) throws Exception{
        User user1 =(User)  request.getSession().getAttribute("user");
        JSONObject result=new JSONObject();
        if(user1.getType()==1)
        {
            userService.update(user);
            result.put("success","ok");
            ResponseUtil.write(response,result);
        }
        else if(user1.getType()==0)
        {
            result.put("fail","no permission");
            ResponseUtil.write(response,result);
        }
        return null;
    }
    @RequestMapping(value = "user_loginCheck",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam("emp_no") String emp_no, @RequestParam("emp_pass") String emp_pass,
                        HttpServletRequest request,HttpServletResponse response)throws Exception
    {
        Map<String, Object> map = new HashMap<String, Object>();
        //HttpSession session = request.getSession(true);
        emp_no = HtmlUtils.htmlEscape(emp_no);
        User user = userService.get(emp_no,emp_pass);
        JSONObject result=new JSONObject();
        if(null==user){
            result.put("msg","账号密码错误");
            ResponseUtil.write(response,result);
        }
        else
        {
//            String loginInfo=new String ();
//            Cookie userCookie=new Cookie("loginInfo",loginInfo);
//            userCookie.setMaxAge(30*24*60*60);   //存活期为一个月 30*24*60*60
//            userCookie.setPath("/");
//            response.addCookie(userCookie);
//            Cookie[] cookies = request.getCookies();
//            for(Cookie cookie : cookies){
//                if(cookie.getName().equals("loginInfo")){
//                    loginInfo = cookie.getValue();
//                    String username = loginInfo.split(",")[0];
//                    String password = loginInfo.split(",")[1];
//                    String type = loginInfo.split(",")[2];
//                    String head_path = loginInfo.split(",")[3];
//                    request.setAttribute("username", username);
//                    request.setAttribute("password", password);
//                    request.setAttribute("type", type);
//                    request.setAttribute("head_path", head_path);
//                }
//            }
            request.getSession().setAttribute("user", user);
            Cookie nameCookie = new Cookie("emp_no", user.getEmp_no());
            nameCookie.setMaxAge(60 * 60 * 24 * 3);
            Cookie pwdCookie = new Cookie("emp_pass", user.getEmp_pass());
            pwdCookie.setMaxAge(60 * 60 * 24 * 3);
            Cookie typeCookie = new Cookie("type",String.valueOf(user.getType()));
            pwdCookie.setMaxAge(60 * 60 * 24 * 3);
            Cookie pathCookie = new Cookie("head_path",user.getHead_path());
            pwdCookie.setMaxAge(60 * 60 * 24 * 3);
            response.addCookie(nameCookie);
            response.addCookie(pwdCookie);
            response.addCookie(typeCookie);
            response.addCookie(pathCookie);
            if(user.getType()==1)
            {
                result.put("msg","管理员登陆");
                ResponseUtil.write(response,result);
                System.out.println(typeCookie);
            }
            if(user.getType()==0)
            {
                result.put("msg","员工登陆");
                ResponseUtil.write(response,result);
            }
        }
        return null;
    }


    @RequestMapping(value = "user_loginOut",method = RequestMethod.POST)
    @ResponseBody
    public String login_out(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        JSONObject result=new JSONObject();
        result.put("msg","退出");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "user_search",method = RequestMethod.POST)
    @ResponseBody
    public List<User> search( @RequestParam("emp_no") String emp_no){
        List<User> users= userService.search(emp_no);
        return users;
    }
}

