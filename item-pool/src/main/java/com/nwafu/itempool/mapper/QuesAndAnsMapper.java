package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.QuesAndAns;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuesAndAnsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(QuesAndAns record);

    int insertSelective(QuesAndAns record);

    QuesAndAns selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuesAndAns record);

    int updateByPrimaryKey(QuesAndAns record);
}