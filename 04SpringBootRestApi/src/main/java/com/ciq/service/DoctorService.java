package com.ciq.service;

import java.util.List;

import com.ciq.model.Doctor;

public interface DoctorService {

	Doctor save(Doctor doctor);

	Doctor update(Doctor doctor);

	void delete(Doctor docter);

	List<Doctor> findall(Doctor doctor);

	Doctor getById(int id);

}
