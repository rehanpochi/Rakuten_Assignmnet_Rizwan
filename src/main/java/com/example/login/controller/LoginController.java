package com.example.login.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.login.entities.User;
import com.example.login.services.UserService;



@RestController
public class LoginController{
	
	@Autowired
	public UserService userService=new UserService();
	
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}
	
	@PostMapping(path = "/user", consumes = "application/json")
	public boolean test(@RequestBody User user) {														
		return this.userService.checkUser(user);
	}
	
}










































//package com.example.login.controller;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class LoginController {
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String loginPage() {
//		return "login";
//	}
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String welcomePage(ModelMap model,@RequestParam String userId,@RequestParam String password) {
//		if(userId.equals("admin")&& password.equals("1234")) {
//			return"welcome";
//		}
////		else if(userId.equals("r")&& password.equals("1")) {
////			return"welcome";}
////		if(userId.equals("i")&& password.equals("2")) {
////			return"welcome";
////		}
//		else {
//		model.put("error", "try again");
//		return "login";
//		
//}
//}
//}
// 