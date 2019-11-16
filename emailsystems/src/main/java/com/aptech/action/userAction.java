package com.aptech.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.bean.employee;
import com.aptech.biz.userBiz;

@Controller
@RequestMapping("/user")
public class userAction {
	@Autowired
	private userBiz ub;
	@RequestMapping(value="login")
	@ResponseBody
	public int login(String name,String pwd,HttpSession session) {
		//System.out.println(name+" "+pwd);
		if (ub.login(name, pwd).size()>0) {
			session.setAttribute("user", ub.login(name, pwd).get(0));
			return 1;
		}else {
			return 0;
		}
	}
	@RequestMapping(value="queryemp")
	@ResponseBody
	public List<employee> queryemp(String eid) {
		return ub.queryin(eid);
	}
}
