package com.xupt.edu.ttms.controller;

import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.ttms.pojo.Play;
import com.xupt.edu.ttms.pojo.Schedule;
import com.xupt.edu.ttms.pojo.Seat;
import com.xupt.edu.ttms.pojo.Studio;
import com.xupt.edu.ttms.service.PlayService;
import com.xupt.edu.ttms.service.ScheduleService;
import com.xupt.edu.ttms.service.SeatService;
import com.xupt.edu.ttms.service.StudioService;
import com.xupt.edu.ttms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/8
 * @description:
 */
@Controller
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;
    @Autowired
    PlayService playService;
    @Autowired
    StudioService studioService;
    @Autowired
    SeatService seatService;
    @RequestMapping("schedule_list")
    @ResponseBody
    public List<Schedule> list()
    {

        List<Schedule> schedules=scheduleService.list();
        return schedules;
    }
    @RequestMapping(value = "schedule_add",method = RequestMethod.POST)
    @ResponseBody
    public String add(Schedule schedule, @RequestParam("play_name")String play_name,
                      @RequestParam("studio_name")String studio_name,
                      @RequestParam("sched_time") Timestamp sched_time,
                      @RequestParam("sched_ticket_price") BigDecimal sched_ticket_price, HttpServletResponse response)
            throws Exception
    {

        schedule.setSched_time(sched_time);
        schedule.setSched_ticket_price(sched_ticket_price);
        Play play=playService.findByName(play_name);
        schedule.setPlay_id(play.getPlay_id());
        Studio studio=studioService.findByName(studio_name);
        schedule.setStudio_id(studio.getStudio_id());

        scheduleService.add(schedule);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "schedule_delete",method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestParam("sched_id")int sched_id, HttpServletResponse response) throws Exception
    {
        scheduleService.delete(sched_id);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "schedule_update",method = RequestMethod.POST)
    @ResponseBody
    public String update(Schedule schedule, @RequestParam("play_name")String play_name,
                         @RequestParam("studio_name")String studio_name, HttpServletResponse response) throws Exception
    {
        Play play=playService.findByName(play_name);
        schedule.setPlay_id(play.getPlay_id());
        Studio studio=studioService.findByName(studio_name);
        schedule.setStudio_id(studio.getStudio_id());

        scheduleService.update(schedule);
        JSONObject result=new JSONObject();
        result.put("success","ok");
        ResponseUtil.write(response,result);
        return null;
    }
    @RequestMapping(value = "schedule_listByPlay_id",method = RequestMethod.POST)
    @ResponseBody
    public List<Schedule> list2(@RequestParam("play_id") int play_id){
        List<Schedule>schedules=scheduleService.list(play_id);
        return schedules;
    }
}
