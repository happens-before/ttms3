package com.xupt.edu.ttms.controller;

import com.xupt.edu.ttms.pojo.Seat;
import com.xupt.edu.ttms.pojo.Studio;
import com.xupt.edu.ttms.service.SeatService;
import com.xupt.edu.ttms.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/8
 * @description:
 */
@Controller
public class SeatController {
    @Autowired
    SeatService seatService;
    @Autowired
    StudioService studioService;
    @RequestMapping(value = "seat_listByStudio_id",method = RequestMethod.POST)
    @ResponseBody
    public List<Seat> list(@RequestParam("studio_id") int studio_id){
        //Studio play=studioService.findById(studio_id);
        List<Seat> seats=seatService.list(studio_id);
        return seats;
    }
    @RequestMapping(value = "seat_update",method = RequestMethod.POST)
    @ResponseBody
    public Seat update(Seat seat)
    {
        seatService.update(seat);
        return  seat;
    }
    @RequestMapping(value = "seat_add" ,method = RequestMethod.POST)
    @ResponseBody
    public Seat add(Seat seat)
    {
        seatService.add(seat);
        return seat;
    }
}
