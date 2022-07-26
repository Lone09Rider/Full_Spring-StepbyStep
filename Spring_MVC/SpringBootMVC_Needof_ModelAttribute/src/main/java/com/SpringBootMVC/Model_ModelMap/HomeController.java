package com.SpringBootMVC.Model_ModelMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("Name", "KirA");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a, Model m) {
		
		
		m.addAttribute("alien", a);
		return "result";
	}
}
