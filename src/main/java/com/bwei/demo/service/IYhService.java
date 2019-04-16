package com.bwei.demo.service;

import com.bwei.demo.entity.Bumen;
import com.bwei.demo.entity.Jiaose;
import com.bwei.demo.entity.Yh;

import java.util.List;
import java.util.Map;

/**
 * Created by 田森林 on 2019/3/18.
 */
public interface IYhService {
    List<Yh> getlist(Map<Object, Object> map);

    int count(String mohu);

    void add(Yh yh);


    List<Jiaose> getjlist();

    List<Bumen> getblist();

    void del(int yid);
}
