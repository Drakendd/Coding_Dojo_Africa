package com.yassin.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@GetMapping("")
	public String index (HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count",0 );
		}
		else {
			int newcount=(int ) session.getAttribute("count")+1;
			session.setAttribute("count",newcount);
		}
		return "index.jsp";
		
		
	}
	@GetMapping("/counter")
	public String counter(){
		return "counter.jsp";
		
	}
	
	

}
