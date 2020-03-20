package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/hello")
public class HelloWorldController 
{
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	/*
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		String name=request.getParameter("studentName");
		String result=name.toUpperCase();
		
		result="Yo!"+result;
		
		model.addAttribute("message",result);
		return "helloworld";
		
		
	}*/
	
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(@RequestParam("studentName") String name,Model model) {

		String result=name.toUpperCase();
		
		result="Heyooo!"+ result;
		
		model.addAttribute("message",result);
		return "helloworld";
		
		
	}
	
	
	

}
