package com.scg.employemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employemanagement.dao.entity.Account;
import com.scg.employemanagement.vo.AccountVO;

@Mapper(
	    componentModel = "spring"
	)

public interface AccountMapper {
	
	Account toEntity (AccountVO accountVO);
	
	AccountVO  toVO (Account account);

}
