package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.PaperSnapshot;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperSnapshotMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PaperSnapshot record);

    int insertSelective(PaperSnapshot record);

    PaperSnapshot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperSnapshot record);

    int updateByPrimaryKey(PaperSnapshot record);
}