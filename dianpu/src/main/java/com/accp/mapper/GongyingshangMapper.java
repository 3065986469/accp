package com.accp.mapper;

import com.accp.domain.Gongyingshang;
import com.accp.domain.GongyingshangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongyingshangMapper {
    int countByExample(GongyingshangExample example);

    int deleteByExample(GongyingshangExample example);

    int deleteByPrimaryKey(Integer gysid);

    int insert(Gongyingshang record);

    int insertSelective(Gongyingshang record);

    List<Gongyingshang> selectByExample(GongyingshangExample example);

    Gongyingshang selectByPrimaryKey(Integer gysid);

    int updateByExampleSelective(@Param("record") Gongyingshang record, @Param("example") GongyingshangExample example);

    int updateByExample(@Param("record") Gongyingshang record, @Param("example") GongyingshangExample example);

    int updateByPrimaryKeySelective(Gongyingshang record);

    int updateByPrimaryKey(Gongyingshang record);
}