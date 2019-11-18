package com.accp.mapper;

import com.accp.domain.Caigouxiang;
import com.accp.domain.CaigouxiangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaigouxiangMapper {
    int countByExample(CaigouxiangExample example);

    int deleteByExample(CaigouxiangExample example);

    int deleteByPrimaryKey(Integer cgxid);

    int insert(Caigouxiang record);

    int insertSelective(Caigouxiang record);

    List<Caigouxiang> selectByExample(CaigouxiangExample example);

    Caigouxiang selectByPrimaryKey(Integer cgxid);

    int updateByExampleSelective(@Param("record") Caigouxiang record, @Param("example") CaigouxiangExample example);

    int updateByExample(@Param("record") Caigouxiang record, @Param("example") CaigouxiangExample example);

    int updateByPrimaryKeySelective(Caigouxiang record);

    int updateByPrimaryKey(Caigouxiang record);
}