package com.huyang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**页面跳转Controller
 * @Project: ids-web
 * @Package com.ids.controller
 * @author HuYang
 * @date 2017年4月1日 下午7:48:52
 * @version V1.0
 * Copyright (c) 2017, 790247179@qq.com All Rights Reserved
 */
@Controller
public class PageController {

/*	*//**
	 * 主页跳转
	 * @return
	 *//*
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page, @RequestParam(defaultValue="") String college,@RequestParam(defaultValue="") String major,Model model){
		model.addAttribute("college", college);
		model.addAttribute("major", major);
		System.out.println(college);
		System.out.println(page);
		System.out.println(major);
		return "admin/"+page;
	}*/
}
