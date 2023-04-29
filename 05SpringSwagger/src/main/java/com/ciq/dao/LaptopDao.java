package com.ciq.dao;

import java.util.List;

import com.ciq.model.Laptop;

public interface LaptopDao {
	
	List<Laptop> findAll();

	Laptop save(Laptop laptop);

	void delete(int lid);

	void deleteById(Integer lid);
	
	Laptop getById(Integer lid);



}
