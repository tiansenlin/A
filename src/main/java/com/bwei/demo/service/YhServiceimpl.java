package com.bwei.demo.service;

import com.bwei.demo.entity.Bumen;
import com.bwei.demo.entity.Jiaose;
import com.bwei.demo.entity.Yh;
import com.bwei.demo.mapper.YhMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 田森林 on 2019/3/18.
 */
@Service
public class YhServiceimpl implements IYhService{
@Autowired
    private YhMapper yhMapper;

    @Override
    public List<Yh> getlist(Map<Object, Object> map) {
        return yhMapper.getlist(map);
    }

    @Override
    public int count(String mohu) {
        return yhMapper.count(mohu);
    }

    @Override
    public void add(Yh yh) {
        yhMapper.add(yh);
    }

    @Override
    public List<Jiaose> getjlist() {
        return yhMapper.getjlist();
    }

    @Override
    public List<Bumen> getblist() {
        return yhMapper.getblist();
    }

    @Override
    public void del(int yid) {
        yhMapper.del(yid);
    }


}
