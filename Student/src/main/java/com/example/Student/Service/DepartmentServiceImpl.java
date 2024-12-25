package com.example.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.model.Department;
import com.example.Student.repoistory.DepartmentRepoistory;

@Service
public class DepartmentServiceImpl {

	@Autowired
	public DepartmentRepoistory departmentRepoistory;

	public List<Department> getAllDepartments() {
 return departmentRepoistory.allbydept();
	}
	public Department saveDept(Department dept) {
		return departmentRepoistory.save(dept);
	}
}