package com.scg.employemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employemanagement.dao.entity.Employee;
import com.scg.employemanagement.vo.EmployeeVO;

//@Mapper(componentModel = "spring")
@Mapper(componentModel = "spring", uses = {AuditMapper.class,AccountMapper.class})

public interface EmployeeMapper {
	
	
	EmployeeVO  toVO(Employee employee);
	
	Employee toEntity(EmployeeVO employeeVo);
}
