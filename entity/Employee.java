package com.scg.employeemanagement.dao.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name = "employee")
//@EntityListeners(Auditimplements.class)
public class Employee {
	
	@Id
	@Column( name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)//compare with Gen.AUTO
	private int employeeId;
	
	@Column( name = "employee_name")
	private String employeeName;
	


//	@ManyToOne(targetEntity = Department.class , cascade = CascadeType.ALL)
//	@JoinColumn( name = "dep_id",referencedColumnName = "dept_id")
//	private Department department;
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn( name = "acc_number",referencedColumnName = "acc_number")
	private List<Account> accounts; 

	 
	
	
	/*@Embedded
	private Audit audit;*/

	
    
}
