package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.Course;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}