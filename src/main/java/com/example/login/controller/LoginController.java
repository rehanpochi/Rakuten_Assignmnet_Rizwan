package com.example.login.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model,@RequestParam String userId,@RequestParam String password) {
		if(userId.equals("admin")&& password.equals("1234")) {
			return"welcome";
		}
		else if(userId.equals("r")&& password.equals("1")) {
			return"welcome";}
		if(userId.equals("i")&& password.equals("2")) {
			return"welcome";
		}
		else {
		model.put("error", "try again");
		return "login";
		
}
}
}
 