package com.project.woodget.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.woodget.order.model.Order;
import com.project.woodget.order.repository.OrderRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class OrderService {
	
	private OrderRepository orderRepository;
	
	public List<Order> getOrderList() {
		return this.orderRepository.findAll();
	}

}
