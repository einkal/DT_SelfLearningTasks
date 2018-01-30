package com.niit.amkart.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RegistrationController {
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegistration(HttpServletRequest request, HttpServletResponse response)
	  {
	    ModelAndView modelAndView = new ModelAndView("registration");
	    return modelAndView;
	  }
}
