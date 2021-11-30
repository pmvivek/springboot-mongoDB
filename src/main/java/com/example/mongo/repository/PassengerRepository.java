package com.example.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.mongo.model.Passenger;

public interface PassengerRepository extends MongoRepository<Passenger, Integer> {
	@Query("{name :?0}")
	List<Passenger> findByName(String name);

}
