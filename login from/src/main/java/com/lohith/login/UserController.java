package com.lohith.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("user",new User());
		return "login";
	}
	
	@PostMapping("/loginprosess")
	public String loginprosess(User user) {
		return userService.checkLogin(user);
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user",new User());
		return "register";
	}
	@PostMapping("/save")
	public String save(User user) {
		return userService.saveUser(user);
	}
	

}
