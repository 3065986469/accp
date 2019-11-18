package com.accp.mapper;

import com.accp.domain.Vipdengji;
import com.accp.domain.VipdengjiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipdengjiMapper {
    int countByExample(VipdengjiExample example);

    int deleteByExample(VipdengjiExample example);

    int deleteByPrimaryKey(Integer djid);

    int insert(Vipdengji record);

    int insertSelective(Vipdengji record);

    List<Vipdengji> selectByExample(VipdengjiExample example);

    Vipdengji selectByPrimaryKey(Integer djid);

    int updateByExampleSelective(@Param("record") Vipdengji record, @Param("example") VipdengjiExample example);

    int updateByExample(@Param("record") Vipdengji record, @Param("example") VipdengjiExample example);

    int updateByPrimaryKeySelective(Vipdengji record);

    int updateByPrimaryKey(Vipdengji record);
}