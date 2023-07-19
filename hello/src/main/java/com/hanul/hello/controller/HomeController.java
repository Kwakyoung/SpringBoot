package com.hanul.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/myinfo")
	public String myinfo(Model model) {
		model.addAttribute("name","홍길동");
		return "member/myinfo";
	}
}
