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

import com.sunshine.sunspring.model.FabricInfo;
import com.sunshine.sunspring.repository.FabricRepository;

@RestController
@RequestMapping("/fabric")
@CrossOrigin(origins = "http://localhost:4200")
public class FabricController {
	
	// this is the DI injection in the controller
	
	
	@Autowired
	
	private FabricRepository fr;
	
	// this is the method to get all the fabric 
	
	@GetMapping
	public List<FabricInfo> getAllFabric(){
		
		return fr.findAll();
		
	}

	  // this is the method to update design information
	
	@PutMapping("/{id}")
	
	public FabricInfo updateFabric(@PathVariable Long id , @RequestBody FabricInfo fabric) {
		
		fabric.setFabric_id(id);
		
		
		return fr.save(fabric);
		
	}
	
	
	// this is the method to postFabric in the database
	
	
	@PostMapping
	public FabricInfo postFabric(@RequestBody FabricInfo fab) {
		
		return fr.save(fab);
			
	}
	
	
	// this is the method to delete the Fabric from the database
	
	
	@DeleteMapping("/{id}")
	public void deleteFabric(@PathVariable Long id) {
		
		fr.deleteById(id);
	}
	
	
	
	
}
