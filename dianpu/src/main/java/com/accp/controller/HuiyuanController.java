package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/huiyuan")
public class HuiyuanController {

	@RequestMapping("/toForms")
	public String toForms() {
		return "forms";
	}
}
