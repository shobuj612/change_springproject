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

import com.sunshine.sunspring.model.Shipping;
import com.sunshine.sunspring.repository.ShippingRepository;

@RestController
@RequestMapping("/ship")
@CrossOrigin(origins="http://localhost:4200")
public class ShippingController {
	
	// this is the DI injection
	
	@Autowired
	
	private ShippingRepository sr;
	
	
	@GetMapping
	
	public List<Shipping> getAllShipping(){
		
		
		return sr.findAll();
	}
	
	
	// this is the method to update something in the database
	
	@PutMapping("/{id}")
	public Shipping updateShipping(@PathVariable Long id , @RequestBody Shipping ship) {
		
		
		ship.setShipping_id(id);
		
		return sr.save(ship);
	}

	  // this is the method to post something in the database
	
	@PostMapping
	
	public Shipping postShipping(@RequestBody Shipping ship) {
		
		
	return	sr.save(ship);
	
	}
	
	// this is the method to deletesomething from the database
	
	
	@DeleteMapping("/{id}")
	
	public void deleteShipping(@PathVariable Long id) {
		
		
		sr.deleteById(id);
	}
}
