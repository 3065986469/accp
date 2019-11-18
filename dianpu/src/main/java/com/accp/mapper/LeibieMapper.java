package com.accp.mapper;

import com.accp.domain.Leibie;
import com.accp.domain.LeibieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeibieMapper {
    int countByExample(LeibieExample example);

    int deleteByExample(LeibieExample example);

    int deleteByPrimaryKey(Integer lbid);

    int insert(Leibie record);

    int insertSelective(Leibie record);

    List<Leibie> selectByExample(LeibieExample example);

    Leibie selectByPrimaryKey(Integer lbid);

    int updateByExampleSelective(@Param("record") Leibie record, @Param("example") LeibieExample example);

    int updateByExample(@Param("record") Leibie record, @Param("example") LeibieExample example);

    int updateByPrimaryKeySelective(Leibie record);

    int updateByPrimaryKey(Leibie record);
    
    List<Leibie> selectleibie();
    
    Leibie selectleibiekey(@Param("lbid")Integer lbid);
    
    int deletekey(@Param("lbid")Integer lbid);
    
    
    
}