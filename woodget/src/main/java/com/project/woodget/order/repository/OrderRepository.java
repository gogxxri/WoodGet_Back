package com.project.woodget.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.woodget.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, String>{

}
