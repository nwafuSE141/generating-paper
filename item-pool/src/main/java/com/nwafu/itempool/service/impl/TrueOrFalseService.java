package com.nwafu.itempool.service.impl;

import com.nwafu.itempool.beans.TrueOrFalse;
import com.nwafu.itempool.mapper.TrueOrFalseMapper;
import com.nwafu.itempool.module.BaseRequest;
import com.nwafu.itempool.module.UpdateRequest;
import com.nwafu.itempool.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrueOrFalseService implements ItemService {

    @Autowired
    private TrueOrFalseMapper trueOrFalseMapper;
    @Override
    public List getItems() {
        List<TrueOrFalse> items = trueOrFalseMapper.selectAll();
        if (null != items) {
            return items;
        }
        return null;
    }

    @Override
    public void insert(BaseRequest request) {
        TrueOrFalse trueOrFalse = new TrueOrFalse();
        trueOrFalse.setDifficult(request.getDifficult());
        trueOrFalse.setCourseId(request.getCourseId());
        trueOrFalse.setPointId(request.getPointId());
        trueOrFalse.setQuestion(request.getQuestion());
        trueOrFalse.setAnswer(request.getAnswer());
        trueOrFalse.setFaq(request.getFaq());
        trueOrFalseMapper.insert(trueOrFalse);
    }

    @Override
    public void delete(Integer id) {
        trueOrFalseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(String str) {
        String[] ids = str.split(",");
        for (int i = 0; i < ids.length; i++) {
            trueOrFalseMapper.deleteByPrimaryKey(Integer.parseInt(ids[i]));
        }
    }

    @Override
    public void update(UpdateRequest request) {
        TrueOrFalse trueOrFalse = trueOrFalseMapper.selectByPrimaryKey(request.getId());
        trueOrFalse.setDifficult(request.getDifficult());
        trueOrFalse.setCourseId(request.getCourseId());
        trueOrFalse.setPointId(request.getPointId());
        trueOrFalse.setQuestion(request.getQuestion());
        trueOrFalse.setAnswer(request.getAnswer());
        trueOrFalse.setFaq(request.getFaq());
        trueOrFalseMapper.updateByPrimaryKeySelective(trueOrFalse);
    }
}
