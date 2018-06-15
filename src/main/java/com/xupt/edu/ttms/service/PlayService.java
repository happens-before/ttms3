package com.xupt.edu.ttms.service;

import com.xupt.edu.ttms.pojo.Play;

import java.util.List;

public interface PlayService {
    List<Play> list();
    void add(Play play);
    void delete(int play_id);
    Play findById(int play_id);
    Play findByName(String play_name);
}
