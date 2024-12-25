package com.example.Student.repoistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Student.model.Department;

@Repository
public interface DepartmentRepoistory extends JpaRepository<Department,Integer> {

	 @Query("SELECT d FROM Department d JOIN FETCH d.student")
	 List<Department> allbydept();
	
}
