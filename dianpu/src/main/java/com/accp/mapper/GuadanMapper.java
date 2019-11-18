package com.accp.mapper;

import com.accp.domain.Guadan;
import com.accp.domain.GuadanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuadanMapper {
    int countByExample(GuadanExample example);

    int deleteByExample(GuadanExample example);

    int deleteByPrimaryKey(Integer gdid);

    int insert(Guadan record);

    int insertSelective(Guadan record);

    List<Guadan> selectByExample(GuadanExample example);

    Guadan selectByPrimaryKey(Integer gdid);

    int updateByExampleSelective(@Param("record") Guadan record, @Param("example") GuadanExample example);

    int updateByExample(@Param("record") Guadan record, @Param("example") GuadanExample example);

    int updateByPrimaryKeySelective(Guadan record);

    int updateByPrimaryKey(Guadan record);
}