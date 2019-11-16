package com.aptech.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.bean.employee;
import com.aptech.dao.IuserDao;
@Service
public class userBiz {
	@Autowired
	private IuserDao ud;
	
	public List<employee> login(String name, String pwd) {
		return ud.login(name, pwd);
	}
	
	public List<employee> queryin(String eid) {
		return ud.queryin(eid);
	}
}
