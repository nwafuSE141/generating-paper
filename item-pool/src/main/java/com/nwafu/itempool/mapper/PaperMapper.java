package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.Paper;


public interface PaperMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Paper record);

    int insertSelective(Paper record);

    Paper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}