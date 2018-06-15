package com.xupt.edu.ttms.service;

import com.xupt.edu.ttms.pojo.Seat;
import com.xupt.edu.ttms.pojo.Ticket;

import java.util.List;

public interface SeatService {
    List<Seat> list(int studio_id);
    void update(Seat seat);
    void add(Seat seat);
    Seat findById(int seat_id);
    Seat list(int studio_id,int seat_row,int seat_column);

}
