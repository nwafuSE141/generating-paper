package com.nwafu.organizepaper.service;

import com.nwafu.itempool.beans.Paper;
import com.nwafu.itempool.mapper.PaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TinChiWay
 * @data 2018/5/2
 */
@Service
public class PaperService {

    @Autowired
    private PaperMapper paperMapper;

    public int deleteByPrimaryKey(Integer id){
        return paperMapper.deleteByPrimaryKey(id);
    }

    public int insertSelective(Paper paper){
        return paperMapper.insertSelective(paper);
    }


}
