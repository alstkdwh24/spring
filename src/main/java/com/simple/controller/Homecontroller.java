package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

	@RequestMapping("/example/aaa")
	public String home()
	{
		return "home";
	}
		@RequestMapping("/example/bbb")
	public String home2() {
			return "home2";
		}
}
