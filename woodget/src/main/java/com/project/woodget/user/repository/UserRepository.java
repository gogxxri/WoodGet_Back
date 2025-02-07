package com.project.woodget.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.woodget.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserNum(Integer userNum);
}