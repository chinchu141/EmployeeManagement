package com.scg.employemanagement.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employemanagement.dao.DepartmentDao;
import com.scg.employemanagement.dao.entity.Department;
import com.scg.employemanagement.dao.repository.DepartmentRepository;
import com.scg.employemanagement.mapper.DepartmentMapper;
import com.scg.employemanagement.vo.DepartmentVO;

@Component
public class DepartmentDaoimpl implements DepartmentDao {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public DepartmentVO addDepartment(DepartmentVO departmentVO) {

		Department department;
		department = departmentMapper.toEntity(departmentVO);
		department = departmentRepository.save(department);
		return departmentMapper.toVO(department);

	}

	@Override
	public List<Department> getAllDepartments() {

		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartment(int id) {

		return departmentRepository.findById(id).orElse(null);
	}

	@Override
	public String deleteEmployee(int id) {
		
		departmentRepository.deleteById(id);
		return "Employee id : " + id + " Removed";
	}
}
