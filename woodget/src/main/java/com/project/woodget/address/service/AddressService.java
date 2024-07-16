package com.project.woodget.address.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.woodget.address.model.Address;
import com.project.woodget.address.repository.AddressRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AddressService {
	private final AddressRepository addressRepository;
	
	public List<Address> getAddrByUserNum(Integer userNum) {
		return this.addressRepository.findByUserUserNum(userNum);		
	}
}
