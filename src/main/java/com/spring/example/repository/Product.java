package com.spring.example.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

public Product() {
	// TODO Auto-generated constructor stub
}
	@Id // set the primary key
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	

	@Column(name= "laptop")
	private String laptop;

	
	@Override
	public String toString() {
		return "[" + id + ", " + name + ", " + laptop + "]";
	}
		
}
