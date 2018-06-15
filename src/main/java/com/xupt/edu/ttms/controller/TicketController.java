package com.xupt.edu.ttms.controller;

import com.xupt.edu.ttms.pojo.Seat;
import com.xupt.edu.ttms.pojo.Ticket;
import com.xupt.edu.ttms.service.SeatService;
import com.xupt.edu.ttms.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/12
 * @description:
 */
@Controller
public class TicketController {
    @Autowired
    TicketService ticketService;
    @Autowired
    SeatService seatService;
    @RequestMapping(value = "ticket_listByStudio_id",method = RequestMethod.POST)
    @ResponseBody
    public List<List<Ticket>> list(@RequestParam("studio_id") int studio_id,@RequestParam("sched_id") int sched_id)
    {
        List<List<Ticket>>  tickets=ticketService.list(studio_id,sched_id);
        return tickets;
    }
    @RequestMapping(value = "ticket_update",method = RequestMethod.POST)
    @ResponseBody
    public Ticket update(@RequestParam("sched_id") int sched_id,@RequestParam("studio_id")int studio_id,@RequestParam("seat_row") int seat_row,
                         @RequestParam("seat_column")int seat_column)
    {
        Seat seat=seatService.list(studio_id,seat_row,seat_column);
        Ticket ticket=ticketService.findById(seat.getSeat_id(),sched_id);
        ticket.setTicket_status(9);
        ticketService.update(ticket);
        ticket=ticketService.get(seat.getSeat_id(),sched_id);
        return ticket;
    }
}
