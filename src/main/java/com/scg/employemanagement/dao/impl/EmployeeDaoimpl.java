package com.scg.employemanagement.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employemanagement.dao.EmployeeDao;

import com.scg.employemanagement.dao.entity.Employee;

import com.scg.employemanagement.dao.repository.EmployeeRepository;

import com.scg.employemanagement.mapper.EmployeeMapper;

import com.scg.employemanagement.vo.EmployeeVO;

@Component
public class EmployeeDaoimpl implements EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {
		Employee employee;
		employee = employeeMapper.toEntity(employeeVO);
		employee = employeeRepository.save(employee);
		employeeVO = employeeMapper.toVO(employee);
		return employeeVO;
	}

	@Override
	public List<Employee> getEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public String deleteEmployee(int id) {

		employeeRepository.deleteById(id);
		return "Employee id : " + id + " Removed";
	}

	@Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) {

		Employee employee = employeeMapper.toEntity(employeeVO);
		Employee existingEmployee = employeeRepository.findById(employee.getEmployeeId()).orElse(null);
		existingEmployee.setEmployeeName(employee.getEmployeeName());
		existingEmployee.setAccounts(employee.getAccounts());
		employee = employeeRepository.save(existingEmployee);
		return employeeMapper.toVO(employee);

	}

	@Override
	public Employee getEmployeeById(final int id) {
		return employeeRepository.findById(id).orElse(null);
	}



}
