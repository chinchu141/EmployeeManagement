package com.scg.employemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employemanagement.dao.entity.Department;
import com.scg.employemanagement.vo.DepartmentVO;

	@Mapper(componentModel = "spring", uses = AuditMapper.class)
		
	
	public interface DepartmentMapper {
		
		Department toEntity (DepartmentVO departmentVO);
		
		DepartmentVO  toVO (Department department);

	}
