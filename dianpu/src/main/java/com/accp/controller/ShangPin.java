package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Leibie;
import com.accp.service.leibieService;

@Controller
@RequestMapping("shangping")
public class ShangPin {
	@Autowired
	private leibieService lbs;

	@RequestMapping(value="cxleibie")
	@ResponseBody
	public List<Leibie> queryleibie() {
		return lbs.queryleibie();
	}
	
	
	@RequestMapping(value="querykey")
	@ResponseBody
	public Leibie queryleibie(Integer lbid) {
		return lbs.queryprimayKey(lbid);
	}
	
	
	@RequestMapping(value="insertlb")
	@ResponseBody
	public String insertleibie(Leibie record) {
		lbs.insertleibie(record);
		return "新增成功！！！";
	}
	
	@RequestMapping(value="updatelb")
	@ResponseBody
	public String updateleibie(Leibie record) {
		lbs.updateleibie(record);
		return "修改成功！！！";
	}
	@RequestMapping(value="deleteleibie")
	@ResponseBody
	public String deleteleibie(Integer lbid) {
		lbs.deleteleibie(lbid);
		return "1";
	}
	
	
	
}
