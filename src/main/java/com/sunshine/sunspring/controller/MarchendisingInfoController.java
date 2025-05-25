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

import com.sunshine.sunspring.model.MerchandisingInfo;
import com.sunshine.sunspring.repository.MarchendisingRepository;

@RestController
@RequestMapping("/march")
@CrossOrigin(origins = "http://localhost:4200")
public class MarchendisingInfoController {

	// this is the DI injection
	
	@Autowired
	
	private MarchendisingRepository mr;
	
	// this is the method to collect all the merchandising information
	
	@GetMapping
	public List<MerchandisingInfo> getAllMarchendisingInfo(){
		
		return mr.findAll();
		
		
	}
	
	
	// this is the method to update the merchandising by the id and the put some merchandising
	
	@PutMapping("/{id}")
	
	public MerchandisingInfo updateMarchendising(@PathVariable Long id,@RequestBody MerchandisingInfo mar) {
		
		mar.setMerch_id(id);
		
		return mr.save(mar);
	}
	
	
	// this is the method to insert something to the database
	
	
	@PostMapping
	
	public MerchandisingInfo postMarchendising(@RequestBody MerchandisingInfo mar) {
		
		return mr.save(mar);
	}
	
	
	// this is the method to delete the merchandising by the id
	
	
	@DeleteMapping("/{id}")
	
	public void deleteMarchendising(@PathVariable Long id) {
		
		mr.deleteById(id);
	}
	
	
	
}
