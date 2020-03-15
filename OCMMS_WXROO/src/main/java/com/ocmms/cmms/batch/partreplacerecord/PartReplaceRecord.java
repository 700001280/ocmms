package com.ocmms.cmms.batch.partreplacerecord;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = PurchaseDetail TODO Auto-generated class documentation
 *
 */

public class PartReplaceRecord {
	
	private String dtype;	

	private BigDecimal onlineRunTime;
	
	private BigDecimal offlineRunTime;
	
	private Long id;

	private Long materialCatalog;

	private String serialNumber;

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

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMaterialCatalog() {
		return materialCatalog;
	}

	public void setMaterialCatalog(Long materialCatalog) {
		this.materialCatalog = materialCatalog;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
	
	
}
