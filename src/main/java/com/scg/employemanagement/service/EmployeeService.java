package com.scg.employemanagement.service;

import java.util.List;

import com.scg.employemanagement.dao.entity.Employee;
import com.scg.employemanagement.vo.EmployeeVO;

public interface EmployeeService {
	EmployeeVO addEmployee(final EmployeeVO employeeVO);

	List<Employee> getEmployees();

	void deleteEmployee(final int id);

	EmployeeVO updateEmployee(EmployeeVO employeeVO);

	Employee getEmployeeById(final int id);

 
}
