package com.studentres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="results")
public class Results {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollNumber;
	private String name;
	private int total;
	private int percentage;
	public int getId() {
		return id;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	

}
