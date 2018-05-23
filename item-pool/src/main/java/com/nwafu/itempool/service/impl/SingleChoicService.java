package com.nwafu.itempool.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nwafu.itempool.beans.SingleChoic;
import com.nwafu.itempool.mapper.SingleChoicMapper;
import com.nwafu.itempool.module.BaseRequest;
import com.nwafu.itempool.module.UpdateRequest;
import com.nwafu.itempool.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleChoicService implements ItemService {

    @Autowired
    private SingleChoicMapper singleChoicMapper;

    @Override
    public List<SingleChoic> getItems(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<SingleChoic> items = singleChoicMapper.selectAll();
        if (null != items) {
            return items;
        }
        return null;
    }

    @Override
    public void insert(BaseRequest request) {
        SingleChoic singleChoic = new SingleChoic();
        singleChoic.setDifficult(request.getDifficult());
        singleChoic.setCourseId(request.getCourseId());
        singleChoic.setPointId(request.getPointId());
        singleChoic.setQuestion(request.getQuestion());
        singleChoic.setAnswer(request.getAnswer());
        singleChoic.setFaq(request.getFaq());
        singleChoicMapper.insert(singleChoic);
    }

    @Override
    public void delete(Integer id) {
        singleChoicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(String str) {
        String[] ids = str.split(",");
        for (int i = 0; i < ids.length; i++) {
            singleChoicMapper.deleteByPrimaryKey(Integer.parseInt(ids[i]));
        }
    }

    @Override
    public void update(UpdateRequest request) {
        SingleChoic singleChoic = singleChoicMapper.selectByPrimaryKey(request.getId());
        singleChoic.setDifficult(request.getDifficult());
        singleChoic.setCourseId(request.getCourseId());
        singleChoic.setPointId(request.getPointId());
        singleChoic.setQuestion(request.getQuestion());
        singleChoic.setAnswer(request.getAnswer());
        singleChoic.setFaq(request.getFaq());
        singleChoicMapper.updateByPrimaryKeySelective(singleChoic);
    }
}
