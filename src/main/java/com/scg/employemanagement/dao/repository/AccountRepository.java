package com.scg.employemanagement.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employemanagement.dao.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

}
