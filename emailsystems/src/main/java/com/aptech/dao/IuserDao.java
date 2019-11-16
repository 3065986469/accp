package com.aptech.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aptech.bean.employee;

public interface IuserDao {
	public List<employee> login(@Param("ename")String name,@Param("pwd")String pwd);
	public List<employee> queryin(@Param("eid")String eid);
}
