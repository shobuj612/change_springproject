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

import com.sunshine.sunspring.model.Warehouse;
import com.sunshine.sunspring.repository.WarehouseRepository;

@RestController
@RequestMapping("/war")
@CrossOrigin(origins="http://localhost:4200")
public class WarehouseController {
	
	// this is the DI injection
	
	
	@Autowired
	
	private WarehouseRepository wr;
	
	
	// this is the method to get all the data from the database
	
	
	@GetMapping
	
	public List<Warehouse> getAllWarehouse(){
		
	  return wr.findAll();
	}
	
	// this is the method to upadate data in the database
	
	
	@PutMapping("/{id}")
	
	public Warehouse updateWarehouse(@PathVariable Long id , @RequestBody Warehouse ware) {
		
		ware.setWarehouse_id(id);
		
		return wr.save(ware);
		
	}
	
	
	// this is the method to post something in the database
	
	
	
	@PostMapping
	
	public Warehouse postWarehouse(@RequestBody Warehouse war) {
		
		return wr.save(war);
	}

	 // this is the method to delete something from the database
	
	
	@DeleteMapping("/{id}")
	public void deleteWarehouse(@PathVariable Long id) {
		
		
		wr.deleteById(id);
	}
}
