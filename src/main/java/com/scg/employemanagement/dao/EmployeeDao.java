package com.scg.employemanagement.dao;

import java.util.List;

import com.scg.employemanagement.dao.entity.Employee;

import com.scg.employemanagement.vo.EmployeeVO;

public interface EmployeeDao {

	EmployeeVO addEmployee(final EmployeeVO employeeVO);

	List<Employee> getEmployees();

	String deleteEmployee(int id);

	EmployeeVO updateEmployee(EmployeeVO employeeVO);

	Employee  getEmployeeById(final int id);


}