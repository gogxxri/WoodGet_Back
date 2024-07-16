package com.project.woodget;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.woodget.user.model.User;
import com.project.woodget.user.repository.UserRepository;

@SpringBootTest
class WoodgetApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	void testJpa() {
		List<User> listAll = this.userRepository.findAll();
		
		assertEquals(1, listAll.size());
	}
}
