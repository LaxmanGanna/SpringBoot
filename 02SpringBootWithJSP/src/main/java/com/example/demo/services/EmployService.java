package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.methods.PredefinedMethods;
import com.example.demo.model.Employ;
@Component
public class EmployService {

	@Autowired
	private static PredefinedMethods pfm;
	public void save(Employ e){
		pfm.save(e);
	}
}
