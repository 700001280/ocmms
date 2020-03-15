package com.ocmms.cmms.batch.equipmentmaintenancerecord;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = EquipmentMaintenanceRecord TODO Auto-generated class documentation
 *
 */

public class EquipmentMaintenanceRecord {	
	
	private String dtype;
	
	private Long id;
	
	private Calendar maintStartDate;
	
	private Calendar maintEndDate;

	private String description;

	private BigDecimal downtime;

	private Boolean shutdown;

	private Boolean interim;

	private Long maintainer;

	private Long equipment;

	private BigDecimal onlineRunTime;
	
	private BigDecimal offlineRunTime;
	
	private Long version;

	private Calendar createdDate;

	private String createdBy;

	private Calendar lastModifiedDate;

	private String lastModifiedBy;
	
	
	

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getMaintStartDate() {
		return maintStartDate;
	}

	public void setMaintStartDate(Calendar maintStartDate) {
		this.maintStartDate = maintStartDate;
	}

	public Calendar getMaintEndDate() {
		return maintEndDate;
	}

	public void setMaintEndDate(Calendar maintEndDate) {
		this.maintEndDate = maintEndDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDowntime() {
		return downtime;
	}

	public void setDowntime(BigDecimal downtime) {
		this.downtime = downtime;
	}

	public Boolean getShutdown() {
		return shutdown;
	}

	public void setShutdown(Boolean shutdown) {
		this.shutdown = shutdown;
	}

	public Boolean getInterim() {
		return interim;
	}

	public void setInterim(Boolean interim) {
		this.interim = interim;
	}

	public Long getMaintainer() {
		return maintainer;
	}

	public void setMaintainer(Long maintainer) {
		this.maintainer = maintainer;
	}

	public Long getEquipment() {
		return equipment;
	}

	public void setEquipment(Long equipment) {
		this.equipment = equipment;
	}
	
	

	public BigDecimal getOnlineRunTime() {
		return onlineRunTime;
	}

	public void setOnlineRunTime(BigDecimal onlineRunTime) {
		this.onlineRunTime = onlineRunTime;
	}

	public BigDecimal getOfflineRunTime() {
		return offlineRunTime;
	}

	public void setOfflineRunTime(BigDecimal offlineRunTime) {
		this.offlineRunTime = offlineRunTime;
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
