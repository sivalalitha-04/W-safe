package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Crime;
import com.example.demo.service.CrimeService;

@RestController
public class CrimeController {
	@Autowired
	CrimeService service;
	
	@PostMapping("/crime")
	public String create (@RequestBody Crime crime) {
		return service.addCrime(crime);
	}
	
	@GetMapping("/crime")
	public List<Crime> read(){
		return service.getCrime();
	}
	
	@GetMapping("/crime/{id}")
	public Optional<Crime> readById(@PathVariable int id){
		return service.getCrimeById(id);
	}
	
	@DeleteMapping("/crime")
	public String delete(@RequestParam int id) {
		return service.deleteCrimeById(id);
	}
}
