package com.ocmms.cmms.batch.partmaintenancerecord;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = PartMaintenanceRecord TODO Auto-generated class documentation
 *
 */

public class PartMaintenanceRecord {	
	
	private String dtype;
	
	private Long id;

	private Long materialCatalog;

	private String serialNumber;

	private Calendar maintStartDate;

	private Calendar maintEndDate;

	private String description;

	private BigDecimal downtime;

	private Boolean shutdown;

	private Long worker;

	private Long supportVendor;

	private Long purchaseDetail;	
	
	private Long version;

	private Calendar createdDate;

	private String createdBy;

	private Calendar lastModifiedDate;

	private String lastModifiedBy;
	
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

	public Long getWorker() {
		return worker;
	}

	public void setWorker(Long worker) {
		this.worker = worker;
	}

	public Long getSupportVendor() {
		return supportVendor;
	}

	public void setSupportVendor(Long supportVendor) {
		this.supportVendor = supportVendor;
	}

	public Long getPurchaseDetail() {
		return purchaseDetail;
	}

	public void setPurchaseDetail(Long purchaseDetail) {
		this.purchaseDetail = purchaseDetail;
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
