package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.TrueOrFalse;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrueOrFalseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TrueOrFalse record);

    int insertSelective(TrueOrFalse record);

    TrueOrFalse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrueOrFalse record);

    int updateByPrimaryKey(TrueOrFalse record);

    List<TrueOrFalse> selectAll();
}