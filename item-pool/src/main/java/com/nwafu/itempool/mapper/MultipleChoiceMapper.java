package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.MultipleChoice;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MultipleChoiceMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MultipleChoice record);

    int insertSelective(MultipleChoice record);

    MultipleChoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MultipleChoice record);

    int updateByPrimaryKey(MultipleChoice record);

    List<MultipleChoice> selectAll();
}