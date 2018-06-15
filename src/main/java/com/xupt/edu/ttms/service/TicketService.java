package com.xupt.edu.ttms.service;

import com.xupt.edu.ttms.pojo.Seat;
import com.xupt.edu.ttms.pojo.Ticket;

import java.util.List;

public interface TicketService {
    void update(Ticket ticket);
    void add(Ticket ticket);
    List<List<Ticket>> list(int studio_id,int sched_id);
    Ticket findById(int seat_id,int sched_id);
    Ticket get(int seat_id,int sched_id);
}
