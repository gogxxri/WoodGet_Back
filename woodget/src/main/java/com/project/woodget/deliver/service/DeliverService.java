package com.project.woodget.deliver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.woodget.deliver.model.Deliver;
import com.project.woodget.deliver.repository.DeliverRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class DeliverService {
	
	private DeliverRepository deliverRepository;
	
	public List<Deliver> getByUserNum(Integer userNum) {
		List<Deliver> deliList = this.deliverRepository.findAllByUserUserNum(userNum);
		
		return deliList;
	}
	
	public Deliver getInfoByDeliCode(String DeliCode) {
		Optional<Deliver> deliInfo = this.deliverRepository.findByDeliCode(DeliCode);
		
		if(deliInfo.isPresent()) {
			return deliInfo.get();
		} else {
			return null;
		}
	}
}
