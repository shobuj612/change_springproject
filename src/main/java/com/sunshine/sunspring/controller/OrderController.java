package com.sunshine.sunspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.sunspring.model.Order;
import com.sunshine.sunspring.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	// this is DI injection
	
	@Autowired
	
	private OrderRepository or;
	
	// this method to fetch all the row from the database
	
	@GetMapping
	public List<Order> getAllOrder(){
		
		return or.findAll();
	}
	
	
	// this is method to update row by the id and put row therer
	@PutMapping("/{id}")
	public Order updateOrder(@PathVariable Long id , @RequestBody Order order) {
		
		order.setOrder_id(id);
		
		return or.save(order);
		
	}
	
	// this is method to create order or post order to the database
	
	@PostMapping
	
	public Order postOrder(@RequestBody Order order) {
		return or.save(order);
	}
	
	// this is method to delete 
	
	@DeleteMapping("/{id}")
	
	public void deleteOrder(@PathVariable Long id) {
		
		or.deleteById(id);
	}

}
