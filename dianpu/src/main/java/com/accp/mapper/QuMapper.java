package com.accp.mapper;

import com.accp.domain.Qu;
import com.accp.domain.QuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuMapper {
    int countByExample(QuExample example);

    int deleteByExample(QuExample example);

    int deleteByPrimaryKey(Integer qid);

    int insert(Qu record);

    int insertSelective(Qu record);

    List<Qu> selectByExample(QuExample example);

    Qu selectByPrimaryKey(Integer qid);

    int updateByExampleSelective(@Param("record") Qu record, @Param("example") QuExample example);

    int updateByExample(@Param("record") Qu record, @Param("example") QuExample example);

    int updateByPrimaryKeySelective(Qu record);

    int updateByPrimaryKey(Qu record);
}