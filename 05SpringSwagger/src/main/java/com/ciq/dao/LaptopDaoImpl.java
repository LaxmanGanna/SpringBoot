package com.ciq.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ciq.model.Laptop;
@Repository
public class LaptopDaoImpl implements LaptopDao {
	
	static List<Laptop> list=new ArrayList<>();
	
	
	static {
		list.add(new Laptop(100, "HP", 50000.00));
		list.add(new Laptop(101, "Asus", 52000.00));
		list.add(new Laptop(102, "Dell", 49000.00));
		list.add(new Laptop(103, "infinix", 45000.00));
	}

	@Override
	public List<Laptop> findAll() {
		return list;
	}

	@Override
	public Laptop save(Laptop laptop) {
		list.add(laptop);
		return laptop;
	}

	@Override
	public void delete(int lid) {
		
	}

	@Override
	public void deleteById(Integer lid) {
		Laptop l = getById(lid);
		list.remove(l);
		
		
	}

	@Override
	public Laptop getById(Integer lid) {
		return list.stream().filter(l->l.getLid().equals(lid)).findFirst().get();
	}
	

}
