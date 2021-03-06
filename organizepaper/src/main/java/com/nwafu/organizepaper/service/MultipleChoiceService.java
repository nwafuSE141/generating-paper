package com.nwafu.organizepaper.service;

import com.nwafu.itempool.beans.MultipleChoice;
import com.nwafu.itempool.beans.SingleChoic;
import com.nwafu.itempool.mapper.MultipleChoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
@Service
public class MultipleChoiceService {

    @Autowired
    private MultipleChoiceMapper multipleChoiceMapper;


    public List getMultipleQuestions() {
        List<MultipleChoice> list = multipleChoiceMapper.selectAll();
        List<Map> listMap = new ArrayList<>();
        for (MultipleChoice multipleChoice : list){
            Map map = new HashMap();
            map.put("id", multipleChoice.getId());
            map.put("question", multipleChoice.getQuestion());
            map.put("answer", multipleChoice.getAnswer());
            map.put("score",multipleChoice.getScore());
            map.put("usageCount",multipleChoice.getUsageCount());
            map.put("faq",multipleChoice.getFaq());
            map.put("optioncontent",multipleChoice.getA()+multipleChoice.getB()+ multipleChoice.getC()+multipleChoice.getD()+multipleChoice.getE());
            listMap.add(map);
        }
        return listMap;

    }

    public MultipleChoice getMultipleById(int id) {
        return multipleChoiceMapper.selectByPrimaryKey(id);
    }
}
