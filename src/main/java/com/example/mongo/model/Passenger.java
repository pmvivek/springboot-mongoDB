package com.example.mongo.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="passengers")
public class Passenger {
   
	@Id
	private BigInteger _id;
	private String name;
	private int age;
	
	
	public BigInteger get_id() {
		return _id;
	}
	public void set_id(BigInteger _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Passenger [_id=" + _id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
