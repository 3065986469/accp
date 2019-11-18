package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shouyin")
public class ShouyinController {
	
	@RequestMapping("/toCharts")
	public String toCharts() {
		return "charts";
	}
}
