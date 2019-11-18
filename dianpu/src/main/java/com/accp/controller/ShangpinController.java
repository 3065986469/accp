package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shangpin")
public class ShangpinController {
	
	@RequestMapping("/toTables")
	public String toCharts() {
	
		return "tables";
	}
}
