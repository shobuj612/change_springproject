package com.sunshine.sunspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sunshine.sunspring.model.Buyer;
import com.sunshine.sunspring.repository.BuyerRepository;

@RestController
@RequestMapping("/buyer")
@CrossOrigin(origins = "http://localhost:4200")
public class BuyerController {

    @Autowired
    private BuyerRepository br;

    // Get all buyers
    @GetMapping
    public List<Buyer> getAllBuyer() {
        return br.findAll();
    }

    // Update buyer by ID
    @PutMapping("/{id}")
    public Buyer updateBuyer(@PathVariable Long id, @RequestBody Buyer buyer) {
        buyer.setBuyerId(id); // Ensure the ID is set for update
        return br.save(buyer);
    }

    // Insert new buyer (ID generated automatically in model)
    @PostMapping
    public Buyer postBuyer(@RequestBody Buyer buyer) {
        return br.save(buyer);
    }

    // Delete buyer by ID
    @DeleteMapping("/{id}")
    public void deleteBuyer(@PathVariable Long id) {
        br.deleteById(id);
    }
}
