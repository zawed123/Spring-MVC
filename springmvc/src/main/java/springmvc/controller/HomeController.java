package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/webApp")
public class HomeController {

	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Zawed Akhtar");
		model.addAttribute("id", 12345);
		List<String> friends = new ArrayList<String>();
		friends.add("Vineet");
		friends.add("Sameer");
		friends.add("Rohan");
		model.addAttribute("frnd", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("name", "Zawed Akhtar");
		modelAndView.addObject("roll", 45678);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
