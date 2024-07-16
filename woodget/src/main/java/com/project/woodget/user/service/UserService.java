package com.project.woodget.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.woodget.DataNotFoundException;
import com.project.woodget.user.model.User;
import com.project.woodget.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	private final UserRepository userRepository;
	
	public List<User> getList() {
		return this.userRepository.findAll();
	}
	
	public User getUser(Integer userNum) {
		Optional<User> user = this.userRepository.findByUserNum(userNum);
		
		if(user.isPresent()) {
			return user.get();
		} else {
			throw new DataNotFoundException("user not found");
		}
	}
}