package com.mindtree.crudoperation.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.crudoperation.dto.UserDto;
import com.mindtree.crudoperation.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/AddUser")
	public String sayHello(@ModelAttribute UserDto user, Model model) {

		System.out.println(user);
		UserDto UserDetail = userService.insertUserDetail(user);
		System.out.println("value inserted :" + UserDetail);
		model.addAttribute("message", "User Data Inserted.");
		return "index";

	}

	@PostMapping("/DeleteUser")
	public String sayHello(String userName, Model model) {

		System.out.println(userName);
		userService.deleteUserDetail(userName);
		System.out.println("username deleted :" + userName);
		model.addAttribute("message", "User Deleted.");
		return "index";

	}

	@GetMapping("/displayUsers")
	public String showDetailsInUi(Map<String, Object> model) {
		Set<UserDto> userDtos = userService.getAllDataOfUser();
		model.put("users", userDtos);

		return "index";

	}
}
