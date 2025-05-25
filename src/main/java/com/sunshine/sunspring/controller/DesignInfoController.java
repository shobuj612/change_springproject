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

import com.sunshine.sunspring.model.DesignInfo;
import com.sunshine.sunspring.repository.DesignInfoRepository;

@RestController
@RequestMapping("/design")

@CrossOrigin(origins = "http://localhost:4200")

public class DesignInfoController {
	
	
	// this the DI injection 
	
	@Autowired
	
	
	
	private DesignInfoRepository dr;
	
 // this is the method to getAll the design
	
	@GetMapping
	
	public List<DesignInfo> getAllDesing(){
		
		
		return dr.findAll();
	}
	
	
	// this is the method to update the design information
	
	
	@PutMapping("/{id}")
	
	public DesignInfo updateDesign(@PathVariable Long id, @RequestBody DesignInfo dn) {
		
		
		dn.setDesign_id(id);
		
		return dr.save(dn);
		
		
		
	}
	
	
	// this is the method to postdesing in the database
	
	
	
	
	@PostMapping
	
	public DesignInfo postDesign(@RequestBody DesignInfo dn) {
		
		return dr.save(dn);
	}
	
	
	
	// this is the method to delete the design
	
	
	@DeleteMapping("/{id}")
	
	public void deleteDesign(@PathVariable Long id) {
		
		dr.deleteById(id);
	}
	
	

}
