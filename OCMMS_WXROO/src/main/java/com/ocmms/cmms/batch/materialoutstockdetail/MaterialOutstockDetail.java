package com.ocmms.cmms.batch.materialoutstockdetail;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = MaterialOutstockDetail TODO Auto-generated class documentation
 *
 */

public class MaterialOutstockDetail {
	
	private Long id;
	
	private Long organization;
	
	private String orderNo;
	
	private Long materialCatalog;
	
	private Long storageLocation;

	private Long storageType;
	
	private String serialNumber;
	
	private BigDecimal outstockQuantity;

	private Calendar issueDate;

	private Long receiver;

	private Long keeper;

	private Long equipmentMaintenanceRecord;
	
	private Long partMaintenanceRecord;

	private String memo;

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

	public Long getOrganization() {
		return organization;
	}

	public void setOrganization(Long organization) {
		this.organization = organization;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getMaterialCatalog() {
		return materialCatalog;
	}

	public void setMaterialCatalog(Long materialCatalog) {
		this.materialCatalog = materialCatalog;
	}

	public Long getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(Long storageLocation) {
		this.storageLocation = storageLocation;
	}

	public Long getStorageType() {
		return storageType;
	}

	public void setStorageType(Long storageType) {
		this.storageType = storageType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public BigDecimal getOutstockQuantity() {
		return outstockQuantity;
	}

	public void setOutstockQuantity(BigDecimal outstockQuantity) {
		this.outstockQuantity = outstockQuantity;
	}

	public Calendar getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Calendar issueDate) {
		this.issueDate = issueDate;
	}

	public Long getReceiver() {
		return receiver;
	}

	public void setReceiver(Long receiver) {
		this.receiver = receiver;
	}

	public Long getKeeper() {
		return keeper;
	}

	public void setKeeper(Long keeper) {
		this.keeper = keeper;
	}

	public Long getEquipmentMaintenanceRecord() {
		return equipmentMaintenanceRecord;
	}

	public void setEquipmentMaintenanceRecord(Long equipmentMaintenanceRecord) {
		this.equipmentMaintenanceRecord = equipmentMaintenanceRecord;
	}

	public Long getPartMaintenanceRecord() {
		return partMaintenanceRecord;
	}

	public void setPartMaintenanceRecord(Long partMaintenanceRecord) {
		this.partMaintenanceRecord = partMaintenanceRecord;
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
