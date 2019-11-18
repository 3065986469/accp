package com.accp.mapper;

import com.accp.domain.Yanseleibie;
import com.accp.domain.YanseleibieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YanseleibieMapper {
    int countByExample(YanseleibieExample example);

    int deleteByExample(YanseleibieExample example);

    int deleteByPrimaryKey(Integer yslbid);

    int insert(Yanseleibie record);

    int insertSelective(Yanseleibie record);

    List<Yanseleibie> selectByExample(YanseleibieExample example);

    Yanseleibie selectByPrimaryKey(Integer yslbid);

    int updateByExampleSelective(@Param("record") Yanseleibie record, @Param("example") YanseleibieExample example);

    int updateByExample(@Param("record") Yanseleibie record, @Param("example") YanseleibieExample example);

    int updateByPrimaryKeySelective(Yanseleibie record);

    int updateByPrimaryKey(Yanseleibie record);
}