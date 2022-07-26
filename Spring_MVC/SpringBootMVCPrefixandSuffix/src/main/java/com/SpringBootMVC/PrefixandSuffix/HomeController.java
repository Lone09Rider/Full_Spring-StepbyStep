package com.SpringBootMVC.PrefixandSuffix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.err.println("Triggered at port : 8080");
		return "index";
	}

	@RequestMapping("add") // Should be **EQUAL** to form **ACTION**
	public ModelAndView sum(@RequestParam("num1") int i, @RequestParam("num2") int j)
	{
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		
		int num3 = i+j;
		view.addObject("num3", num3);
		System.out.println("Sum is :"+num3);
		
		return view;
	}

}
