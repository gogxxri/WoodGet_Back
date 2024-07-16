package com.project.woodget.address.controller;

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

import com.project.woodget.address.model.Address;
import com.project.woodget.address.service.AddressService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/user/address/{userNum}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Address>> addrListAll(@PathVariable("userNum") Integer userNum) {
		List<Address> addrList = this.addressService.getAddrByUserNum(userNum);
		
		logger.info("addr List: {} ", addrList.size());
		
		return new ResponseEntity<List<Address>>(addrList, HttpStatus.OK);
	}
}
