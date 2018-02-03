package com.niit.amkart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.amkart.dao.SupplierDAO;
import com.niit.amkart.model.Supplier;

@Controller
public class AdminAddController {
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping(value = "/AddEntities", method = RequestMethod.GET)
	 public ModelAndView showForm() 
	{
      	return new ModelAndView("AddEntities");
    }
 
	
   
    
}

