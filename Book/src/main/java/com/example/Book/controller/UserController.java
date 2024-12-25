package com.example.Book.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book.pojo.Userinfo;
import com.example.Book.service.impl.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public String saveUser(@RequestBody Userinfo user) {
		log.info("RequestBody of User{}", user);
		Boolean insertionStatus = userService.saveUser(user);
		if (insertionStatus) {
			return "User Saved sucessfully";
		} else {
			return "User already exists";
		}

	}

	@GetMapping("/login")
	public String fetchUser(@RequestParam String username)
	{
		log.info("RequestBody of User{}",username);
		List<Userinfo> namefromdb = userService.findByUsername(username);
		if(!namefromdb.isEmpty())
		{
		return "User already exists";
		}
		else
		{
			return "Please Register and Login";
		}

	}
	}
