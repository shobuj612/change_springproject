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

import com.sunshine.sunspring.model.QC;
import com.sunshine.sunspring.repository.QcRepository;

@RestController
@RequestMapping("/qc")
@CrossOrigin(origins="http://localhost:4200")
public class QcController {
	
	// this is the DI injection
	
	
	@Autowired
	
	private QcRepository qr;
	
	// this is  the method to find the all data from the database
	
	
	@GetMapping
	
	public List<QC> getAllQc(){
		
		return qr.findAll();
	}
	
	
	// this is the method to update the database 
	
	@PutMapping("/{id}")
	
	public QC updateQC(@PathVariable Long id, @RequestBody QC qc) {
		
		
		qc.setQc_id(id);
		
		return qr.save(qc);
		
		
	}
	
	
	// this is the method to post something in the database
	
	
	
	@PostMapping
	
	public QC postQc(@RequestBody QC qc) {
		
		
		return qr.save(qc);
		
	}
	
	
	// this is the method to delete the data from the database
	
	
	@DeleteMapping("/{id}")
	public void deleteQc(@PathVariable Long id) {
		
		
		qr.deleteById(id);
	}

}
