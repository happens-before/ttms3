package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.StudioMapper;
import com.xupt.edu.ttms.pojo.Studio;
import com.xupt.edu.ttms.pojo.StudioExample;
import com.xupt.edu.ttms.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/6
 * @description:
 */
@Service
public class StudioServiceImpl implements StudioService{
    @Autowired
    StudioMapper studioMapper;
    @Override
    public List<Studio> list() {
        StudioExample example=new StudioExample();
        example.setOrderByClause("studio_id asc");
        return  studioMapper.selectByExample(example);
    }

    @Override
    public void add(Studio studio) {
        studioMapper.insert(studio);
    }

    @Override
    public void delete(int studio_id) {
        studioMapper.deleteByPrimaryKey(studio_id);
    }

    @Override
    public Studio findById(int studio_id) {
        return studioMapper.selectByPrimaryKey(studio_id);
    }

    @Override
    public void update(Studio studio) {
        studioMapper.updateByPrimaryKeySelective(studio);
    }

    @Override
    public List<Studio> search(String keyword) {
        StudioExample example=new StudioExample();
        example.createCriteria().andStudio_nameLike("%"+keyword+"%");
        List<Studio> studios=studioMapper.selectByExample(example);
        return studios;
    }

    @Override
    public Studio findByName(String studio_name) {
        StudioExample example=new StudioExample();
        example.createCriteria().andStudio_nameEqualTo(studio_name);
        List<Studio> studios=studioMapper.selectByExample(example);
        return studios.get(0);
    }
}
