package com.sh.beetl.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.collect.Maps;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(Model model){
		Map user = Maps.newHashMap();
		user.put("id", 1);
		user.put("name", "曹操");
		user.put("description", "一名枭雄");
		model.addAttribute("user", user);
		return "index";
	}
	
	
}
