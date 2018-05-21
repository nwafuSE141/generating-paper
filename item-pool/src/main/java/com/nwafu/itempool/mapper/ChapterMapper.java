package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.Chapter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChapterMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKey(Chapter record);

    List<Chapter> select1();
}