package springmvc.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("title", "Registration form");
		m.addAttribute("desc","Home for Programmer");
	}
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		return "contact";
	}
	
	/*@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handelForm(@RequestParam("email") String email,
			                 @RequestParam("username") String username,
			                 @RequestParam("password") String password,
			                 Model model) //HttpServletRequest request
	{
		System.out.println("Form Submit success...");
//		String email=request.getParameter("email");
//		String username=request.getParameter("username");
//		String password=request.getParameter("password");
//		model.addAttribute("email", email);
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
		
		User user=new User(email,username,password);
		model.addAttribute("user", user);
		
//    	System.out.println("Email:"+email+"\nUser Name:"+username+"\nPassword:"+password);
		System.out.println(user);
		return "success";
	}*/
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handelForm(@ModelAttribute User user,Model model)
	{
		System.out.println("Form Submit success...");
		this.userService.createUser(user);
		System.out.println(user);
		return "success";
	}
}
