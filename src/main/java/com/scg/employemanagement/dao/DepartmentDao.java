package com.scg.employemanagement.dao;

import java.util.List;

import com.scg.employemanagement.dao.entity.Department;

import com.scg.employemanagement.vo.DepartmentVO;

public interface DepartmentDao {

	DepartmentVO addDepartment(DepartmentVO departmentVO);

	List<Department> getAllDepartments();

	Department getDepartment(int id);

	String deleteEmployee(int id);
}
