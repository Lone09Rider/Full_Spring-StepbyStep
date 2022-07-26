package com.SpringBootMVC.Model_ModelMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.err.println("Triggered at port:-8080");
		return "index.jsp";
	}
	
	@RequestMapping("sum")
	public String sum(@RequestParam("num1") int i, @RequestParam("num2") int j,
						ModelMap m)
	{

		int num3 = i + j;
		m.addAttribute("num3", num3);
		return "result,jsp";
	}

}
