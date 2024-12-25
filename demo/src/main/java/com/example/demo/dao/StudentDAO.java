package com.example.demo.dao;

import java.util.List;

import com.example.demo.pojo.Student;

public interface StudentDAO {
	
	List<Student> fetchStudent();
	
	Student fetchStudentId(int id);
	
	void save (Student student);
	
	void delete(int id );
}