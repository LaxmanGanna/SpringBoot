package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employ;

public interface EmployService {
	
	Employ save(Employ employ);
	Employ update(Employ employ);
	void delete(Employ employ);
	Employ findById(int a);
	List<Employ> listOfEmployies();

}
