package com.nwafu.itempool.mapper;

import com.nwafu.itempool.beans.PaperInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PaperInfo record);

    int insertSelective(PaperInfo record);

    PaperInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperInfo record);

    int updateByPrimaryKey(PaperInfo record);

    List getPaperInfo(Integer paperId);

    int insertList(@Param("paperInfoList") List<PaperInfo> paperInfoList);
}