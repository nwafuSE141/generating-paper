package com.nwafu.organizepaper.service;

import com.nwafu.itempool.mapper.FillBlankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
@Service
public class FillBlankService {
    @Autowired
    private FillBlankMapper fillBlankMapper;

    public List getFillBlankQuestion(){
        return fillBlankMapper.selectAll();
    }
}
