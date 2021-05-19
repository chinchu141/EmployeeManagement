package com.scg.employemanagement.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employemanagement.dao.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// List<Employee> findUserByAccountNumber (final String accountNumber) ;
//	@Query("SELECT com.scg.employemanagement.vo.EmployeeAccountDetails(e.employeeName , a.accountNumber) FROM Employee e JOIN e.accounts a")
//	public List<EmployeeAccountDetails> findAllEmployeeAccount();

}
