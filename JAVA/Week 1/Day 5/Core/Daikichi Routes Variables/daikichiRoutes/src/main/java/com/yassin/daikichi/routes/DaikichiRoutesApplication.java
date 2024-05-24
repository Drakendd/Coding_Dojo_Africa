package com.yassin.daikichi.routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	@RequestMapping("/")
	public String daikichi() {
		return " Welcome";
	}
	@RequestMapping("/daikichi/today")
    public String hello(){
      return "Today you will find luck in all your endeavors!";
    }
    @RequestMapping("/daikichi/tomorrow")
    public String world(){
      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
    @RequestMapping("/travel/{city}")
    public String travel(@PathVariable("city") String cityName) {
    	return " congratulation ! you will soon travel to "+cityName+"!";
    }
    @RequestMapping("/lotto/{lucky}")
	public String lotto(@PathVariable("lucky") int num) {
		if (num%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
    


}
