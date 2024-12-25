package com.example.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.model.Department;
import com.example.Student.model.Student;
import com.example.Student.repoistory.StudentRepoistory;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepoistory studentRepoistory;
	
	

	@Override
	public Student SaveStudent(Student student) {
		return studentRepoistory.save(student);	
		 
	}

	@Override
	public List<Student> findbyName(String name) {
		// TODO Auto-generated method stub
		return studentRepoistory.findByName(name);
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepoistory.deleteById(id);
	}

	@Override
	public List<Student> findAllStudent() {
		return studentRepoistory.findAll();
	}
	
	}