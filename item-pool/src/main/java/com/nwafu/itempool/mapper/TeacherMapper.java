package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.Teacher;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    int insert(Teacher record);

    int insertSelective(Teacher record);

}