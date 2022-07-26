package com.SpringBootMVC.MyTry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("calc")
	public ModelAndView calc(@RequestParam("num1") int i, @RequestParam("num1") int j) {
		ModelAndView m = new ModelAndView("result");
		int num3 = i + j;
		m.addObject("num3", num3);
		return m;
	}
	
	@RequestMapping("addAlien")
	public String alien (@ModelAttribute Alien a, Model m) {
		
		m.addAttribute(a);
		
		return "result";
		
	}

}
