package com.niit.amkart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView showMessage(Model model) {

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "hellooo");
		mv.addObject("name", "Joe");
		System.out.println("In controller");
		return mv;
	}
}
