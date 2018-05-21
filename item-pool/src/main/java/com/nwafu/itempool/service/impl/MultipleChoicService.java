package com.nwafu.itempool.service.impl;

import com.nwafu.itempool.beans.MultipleChoice;
import com.nwafu.itempool.mapper.MultipleChoiceMapper;
import com.nwafu.itempool.module.BaseRequest;
import com.nwafu.itempool.module.UpdateRequest;
import com.nwafu.itempool.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultipleChoicService implements ItemService {

    @Autowired
    private MultipleChoiceMapper multipleChoiceMapper;

    @Override
    public List getItems() {
        List<MultipleChoice> items = multipleChoiceMapper.selectAll();
        if (null != items) {
            return items;
        }
        return null;
    }

    @Override
    public void insert(BaseRequest request) {
        MultipleChoice multipleChoic = new MultipleChoice();
        multipleChoic.setDifficult(request.getDifficult());
        multipleChoic.setCourseId(request.getCourseId());
        multipleChoic.setPointId(request.getPointId());
        multipleChoic.setQuestion(request.getQuestion());
        multipleChoic.setAnswer(request.getAnswer());
        multipleChoic.setFaq(request.getFaq());
        multipleChoiceMapper.insert(multipleChoic);
    }

    @Override
    public void delete(Integer id) {
        multipleChoiceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(String str) {
        String[] ids = str.split(",");
        for (int i = 0; i < ids.length; i++) {
            multipleChoiceMapper.deleteByPrimaryKey(Integer.parseInt(ids[i]));
        }
    }

    @Override
    public void update(UpdateRequest request) {

    }
}
