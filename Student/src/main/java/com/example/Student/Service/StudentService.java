package com.example.Student.Service;

import java.util.List;

import com.example.Student.model.Department;
import com.example.Student.model.Student;

public interface StudentService {
	
	public Student SaveStudent(Student student);
	
	public void deleteStudent(Integer id);
	
	List<Student> findbyName(String name);
	
	List<Student> findAllStudent();

}