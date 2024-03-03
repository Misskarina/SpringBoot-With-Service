package com.karina.servicemap;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String lapname;
	String lapbrand;
	int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public String getLapbrand() {
		return lapbrand;
	}
	public void setLapbrand(String lapbrand) {
		this.lapbrand = lapbrand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
