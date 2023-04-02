package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Crime;
import com.example.demo.repository.CrimeRepository;

@Service
public class CrimeService {
	@Autowired
	CrimeRepository repository;
	
	public String addCrime(Crime crime) {
		repository.save(crime);
		return "Crime Spot added";
	}
	
	public List<Crime> getCrime(){
		return repository.findAll();
	}
	
	public Optional<Crime> getCrimeById(int id){
		return repository.findById(id);
	}
	
	public String deleteCrimeById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
}
