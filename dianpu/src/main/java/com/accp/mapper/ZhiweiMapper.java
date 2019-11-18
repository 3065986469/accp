package com.accp.mapper;

import com.accp.domain.Zhiwei;
import com.accp.domain.ZhiweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhiweiMapper {
    int countByExample(ZhiweiExample example);

    int deleteByExample(ZhiweiExample example);

    int deleteByPrimaryKey(Integer zwid);

    int insert(Zhiwei record);

    int insertSelective(Zhiwei record);

    List<Zhiwei> selectByExample(ZhiweiExample example);

    Zhiwei selectByPrimaryKey(Integer zwid);

    int updateByExampleSelective(@Param("record") Zhiwei record, @Param("example") ZhiweiExample example);

    int updateByExample(@Param("record") Zhiwei record, @Param("example") ZhiweiExample example);

    int updateByPrimaryKeySelective(Zhiwei record);

    int updateByPrimaryKey(Zhiwei record);
}