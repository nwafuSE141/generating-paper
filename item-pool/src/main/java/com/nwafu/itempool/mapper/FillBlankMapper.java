package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.FillBlank;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FillBlankMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(FillBlank record);

    int insertSelective(FillBlank record);

    FillBlank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FillBlank record);

    int updateByPrimaryKey(FillBlank record);

    List<FillBlank> selectAll();
}