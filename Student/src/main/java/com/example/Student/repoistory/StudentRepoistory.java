package com.example.Student.repoistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.model.Department;
import com.example.Student.model.Student;

@Repository
public interface StudentRepoistory extends JpaRepository<Student,Integer> {

	List<Student> findByName(String name);

	Student deleteById(int id);
	


}