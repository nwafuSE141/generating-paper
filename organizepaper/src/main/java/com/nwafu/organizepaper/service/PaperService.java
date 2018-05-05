package com.nwafu.organizepaper.service;

import com.nwafu.itempool.beans.Paper;
import com.nwafu.itempool.mapper.PaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

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


    public List<Paper> getPaperWithUserId(int userId) {
        List<Paper> list = paperMapper.selectWithUserId(userId);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Paper paper : list){
            String data = dateFormat.format(paper.getCreateTime());
            paper.setCreateTimeFormat(data);
        }

        return list;
    }
}
