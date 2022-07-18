package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Customer;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String showForm()
	{
		return "complex_form";
	}
	
	@RequestMapping(path="/formHandler",method = RequestMethod.POST)
	public String handlerForm(@ModelAttribute("customer") Customer customer)
	{
	  System.out.println(customer);
	  return "success";	
	}
	
}
