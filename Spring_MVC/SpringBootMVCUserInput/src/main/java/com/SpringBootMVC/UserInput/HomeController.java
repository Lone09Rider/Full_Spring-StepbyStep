package com.SpringBootMVC.UserInput;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.err.println("Home Triggered");
		return "index.jsp";
	}

	@RequestMapping("add")
	public String add(HttpServletRequest req) {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int num3 = i + j;
		HttpSession session = req.getSession();
		session.setAttribute("num3", num3);

		System.err.println("Sum is : " + num3);

		return "result.jsp?";
	}
}
