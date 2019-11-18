package com.accp.mapper;

import com.accp.domain.Shengfen;
import com.accp.domain.ShengfenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShengfenMapper {
    int countByExample(ShengfenExample example);

    int deleteByExample(ShengfenExample example);

    int deleteByPrimaryKey(Integer sfid);

    int insert(Shengfen record);

    int insertSelective(Shengfen record);

    List<Shengfen> selectByExample(ShengfenExample example);

    Shengfen selectByPrimaryKey(Integer sfid);

    int updateByExampleSelective(@Param("record") Shengfen record, @Param("example") ShengfenExample example);

    int updateByExample(@Param("record") Shengfen record, @Param("example") ShengfenExample example);

    int updateByPrimaryKeySelective(Shengfen record);

    int updateByPrimaryKey(Shengfen record);
}