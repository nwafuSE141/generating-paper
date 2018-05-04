package com.nwafu.organizepaper.service;

import com.nwafu.itempool.mapper.QuesAndAnsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
@Service
public class QuesAndAnsService {
    @Autowired
    private QuesAndAnsMapper quesAndAnsMapper;

    public List getQuesAndAnsQuestions(){
        return quesAndAnsMapper.selectAll();
    }

}
