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

import com.sunshine.sunspring.model.Finishing;
import com.sunshine.sunspring.repository.FinishingRepository;

@RestController
@RequestMapping("/finis")
@CrossOrigin(origins= "http://localhost:4200")
public class FinishingController {
	
	// this is  the DI injection
	
	
	@Autowired
	
	private FinishingRepository fr;
	
	@GetMapping
	public List<Finishing> getAllFinishing(){
		
		return fr.findAll();
	}
	
	// this is the method to update the finishing data
	
	
	@PutMapping("/{id}")
	
	public Finishing updateFinishing(@PathVariable Long id , @RequestBody Finishing fin) {
		
		
		fin.setFinish_id(id);
		
		return fr.save(fin);
		
	}
	
	
	// this is the method to post in the database
	
	
	
	
	@PostMapping
	
	public Finishing postFininshig(@RequestBody Finishing fin) {
		
		
		return fr.save(fin);
	}
	
	
	// this is the method to delete the data from  the database
	
	
	
	@DeleteMapping("/{id}")
	
	public void deleteFinishing(@PathVariable Long id) {
		
		
		fr.deleteById(id);
	}

}
