package com.scg.employemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employemanagement.dao.EmployeeDao;
import com.scg.employemanagement.dao.entity.Employee;
import com.scg.employemanagement.vo.EmployeeVO;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {

		return employeeDao.addEmployee(employeeVO);
	}

	@Override
	public List<Employee> getEmployees() {

		return employeeDao.getEmployees();
	}

	@Override
	public void deleteEmployee(int id) {

		System.out.println(employeeDao.deleteEmployee(id));

	}

	@Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) {

		return employeeDao.updateEmployee(employeeVO);
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDao.getEmployeeById(id);
	}

		
	
}
