package com.nwafu.organizepaper.service;

import com.nwafu.itempool.beans.TrueOrFalse;
import com.nwafu.itempool.mapper.TrueOrFalseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
@Service
public class TrueOrFalseService {
    @Autowired
    private TrueOrFalseMapper trueOrFalseMapper;

    public List getTrueOrFalseQuestion(){
        return trueOrFalseMapper.selectAll();
    }

    public TrueOrFalse getTrueOrFalseById(int id) {
        return trueOrFalseMapper.selectByPrimaryKey(id);
    }
}
