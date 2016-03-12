package com.han.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContrller {

	@RequestMapping(value="/hello.do")
	public String hello(String userName, Model model){   //参数传递
		
		model.addAttribute("helloworld", " hello "+ userName);
		return "index";   //返回页面
	}	
	
}
