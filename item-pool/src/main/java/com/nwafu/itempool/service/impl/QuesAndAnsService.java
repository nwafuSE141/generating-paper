package com.nwafu.itempool.service.impl;

import com.github.pagehelper.PageHelper;
import com.nwafu.itempool.beans.QuesAndAns;
import com.nwafu.itempool.mapper.QuesAndAnsMapper;
import com.nwafu.itempool.module.BaseRequest;
import com.nwafu.itempool.module.UpdateRequest;
import com.nwafu.itempool.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuesAndAnsService implements ItemService {

    @Autowired
    private QuesAndAnsMapper quesAndAnsMapper;

    @Override
    public List getItems(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<QuesAndAns> items = quesAndAnsMapper.selectAll();
        if (null != items) {
            return items;
        }
        return null;
    }

    @Override
    public void insert(BaseRequest request) {
        QuesAndAns quesAndAns = new QuesAndAns();
        quesAndAns.setDifficult(request.getDifficult());
        quesAndAns.setCourseId(request.getCourseId());
        quesAndAns.setPointId(request.getPointId());
        quesAndAns.setQuestion(request.getQuestion());
        quesAndAns.setAnswer(request.getAnswer());
        quesAndAns.setFaq(request.getFaq());
        quesAndAnsMapper.insert(quesAndAns);
    }

    @Override
    public void delete(Integer id) {
        quesAndAnsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(String str) {
        String[] ids = str.split(",");
        for (int i = 0; i < ids.length; i++) {
            quesAndAnsMapper.deleteByPrimaryKey(Integer.parseInt(ids[i]));
        }
    }

    @Override
    public void update(UpdateRequest request) {
        QuesAndAns quesAndAns = quesAndAnsMapper.selectByPrimaryKey(request.getId());
        quesAndAns.setDifficult(request.getDifficult());
        quesAndAns.setCourseId(request.getCourseId());
        quesAndAns.setPointId(request.getPointId());
        quesAndAns.setQuestion(request.getQuestion());
        quesAndAns.setAnswer(request.getAnswer());
        quesAndAns.setFaq(request.getFaq());
        quesAndAnsMapper.updateByPrimaryKeySelective(quesAndAns);
    }
}
