package com.project.woodget.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.woodget.user.model.User;
import com.project.woodget.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/users/listAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<User>> listAll() {
		List<User> userList = this.userService.getList();
		
		if(!userList.isEmpty()) {
			logger.info("User size: {} ", userList.size());
		}
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}
	
	@GetMapping(value="/user/{userNum}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<User> list(@PathVariable("userNum") Integer userNum) {
		User user = this.userService.getUser(userNum);
		
		if(user != null) {
			logger.info("User Info: {} ", user.getUsername());
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}