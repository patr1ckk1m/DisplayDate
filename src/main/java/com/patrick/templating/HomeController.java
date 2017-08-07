package com.patrick.templating;
import org.springframework.web.bind.annotation.RequestMapping;
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
		model.addAttribute("dojoName", "SanJOse");
		return "datepage.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("dojoName", "Time");
		return "timepage.jsp";
	}
}