package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao {

	public void save(Student student);

	public List<Student> listOfStudents();

	public int delete(int sid);

	public Student getById(int sid);

	public int update(Student student);

}
