package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.methods.PredefinedMethods;
import com.example.demo.model.Employ;

@Service
public class EmployServiceImpl implements EmployService {
	@Autowired
	private PredefinedMethods pfm;

	@Override
	public Employ save(Employ employ) {

		return pfm.save(employ);
	}

	@Override
	public Employ update(Employ employ) {

		return pfm.save(employ);
	}

	@Override
	public void delete(Employ employ) {
		pfm.delete(employ);
	}

	@Override
	public Employ findById(int a) {
		return pfm.findById(a).get();
	}

	@Override
	public List<Employ> listOfEmployies() {
		return pfm.findAll();
	}

}
