package com.codingdojo.human.Human;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HumanController {
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value = "name", defaultValue = "human") String name,
		     @RequestParam(value = "last_name", defaultValue = "") String last_name,
		     @RequestParam(value = "times", defaultValue = "1") int times) {
		
		String greeting = last_name.isEmpty() ? "Hello " + name : "Hello " + name + " " + last_name;

		String messages = "";
        for (int i = 0; i < times; i++) {
            messages = messages+greeting+"  ";
        }
        
        return messages;
		}
	 
	

	
}
