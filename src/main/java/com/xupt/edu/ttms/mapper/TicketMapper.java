package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Ticket;
import com.xupt.edu.ttms.pojo.TicketExample;
import java.util.List;

public interface TicketMapper {
    int deleteByPrimaryKey(Long ticket_id);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    List<Ticket> selectByExample(TicketExample example);

    Ticket selectByPrimaryKey(Long ticket_id);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);
}