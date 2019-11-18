package com.accp.mapper;

import com.accp.domain.Yuangong;
import com.accp.domain.YuangongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YuangongMapper {
    int countByExample(YuangongExample example);

    int deleteByExample(YuangongExample example);

    int deleteByPrimaryKey(Integer ygid);

    int insert(Yuangong record);

    int insertSelective(Yuangong record);

    List<Yuangong> selectByExample(YuangongExample example);

    Yuangong selectByPrimaryKey(Integer ygid);

    int updateByExampleSelective(@Param("record") Yuangong record, @Param("example") YuangongExample example);

    int updateByExample(@Param("record") Yuangong record, @Param("example") YuangongExample example);

    int updateByPrimaryKeySelective(Yuangong record);

    int updateByPrimaryKey(Yuangong record);
}