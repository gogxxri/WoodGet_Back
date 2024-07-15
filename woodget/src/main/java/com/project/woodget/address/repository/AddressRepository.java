package com.project.woodget.address.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.woodget.address.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	List<Address> findByUserUserNum(Integer userNum);
}