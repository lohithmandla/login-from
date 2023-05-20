package com.lohith.login;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public String checkLogin(User user) {
		User dbuser;
		try{
		    dbuser = userRepository.findById(user.getEmail()).get();
		}
		catch (NoSuchElementException e) {
			return "redirect:/?nouser";
		}
			if (user.getPassword().equals(dbuser.getPassword())) {
				return "redirect:/?loginsuccess";
			} else {
				return "redirect:/?loginfail";
			}
	}

	public String saveUser(User user) {
		userRepository.save(user);
		return "redirect:/?regsuccess";

	}

}
