package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.SeatMapper;
import com.xupt.edu.ttms.pojo.*;
import com.xupt.edu.ttms.service.ScheduleService;
import com.xupt.edu.ttms.service.SeatService;
import com.xupt.edu.ttms.service.StudioService;
import com.xupt.edu.ttms.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/8
 * @description:
 */
@Service
public class SeatServiceImpl implements SeatService{
    @Autowired
    SeatMapper seatMapper;
    @Autowired
    StudioService studioService;


    @Override
    public List<Seat> list(int studio_id) {
        SeatExample example=new SeatExample();
        example.createCriteria().andStudio_idEqualTo(studio_id);
        List<Seat> seats=seatMapper.selectByExample(example);
        setStudio(seats);
        return seats;
    }

    @Override
    public Seat findById(int seat_id) {
        Seat seat=seatMapper.selectByPrimaryKey(seat_id);
        return seat;
    }

    public void setStudio(List<Seat>seats)
    {
        for(Seat seat:seats )
            setStudio(seat);
    }
    public void setStudio(Seat seat)
    {
        int studio_id=seat.getStudio_id();
        Studio studio=studioService.findById(studio_id);
        seat.setStudio(studio);
    }

    @Override
    public void update(Seat seat) {
        seatMapper.updateByPrimaryKeySelective(seat);
    }

    @Override
    public void add(Seat seat) {
        seatMapper.insert(seat);
    }

    @Override
    public Seat list(int studio_id, int seat_row, int seat_column) {
        SeatExample example=new SeatExample();
        example.createCriteria().andStudio_idEqualTo(studio_id).andSeat_rowEqualTo(seat_row).andSeat_columnEqualTo(seat_column);
        List<Seat> seats=seatMapper.selectByExample(example);
        return seats.get(0);
    }
}
