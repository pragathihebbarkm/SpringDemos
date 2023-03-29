package com.examples.beans.S03Stereotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("instructor")
public class Instructor {

	@Value("2")
	private int id;
	
	@Value("Max")
	private String name;
	
	@Autowired
	private Address homeaddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", homeaddress=" + homeaddress + "]";
	}
	
}
