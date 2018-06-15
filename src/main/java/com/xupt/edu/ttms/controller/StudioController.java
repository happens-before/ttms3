package com.xupt.edu.ttms.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.ttms.pojo.Studio;
import com.xupt.edu.ttms.service.StudioService;
import com.xupt.edu.ttms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/6
 * @description:
 */
@Controller
@RequestMapping("")
public class StudioController {
    @Autowired
    StudioService studioService;
    @RequestMapping(value="studio_list")
    @ResponseBody
    public List<Studio> list()
    {
        List<Studio> studios=studioService.list();
        return studios;
    }
    @RequestMapping(value = "studio_add",method = RequestMethod.POST)
    @ResponseBody
    public String  add(Studio studio,HttpServletResponse response)throws Exception
    {
        studioService.add(studio);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "studio_delete",method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestParam("studio_id") int studio_id,HttpServletResponse response)throws Exception
    {
        studioService.delete(studio_id);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "studio_findById",method = RequestMethod.POST)
    @ResponseBody
    public Studio findById(@RequestParam("studio_id") int studio_id)
    {
        Studio studio=studioService.findById(studio_id);
        return studio;
    }
    @RequestMapping(value ="studio_update",method = RequestMethod.POST)
    @ResponseBody
    public String update(Studio studio,HttpServletResponse response)throws  Exception
    {
        studioService.update(studio);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "studio_search",method = RequestMethod.POST)
    @ResponseBody
    public List<Studio> search(@RequestParam("studio_name")String studio_name)
    {
        List<Studio> studios=studioService.search(studio_name);
        return studios;
    }
}
