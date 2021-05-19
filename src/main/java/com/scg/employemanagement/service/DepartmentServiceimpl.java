package com.scg.employemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employemanagement.dao.DepartmentDao;
import com.scg.employemanagement.dao.entity.Department;
import com.scg.employemanagement.vo.DepartmentVO;

@Service
public class DepartmentServiceimpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public DepartmentVO addDepartment(DepartmentVO departmentVO) {

		return departmentDao.addDepartment(departmentVO);
	}

	@Override
	// fetching all department
	public List<Department> getAllDepartments() {
		return departmentDao.getAllDepartments();
	}

	@Override
	// fetching department by id
	public Department getDepartment(int id) {
		return departmentDao.getDepartment(id);
	}

	@Override
	public void deleteDepartmentById(int id) {
		System.out.println(departmentDao.deleteEmployee(id));

	}

}
