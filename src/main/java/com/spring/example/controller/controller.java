package com.spring.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.example.repository.ProductRepository;

public class controller {
@Autowired
ProductRepository repo;

public void get_repo(){
	repo.findAll();
}
}
