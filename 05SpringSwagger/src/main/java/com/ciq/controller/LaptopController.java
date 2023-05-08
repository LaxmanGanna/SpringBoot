package com.ciq.controller;

import java.security.PublicKey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.web.bind.annotation.RestController;

import com.ciq.dao.LaptopDaoImpl;
import com.ciq.model.Laptop;

@RestController
public class LaptopController {
	@Autowired
	private LaptopDaoImpl dao;

//	@ResponseBody
	@PostMapping("/save")
	public String add(@RequestBody Laptop lap){
		dao.save(lap);
		return "inserted sucessfully"; 
	}
	@GetMapping("/getall")
	public List<Laptop> getAll(){
		List<Laptop> v = dao.findAll();
		return v;
	}
	
	@GetMapping("/getbyid/{lid}")
	public Laptop findByid(@PathVariable Integer lid) {
		return dao.getById(lid);
		
	}
}
