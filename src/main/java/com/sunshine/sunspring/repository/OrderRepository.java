package com.sunshine.sunspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunshine.sunspring.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
