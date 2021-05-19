package com.scg.employeemanagement.dao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name = "department_details")
@Getter
@Setter
//@EntityListeners(Auditimplements.class)
public class Department {
	
	
	@Id
    @Column(name = "dept_id", unique = true, nullable = false)
    private Integer departmentId;
	
	@Column(name = "dept_name", unique = true, length = 100)
    private String departmentName;
	
	//@OneToMany(targetEntity = Account.class , cascade = CascadeType.ALL)
    //@JoinColumn( name = "emp_id",referencedColumnName = "employee_id")
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> employee;

	

	
	
	
	/*@Embedded
	private Audit audit;*/
	
	
    
}

