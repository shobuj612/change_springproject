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

import com.sunshine.sunspring.model.Cutting;
import com.sunshine.sunspring.repository.CuttingRepository;

@RestController
@RequestMapping("/cut")
@CrossOrigin(origins = "http://localhost:4200")
public class CuttingController {

	// this is the DI injection in the controller
	
	
	@Autowired
	
	private CuttingRepository cr;
	
	// this is the method to get all the Cutting information
	
	
	@GetMapping
    public List<Cutting> getAllCutting(){
		
		
		return cr.findAll();
		
		
	}
	
	  // this is the method to update the Cutting in the database
	
	
	
	@PutMapping("/{id}")
	
	
	public Cutting updateCutting(@PathVariable Long id , @RequestBody Cutting cut) {
		
		
		cut.setCutting_id(id);
		
	return	cr.save(cut);
	
	
	
	}
	
	
	// this is the method to insert the cutting information in the dataase
	
	@PostMapping
	
	public Cutting postCutting(@RequestBody Cutting cut) {
		
		return cr.save(cut);
		
		
		
		
	}
	
	
	// this is the method to delete the cutting information in the database
	
	@DeleteMapping("/{id}")
	public void deleteCutting(@PathVariable Long id) {
		
		cr.deleteById(id);
	}
	
      }
