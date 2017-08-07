package com.patrick.templating;
import org.springframework.web.bind.annotation.RequestMapping;


import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new java.util.Date();
		model.addAttribute("date", date);
		return "datepage.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat time = new SimpleDateFormat("HH:mm");
		model.addAttribute("time", time.format(cal.getTime()));
		return "timepage.jsp";
	}
}