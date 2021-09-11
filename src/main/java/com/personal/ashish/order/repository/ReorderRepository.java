package com.personal.ashish.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.ashish.order.entity.Order;

public interface ReorderRepository extends JpaRepository<Order, String>{
	Order findByOrderid(String orderid);
}
