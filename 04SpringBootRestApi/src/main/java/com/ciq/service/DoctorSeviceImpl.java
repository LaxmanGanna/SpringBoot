package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.DoctorRepository;
import com.ciq.model.Doctor;
@Service
public class DoctorSeviceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository dr;

	@Override
	public Doctor save(Doctor doctor) {
		return dr.save(doctor);
	}

	@Override
	public Doctor update(Doctor doctor) {
		return dr.save(doctor);
	}

	@Override
	public void delete(Doctor docter) {

		dr.delete(docter);
	}

	@Override
	public List<Doctor> findall(Doctor doctor) {
		return dr.findAll();
	}

	@Override
	public Doctor getById(int id) {
		return dr.findById(id).get();
	}

}
