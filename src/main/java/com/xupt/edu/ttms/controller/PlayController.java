package com.xupt.edu.ttms.controller;

import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.ttms.pojo.Data_Dict;
import com.xupt.edu.ttms.pojo.Play;
import com.xupt.edu.ttms.pojo.User;
import com.xupt.edu.ttms.service.Data_dictService;
import com.xupt.edu.ttms.service.PlayService;
import com.xupt.edu.ttms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zhaowanyue
 * @date: 2018/6/8
 * @description:
 */
@Controller
public class PlayController {
    @Autowired
    PlayService playService;
    @Autowired
    Data_dictService data_dictService;

    @RequestMapping(value = "play_list")
    @ResponseBody
    public List<Play> list()
    {
        List<Play> plays= playService.list();
        return plays;
    }
    @RequestMapping(value="play_add",method=RequestMethod.POST)
    @ResponseBody
    public Play add(Play play, @RequestParam("uploadedImageFile") MultipartFile uploadedImageFile, HttpServletRequest request)
            throws IOException {
//        play.setPlay_type_id(play_type_id);
//        play.setPlay_lang_id(play_lang_id);
//        play.setPlay_name(play_name);
//        play.setPlay_introduction(play_introduction);
//        play.setPlay_length(play_length);
//        play.setPlay_ticket_price(play_ticket_price);
//        play.setPlay_status(play_status);
        String path = request.getServletContext().getRealPath("/upload/plays");
        //创建文件
        File dir=new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        String fileName=uploadedImageFile.getOriginalFilename();
        String img=play.getPlay_type_id()+fileName.substring(fileName.lastIndexOf("."));
        FileOutputStream imgOut=new FileOutputStream(new File(dir,img));//根据 dir 抽象路径名和 img 路径名字符串创建一个新 File 实例。
        imgOut.write(uploadedImageFile.getBytes());//返回一个字节数组文件的内容
        imgOut.close();
        Map<String, String> map=new HashMap<String, String>();
        map.put("path",img);
        String play_image="http://120.77.215.146:8080/ttms3/upload/plays/"+img;
        System.out.println(play_image);
        play.setPlay_image(play_image);
        playService.add(play);
        return play;
    }
//    @RequestMapping(value="play_add",method = RequestMethod.POST)
//    @ResponseBody
//    public String add(Play play, HttpServletResponse response)throws Exception
//    {
//        playService.add(play);
//        JSONObject result=new JSONObject();
//        result.put("success","ok");
//        ResponseUtil.write(response,result);
//        return null;
//    }
    @RequestMapping(value="play_delete",method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestParam("play_id")int play_id, HttpServletResponse response)throws Exception
    {
        playService.delete(play_id);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
}
