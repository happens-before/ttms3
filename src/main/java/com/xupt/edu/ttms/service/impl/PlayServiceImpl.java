package com.xupt.edu.ttms.service.impl;

import com.xupt.edu.ttms.mapper.Data_DictMapper;
import com.xupt.edu.ttms.mapper.PlayMapper;
import com.xupt.edu.ttms.pojo.Data_Dict;
import com.xupt.edu.ttms.pojo.Play;
import com.xupt.edu.ttms.pojo.PlayExample;
import com.xupt.edu.ttms.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhaowanyue
 * @date: 2018/6/8
 * @description:
 */
@Service
public class PlayServiceImpl implements PlayService {
    @Autowired
    PlayMapper playMapper;
    @Autowired
    Data_DictMapper data_dictMapper;
    @Override
    public List<Play> list() {
        PlayExample example=new PlayExample();
        List <Play> plays=playMapper.selectByExample(example);
        setData_Dict(plays);
        return plays;
    }

    @Override
    public void add(Play play) {
        playMapper.insert(play);
    }

    @Override
    public void delete(int play_id) {
        playMapper.deleteByPrimaryKey(play_id);
    }

    public void setData_Dict(List<Play> plays)
    {
        for(Play play:plays)
            setData_Dict(play);
    }

    @Override
    public Play findById(int play_id) {
        return playMapper.selectByPrimaryKey(play_id);
    }

    @Override
    public Play findByName(String play_name) {
        PlayExample example=new PlayExample();
        example.createCriteria().andPlay_nameEqualTo(play_name);
        List<Play> plays=playMapper.selectByExample(example);
        return plays.get(0);
    }

    public void setData_Dict(Play play)
    {
        int dict_id=play.getPlay_type_id();
        Data_Dict data_dict=data_dictMapper.selectByPrimaryKey(dict_id);
        play.setData_dict(data_dict);
    }
//    public void setUser(List<Order> os){
//        for (Order o : os)
//            setUser(o);
//    }
//    public void setUser(Order o){
//        int uid = o.getUid();
//        User u = userService.get(uid);
//        o.setUser(u);
//    }
}
