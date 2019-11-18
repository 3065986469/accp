package com.accp.mapper;

import com.accp.domain.Chengjiaoxiang;
import com.accp.domain.ChengjiaoxiangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChengjiaoxiangMapper {
    int countByExample(ChengjiaoxiangExample example);

    int deleteByExample(ChengjiaoxiangExample example);

    int deleteByPrimaryKey(Integer cjxid);

    int insert(Chengjiaoxiang record);

    int insertSelective(Chengjiaoxiang record);

    List<Chengjiaoxiang> selectByExample(ChengjiaoxiangExample example);

    Chengjiaoxiang selectByPrimaryKey(Integer cjxid);

    int updateByExampleSelective(@Param("record") Chengjiaoxiang record, @Param("example") ChengjiaoxiangExample example);

    int updateByExample(@Param("record") Chengjiaoxiang record, @Param("example") ChengjiaoxiangExample example);

    int updateByPrimaryKeySelective(Chengjiaoxiang record);

    int updateByPrimaryKey(Chengjiaoxiang record);
}