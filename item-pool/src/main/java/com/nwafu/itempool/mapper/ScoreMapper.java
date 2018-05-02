package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.Score;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {

    int insert(Score record);

    int insertSelective(Score record);

}