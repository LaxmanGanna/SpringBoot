package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDaoImpl;
import com.example.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoImpl dao;
	@Override
	public void save(Student student) {
		dao.save(student);
		
	}

	@Override
	public List<Student> listOfStudents() {
		// TODO Auto-generated method stub
		return dao.listOfStudents();
	}

	@Override
	public int delete(int sid) {
		
		return dao.delete(sid);
	}

	@Override
	public Student getById(int sid) {
		// TODO Auto-generated method stub
		return dao.getById(sid);
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return dao.update(student);
	}

	

}
