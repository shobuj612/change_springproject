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

import com.sunshine.sunspring.model.Sewing;
import com.sunshine.sunspring.repository.SewingRepository;

@RestController
@RequestMapping("/sew")
@CrossOrigin(origins = "http://localhost:4200")
public class SewingController {
	
	// this is the DI injection
	
	
	
	@Autowired
	
	private SewingRepository sr;
	
	
	// this is the method to get all the sewing information 
	
	
	
	@GetMapping
	
	public List<Sewing> getAllSewing(){
		
		
		return sr.findAll();
	}
            
	  // this is the method to update by id and put sewing information in the database
	
	
	@PutMapping("/{id}")
	
	public Sewing updateSewing(@PathVariable Long id , @RequestBody Sewing sew) {
		
		
		sew.setSewing_id(id);
		
		return sr.save(sew);
	}
	
	
	// this is the method to post in the database
	
	
	
	@PostMapping
	
	public Sewing postSewing(@RequestBody Sewing sew) {
		
		return sr.save(sew);
		
	}
	
	 // this is the method to delete the sewing in the database
	
	@DeleteMapping("/{id}")
	
	public void deleteSewing(@PathVariable Long id) {
		
		sr.deleteById(id);
	}
}
