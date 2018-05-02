package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.QuestionType;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionTypeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionType record);

    int insertSelective(QuestionType record);

    QuestionType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionType record);

    int updateByPrimaryKey(QuestionType record);
}