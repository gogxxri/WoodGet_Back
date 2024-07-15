package com.project.woodget.deliver.controller;

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

import com.project.woodget.deliver.model.Deliver;
import com.project.woodget.deliver.service.DeliverService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class DeliverController {
	
	@Autowired
	private DeliverService deliverService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/deliList/{userNum}", produces={ MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Deliver>> deliListAll(@PathVariable("userNum") Integer userNum) {
		List<Deliver> deliList = this.deliverService.getByUserNum(userNum);
		
		logger.info("Deliver size: {} ", deliList.size());
		
		if(deliList.size() != 0) {
			return new ResponseEntity<List<Deliver>>(deliList, HttpStatus.OK);
		} else {
			return null;
		}
	}
	
	@GetMapping(value="/deliList/detail/{deliCode}", produces={ MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Deliver> deliDetail(@PathVariable("deliCode") String deliCode) {
		Deliver deliCodeDetail = this.deliverService.getInfoByDeliCode(deliCode);
		
		if(deliCodeDetail != null) {
			logger.info("Deliver Detail: {} ", deliCodeDetail.getDeliCode());
			return new ResponseEntity<Deliver>(deliCodeDetail, HttpStatus.OK);
		} else {
			return null;
		}
	}
	
	
}
