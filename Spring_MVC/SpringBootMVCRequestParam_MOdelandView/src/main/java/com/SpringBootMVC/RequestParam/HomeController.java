package com.SpringBootMVC.RequestParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.err.println("Home Triggered at : 8080");
		return "index.jsp";
	}
	
	@RequestMapping("sum")
	public ModelAndView sum(@RequestParam("num1") int i, @RequestParam("num2") int j) {
				
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		
		int num3 = i+j;
		
		mv.addObject("num3", num3);
		
		System.out.println("Sum is : "+num3);

		return mv;
	}
	
}
