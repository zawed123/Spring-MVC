package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/user/{id}")
	public String getUserDetails(@PathVariable("id") int id)
	{
		System.out.println("The user id is:"+id);
		return "success";
	}
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("this is one handler");
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("this is second handler");
		
		return "contact";
		
	}
}
