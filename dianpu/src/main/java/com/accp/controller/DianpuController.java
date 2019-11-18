package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dianpu")
public class DianpuController {
	
	@RequestMapping("/toIndex")
	public String toIndex() {
		return "index";
	}
	
	@RequestMapping("/go")
	public String go(String method) {
		return method;
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
}
