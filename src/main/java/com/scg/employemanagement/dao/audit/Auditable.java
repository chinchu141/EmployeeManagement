package com.scg.employemanagement.dao.audit;

import com.scg.employemanagement.dao.entity.Audit;

public interface Auditable {

	Audit getAudit();

	void setAudit(Audit audit);

}
