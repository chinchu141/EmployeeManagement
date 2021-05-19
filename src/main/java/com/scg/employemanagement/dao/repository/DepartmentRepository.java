package com.scg.employemanagement.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employemanagement.dao.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
