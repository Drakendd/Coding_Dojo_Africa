package com.yassin.formtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@GetMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String show() {
		return "omikuji.jsp";
	}
	
	@PostMapping("/processForm")
	public String login(HttpSession s,
	    @RequestParam(value="num") String number,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="animal") String animal,
	    @RequestParam(value="nice") String nice) {
		
		s.setAttribute("number", number);
		s.setAttribute("city", city);
		s.setAttribute("person", person);
		s.setAttribute("hobby", hobby);
		s.setAttribute("animal", animal);
		s.setAttribute("nice", nice);
	    return "redirect:/omikuji/show";
	}
}


