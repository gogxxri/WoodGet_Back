package com.project.woodget.deliver.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.woodget.deliver.model.Deliver;

public interface DeliverRepository extends JpaRepository<Deliver, String>{
	Optional<Deliver> findByDeliCode(String deliCode);
	List<Deliver> findAllByUserUserNum(Integer userNum);
}
