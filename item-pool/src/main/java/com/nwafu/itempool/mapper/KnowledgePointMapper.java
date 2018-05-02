package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.KnowledgePoint;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgePointMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(KnowledgePoint record);

    int insertSelective(KnowledgePoint record);

    KnowledgePoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KnowledgePoint record);

    int updateByPrimaryKeyWithBLOBs(KnowledgePoint record);

    int updateByPrimaryKey(KnowledgePoint record);
}