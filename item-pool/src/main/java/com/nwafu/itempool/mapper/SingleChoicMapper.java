package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.SingleChoic;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingleChoicMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SingleChoic record);

    int insertSelective(SingleChoic record);

    SingleChoic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SingleChoic record);

    int updateByPrimaryKey(SingleChoic record);
}