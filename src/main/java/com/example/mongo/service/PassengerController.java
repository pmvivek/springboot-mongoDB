package com.example.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.model.Passenger;
import com.example.mongo.repository.PassengerRepository;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@GetMapping("/getAllPassengers")
	public List<Passenger> getAllPassengers(){
		return passengerRepo.findAll();
		
	}
	
	@PostMapping("/savePassenger")
	public String savePassengers(@RequestBody Passenger passengerData) {
		
		Passenger passenger = null;
		passenger = passengerRepo.save(passengerData);
				
		return "Passenger Saved" + passenger ;
	}
	
	@GetMapping("/getPassengerByName/")
	public Passenger getPassengerByName(@RequestParam String passengerName){
		Passenger passenger = null;
		
		passenger = (Passenger) passengerRepo.findByName(passengerName);
		
		return passenger;
		
		
	}

}
