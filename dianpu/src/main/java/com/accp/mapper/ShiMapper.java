package com.accp.mapper;

import com.accp.domain.Shi;
import com.accp.domain.ShiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiMapper {
    int countByExample(ShiExample example);

    int deleteByExample(ShiExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Shi record);

    int insertSelective(Shi record);

    List<Shi> selectByExample(ShiExample example);

    Shi selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Shi record, @Param("example") ShiExample example);

    int updateByExample(@Param("record") Shi record, @Param("example") ShiExample example);

    int updateByPrimaryKeySelective(Shi record);

    int updateByPrimaryKey(Shi record);
}