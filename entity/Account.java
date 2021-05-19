package com.scg.employeemanagement.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "account_details")
@Getter
@Setter
//@EntityListeners(Auditimplements.class)
public class Account {
	
	
	
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", unique = true, nullable = false)
//    private Integer accountId;
	
    @Id
	@Column(name = "acc_number", unique = true, nullable = false)
    private String accountNumber;
	
	@Column(name = "bank_branch")
    private String branch;
	
	@Column(name = "bank_ifsc")
    private String ifsc;
//	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn( name = "employee_id" ,referencedColumnName = "employee_id")
    private Employee employee;
	
	/*@Embedded
	private Audit audit;*/
	
	
    
}