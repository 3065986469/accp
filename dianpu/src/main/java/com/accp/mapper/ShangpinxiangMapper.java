package com.accp.mapper;

import com.accp.domain.Shangpinxiang;
import com.accp.domain.ShangpinxiangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShangpinxiangMapper {
    int countByExample(ShangpinxiangExample example);

    int deleteByExample(ShangpinxiangExample example);

    int deleteByPrimaryKey(Integer spxid);

    int insert(Shangpinxiang record);

    int insertSelective(Shangpinxiang record);

    List<Shangpinxiang> selectByExample(ShangpinxiangExample example);

    Shangpinxiang selectByPrimaryKey(Integer spxid);

    int updateByExampleSelective(@Param("record") Shangpinxiang record, @Param("example") ShangpinxiangExample example);

    int updateByExample(@Param("record") Shangpinxiang record, @Param("example") ShangpinxiangExample example);

    int updateByPrimaryKeySelective(Shangpinxiang record);

    int updateByPrimaryKey(Shangpinxiang record);
}