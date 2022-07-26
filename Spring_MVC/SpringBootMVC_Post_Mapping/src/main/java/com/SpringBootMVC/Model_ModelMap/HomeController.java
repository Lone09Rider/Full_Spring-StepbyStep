package com.SpringBootMVC.Model_ModelMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
//	@RequestMapping(value = "addAlien", method = RequestMethod.POST)
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a, Model m) {
		
		
		m.addAttribute("alien", a);
		return "result";
	}
}
