package com.xupt.edu.ttms.mapper;

import com.xupt.edu.ttms.pojo.Seat;
import com.xupt.edu.ttms.pojo.SeatExample;
import java.util.List;

public interface SeatMapper {
    int deleteByPrimaryKey(Integer seat_id);

    int insert(Seat record);

    int insertSelective(Seat record);

    List<Seat> selectByExample(SeatExample example);

    Seat selectByPrimaryKey(Integer seat_id);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}