package com.noobug.nooblog.controller;

import com.noobug.nooblog.model.User;
import com.noobug.nooblog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserRestController
{
	@Autowired
	private UserService userService;

	@RequestMapping("/user/all")
	public List<User> allUsers()
	{
		return userService.getAllUsers();
	}

	@RequestMapping("/user/havePhone")
	public List<User> havePhone()
	{
		return userService.getHavePhoneUsers();
	}
}
