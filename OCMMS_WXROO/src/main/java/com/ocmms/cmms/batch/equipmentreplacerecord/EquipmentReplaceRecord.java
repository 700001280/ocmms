package com.ocmms.cmms.batch.equipmentreplacerecord;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = PurchaseDetail TODO Auto-generated class documentation
 *
 */

public class EquipmentReplaceRecord {
	
	private String dtype;
	
	private Long id;
	
	private Long technicalObject;	
	
	private Long equipment;

	private String description;

	private Calendar onlineDate;

	private Boolean onlinePlan;
	
	private Long onlineMaintainer;

	private Calendar offlineDate;

	private Boolean offlinePlan;

	private Long offlineMaintainer;

	private String memo;
	
	private Long version;

	private Calendar createdDate;

	private String createdBy;

	private Calendar lastModifiedDate;

	private String lastModifiedBy;
	
	private Long shaftType;

	private BigDecimal onlineRunTime;

	private BigDecimal offlineRunTime;
	
	

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

	public Long getTechnicalObject() {
		return technicalObject;
	}

	public void setTechnicalObject(Long technicalObject) {
		this.technicalObject = technicalObject;
	}

	public Long getEquipment() {
		return equipment;
	}

	public void setEquipment(Long equipment) {
		this.equipment = equipment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getOnlineDate() {
		return onlineDate;
	}

	public void setOnlineDate(Calendar onlineDate) {
		this.onlineDate = onlineDate;
	}

	public Boolean getOnlinePlan() {
		return onlinePlan;
	}

	public void setOnlinePlan(Boolean onlinePlan) {
		this.onlinePlan = onlinePlan;
	}

	public Long getOnlineMaintainer() {
		return onlineMaintainer;
	}

	public void setOnlineMaintainer(Long onlineMaintainer) {
		this.onlineMaintainer = onlineMaintainer;
	}

	public Calendar getOfflineDate() {
		return offlineDate;
	}

	public void setOfflineDate(Calendar offlineDate) {
		this.offlineDate = offlineDate;
	}

	public Boolean getOfflinePlan() {
		return offlinePlan;
	}

	public void setOfflinePlan(Boolean offlinePlan) {
		this.offlinePlan = offlinePlan;
	}

	public Long getOfflineMaintainer() {
		return offlineMaintainer;
	}

	public void setOfflineMaintainer(Long offlineMaintainer) {
		this.offlineMaintainer = offlineMaintainer;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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

	public Long getShaftType() {
		return shaftType;
	}

	public void setShaftType(Long shaftType) {
		this.shaftType = shaftType;
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
	
	
}
