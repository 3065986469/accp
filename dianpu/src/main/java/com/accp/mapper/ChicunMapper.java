package com.accp.mapper;

import com.accp.domain.Chicun;
import com.accp.domain.ChicunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChicunMapper {
    int countByExample(ChicunExample example);

    int deleteByExample(ChicunExample example);

    int deleteByPrimaryKey(Integer ccid);

    int insert(Chicun record);

    int insertSelective(Chicun record);

    List<Chicun> selectByExample(ChicunExample example);

    Chicun selectByPrimaryKey(Integer ccid);

    int updateByExampleSelective(@Param("record") Chicun record, @Param("example") ChicunExample example);

    int updateByExample(@Param("record") Chicun record, @Param("example") ChicunExample example);

    int updateByPrimaryKeySelective(Chicun record);

    int updateByPrimaryKey(Chicun record);
}