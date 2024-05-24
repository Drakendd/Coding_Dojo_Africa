package com.yassin.hello.human;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class HomeController {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
        if(searchQuery == null) {
        	return "hello Human";
        }
        return "you searched for: " +searchQuery;
    }
    @RequestMapping("/name")
    public String names(@RequestParam(value="name", required=false) String searchQuery) {
        return "You searched for: " + searchQuery;
    }


	
 }

