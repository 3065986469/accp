package com.accp.mapper;

import com.accp.domain.Chongzhi;
import com.accp.domain.ChongzhiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChongzhiMapper {
    int countByExample(ChongzhiExample example);

    int deleteByExample(ChongzhiExample example);

    int deleteByPrimaryKey(Integer czid);

    int insert(Chongzhi record);

    int insertSelective(Chongzhi record);

    List<Chongzhi> selectByExample(ChongzhiExample example);

    Chongzhi selectByPrimaryKey(Integer czid);

    int updateByExampleSelective(@Param("record") Chongzhi record, @Param("example") ChongzhiExample example);

    int updateByExample(@Param("record") Chongzhi record, @Param("example") ChongzhiExample example);

    int updateByPrimaryKeySelective(Chongzhi record);

    int updateByPrimaryKey(Chongzhi record);
}