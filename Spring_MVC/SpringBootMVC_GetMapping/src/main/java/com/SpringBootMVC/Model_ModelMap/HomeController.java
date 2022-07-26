package com.SpringBootMVC.Model_ModelMap;

//import java.util.Arrays;
//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("Name", "KirA");
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
//	@GetMapping("getAliens")
//	public String getAliens() 
//	{
//		List<Alien> aliens = Arrays.asList(new Alien("KirA", 109),
//											new Alien("L", 100), 
//											new Alien("Bittu", 110) );
//		
//		return aliens.toString();
//	}
	
	
//	@RequestMapping(value = "addAlien", method = RequestMethod.POST)
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a, Model m) {
		
		
		m.addAttribute("alien", a);
		return "result";
	}
}
