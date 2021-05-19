package com.scg.employemanagement.vo;

import java.util.List;


import com.scg.employemanagement.dao.entity.Employee;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Getter
@Setter
@ToString
public class DepartmentVO {

	private int departmentId;
	private String departmentName;
	private List<Employee> employees;
	private AuditVO audit;
	
	
	
}
