package com.ocmms.cmms.rest.projection;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.assistance.WorkLogType;
import com.ocmms.cmms.model.hrm.Employee;

@Projection(name = "virtualworklog", types = { WorkLog.class })
public interface VirtualWorkLogProjection {

	// @Value("#{target.firstName} #{target.lastName}")
	// String getFullName();
	Long getId();

	String getDescription();

	Calendar getLogDate();

	Boolean getAssign();

	String getRemark();

	WorkLogType getWorkLogType();

	Employee getLogger();
}