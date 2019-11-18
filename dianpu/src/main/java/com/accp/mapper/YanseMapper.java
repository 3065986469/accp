package com.accp.mapper;

import com.accp.domain.Yanse;
import com.accp.domain.YanseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YanseMapper {
    int countByExample(YanseExample example);

    int deleteByExample(YanseExample example);

    int deleteByPrimaryKey(Integer ysid);

    int insert(Yanse record);

    int insertSelective(Yanse record);

    List<Yanse> selectByExample(YanseExample example);

    Yanse selectByPrimaryKey(Integer ysid);

    int updateByExampleSelective(@Param("record") Yanse record, @Param("example") YanseExample example);

    int updateByExample(@Param("record") Yanse record, @Param("example") YanseExample example);

    int updateByPrimaryKeySelective(Yanse record);

    int updateByPrimaryKey(Yanse record);
}