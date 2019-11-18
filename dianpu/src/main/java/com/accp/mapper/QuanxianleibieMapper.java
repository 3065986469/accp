package com.accp.mapper;

import com.accp.domain.Quanxianleibie;
import com.accp.domain.QuanxianleibieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuanxianleibieMapper {
    int countByExample(QuanxianleibieExample example);

    int deleteByExample(QuanxianleibieExample example);

    int deleteByPrimaryKey(Integer qxlb);

    int insert(Quanxianleibie record);

    int insertSelective(Quanxianleibie record);

    List<Quanxianleibie> selectByExample(QuanxianleibieExample example);

    Quanxianleibie selectByPrimaryKey(Integer qxlb);

    int updateByExampleSelective(@Param("record") Quanxianleibie record, @Param("example") QuanxianleibieExample example);

    int updateByExample(@Param("record") Quanxianleibie record, @Param("example") QuanxianleibieExample example);

    int updateByPrimaryKeySelective(Quanxianleibie record);

    int updateByPrimaryKey(Quanxianleibie record);
}