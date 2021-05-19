package com.scg.employemanagement.mapper;

import org.mapstruct.Mapper;

import com.scg.employemanagement.dao.entity.Audit;
import com.scg.employemanagement.vo.AuditVO;

@Mapper(componentModel = "spring")

public interface AuditMapper {

	AuditVO toVO(Audit audit);

	Audit toEntity(AuditVO auditVO);
}
