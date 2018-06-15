package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.TicketMapper;
import com.xupt.edu.ttms.pojo.Seat;
import com.xupt.edu.ttms.pojo.Ticket;
import com.xupt.edu.ttms.pojo.TicketExample;
import com.xupt.edu.ttms.service.SeatService;
import com.xupt.edu.ttms.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/12
 * @description:
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketMapper ticketMapper;
    @Autowired
    SeatService seatService;

    @Override
    public void update(Ticket ticket) {
        ticketMapper.updateByPrimaryKeySelective(ticket);
    }

//    @Override
//    public Ticket list(int seat_id) {
//        TicketExample example=new TicketExample();
//        example.createCriteria().andSeat_idEqualTo(seat_id);
//        List<Ticket> tickets=ticketMapper.selectByExample(example);
//        return tickets.get(0);
//    }

    @Override
    public Ticket get(int seat_id, int sched_id) {
        TicketExample example=new TicketExample();
        example.createCriteria().andSeat_idEqualTo(seat_id).andSched_idEqualTo(sched_id);
        List<Ticket> tickets=ticketMapper.selectByExample(example);
        setSeat(tickets);
        return tickets.get(0);
    }

    @Override
    public List<List<Ticket>> list(int studio_id,int sched_id) {
        List<Ticket> tickets=new ArrayList<Ticket>();
        List<List<Ticket>> ticketlist=new ArrayList<List<Ticket>>();
        List<Seat> seats=seatService.list(studio_id);
        for (Seat seat:seats) {
            TicketExample example=new TicketExample();
            int seat_id=seat.getSeat_id();
            example.createCriteria().andSeat_idEqualTo(seat_id).andSched_idEqualTo(sched_id);
            tickets=ticketMapper.selectByExample(example);
            setSeat(tickets);
            ticketlist.add(tickets);
        }
        return ticketlist;
    }
    public void setSeat(List<Ticket>tickets)
    {
        for(Ticket ticket:tickets )
            setSeat(ticket);
    }
    public void setSeat(Ticket ticket)
    {
        int seat_id=ticket.getSeat_id();
        Seat seat=seatService.findById(seat_id);
        ticket.setSeat(seat);
    }

    @Override
    public void add(Ticket ticket) {
        ticketMapper.insert(ticket);
    }

    @Override
    public Ticket findById(int seat_id ,int sched_id) {
        TicketExample example=new TicketExample();
        example.createCriteria().andSeat_idEqualTo(seat_id).andSched_idEqualTo(sched_id);
        List<Ticket> tickets=ticketMapper.selectByExample(example);
        return tickets.get(0);
    }
}
