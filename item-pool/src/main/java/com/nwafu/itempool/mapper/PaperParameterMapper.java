package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.PaperParameter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperParameterMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PaperParameter record);

    int insertSelective(PaperParameter record);

    PaperParameter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperParameter record);

    int updateByPrimaryKey(PaperParameter record);
}