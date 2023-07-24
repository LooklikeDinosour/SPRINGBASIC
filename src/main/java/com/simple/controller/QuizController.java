package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String quiz01 (@ModelAttribute("year") String year,
						@ModelAttribute("month") String month,
						@ModelAttribute("day") String day) {
		
		return "quiz/quiz01_ok";	
	}
	
	@RequestMapping("/quiz02")
	public void quiz02 () {
		
	}
	
	@RequestMapping("/join")
	public String join () {
		
		
		
		return "quiz/quiz02_ok";
	}
	
	
	
	

}
