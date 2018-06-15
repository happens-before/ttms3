package com.xupt.edu.ttms.service;

import com.xupt.edu.ttms.pojo.Studio;

import java.util.List;

public interface StudioService {
    List<Studio> list();
    void add(Studio studio);
    void delete(int studio_id);
    Studio findById(int studio_id);
    void update(Studio studio);
    List<Studio> search(String keyword);
    Studio findByName(String studio_name);
}
