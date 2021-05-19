package com.scg.employemanagement.service;

import java.util.List;

import com.scg.employemanagement.dao.entity.Department;
import com.scg.employemanagement.vo.DepartmentVO;

public interface DepartmentService {

	
	DepartmentVO addDepartment(DepartmentVO departmentVO);

	List<Department> getAllDepartments();

	Department getDepartment(int id);

	void deleteDepartmentById(int id);

	
}
