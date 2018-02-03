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

import com.niit.amkart.dao.CategoryDAO;
import com.niit.amkart.dao.SupplierDAO;
import com.niit.amkart.model.Category;
import com.niit.amkart.model.Supplier;

@Controller
public class CategoryController {
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	
	@RequestMapping(value = "/getCategory")
	 public ModelAndView getSupplierCategory() 
		{
			ModelAndView mv=new ModelAndView("AddEntities");
	System.out.println("inside category");
			mv.addObject("category",new Category());
			mv.addObject("isCategoryClicked",true);
	      	return mv;
	    }
	
	
	
	
	
	
	
	
	
	
	
    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public ModelAndView submit(@Validated @ModelAttribute("category")Category category, 
      BindingResult result, ModelMap model) 
    	{
        	if (result.hasErrors()) 
        	{
        		//return "error";
        	}
       // model.addAttribute("supplierName", supplier.getsupplierName());
        //model.addAttribute("supplierID", supplier.getSupplierID());
        categoryDAO.save(category);
        System.out.println("in submit");
        return new ModelAndView("AddEntities");
    }
    
}
