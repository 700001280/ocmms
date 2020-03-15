package com.ocmms.cmms.batch.worklog;

import java.util.Calendar;

/**
 * = PurchaseDetail TODO Auto-generated class documentation
 *
 */

public class WorkLog {
	
	private Long id;
	
	private String description;
	
	private Calendar logDate;
	
	private Long workLogType;
	
	private Boolean assign;
	
	private String remark;
	
	private Long logger;
	
	private Long version;
	
	private Calendar createdDate;
	
	private String createdBy;

	private Calendar lastModifiedDate;

	private String lastModifiedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getLogDate() {
		return logDate;
	}

	public void setLogDate(Calendar logDate) {
		this.logDate = logDate;
	}

	public Long getWorkLogType() {
		return workLogType;
	}

	public void setWorkLogType(Long workLogType) {
		this.workLogType = workLogType;
	}

	public Boolean getAssign() {
		return assign;
	}

	public void setAssign(Boolean assign) {
		this.assign = assign;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getLogger() {
		return logger;
	}

	public void setLogger(Long logger) {
		this.logger = logger;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Calendar getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Calendar lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	
}
