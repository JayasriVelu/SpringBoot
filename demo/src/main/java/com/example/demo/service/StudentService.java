package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Student;

public interface StudentService {
	
	List<Student> fetchStudent();
	
	Student fetchStudentId(int id);
	
	void save (Student student);
	
	void delete(int id );
}