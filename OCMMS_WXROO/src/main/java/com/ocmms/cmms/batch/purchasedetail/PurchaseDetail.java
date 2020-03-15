package com.ocmms.cmms.batch.purchasedetail;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = PurchaseDetail TODO Auto-generated class documentation
 *
 */

public class PurchaseDetail {
	
	private String dtype;	

	private Long id;

	private Long priorityType;

	private Long catalogType;	
	
	private Long requester;
	
	private Calendar submitDate;
	
	private String description;
	
	private BigDecimal quantity;
	
	private BigDecimal unitPrice;
	
	private Long currencyUnit;
	
	private Long supplier;
	
	private Calendar purchaseRequestDate;
	
	private String purchaseRequestNo;
	
	private Calendar poDate;

	private String poNumber;

	private String memo;
	
	private Boolean closed;
	
	private Long version;
	
	private Calendar createdDate;
	
	private String createdBy;
	
	private Calendar lastModifiedDate;
	
	private String lastModifiedBy;	
	
	private Calendar deliverDate;
	
	private Long organization;	
	
	private Long materialCatalog;
	
	private Long workorderMaterial;	
	
	private Calendar workOrderDate;
	
	private String workOrderNo;

	
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

	public Long getPriorityType() {
		return priorityType;
	}

	public void setPriorityType(Long priorityType) {
		this.priorityType = priorityType;
	}

	public Long getCatalogType() {
		return catalogType;
	}

	public void setCatalogType(Long catalogType) {
		this.catalogType = catalogType;
	}

	public Long getRequester() {
		return requester;
	}

	public void setRequester(Long requester) {
		this.requester = requester;
	}

	public Calendar getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Calendar submitDate) {
		this.submitDate = submitDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Long getCurrencyUnit() {
		return currencyUnit;
	}

	public void setCurrencyUnit(Long currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

	public Long getSupplier() {
		return supplier;
	}

	public void setSupplier(Long supplier) {
		this.supplier = supplier;
	}

	public Calendar getPurchaseRequestDate() {
		return purchaseRequestDate;
	}

	public void setPurchaseRequestDate(Calendar purchaseRequestDate) {
		this.purchaseRequestDate = purchaseRequestDate;
	}

	public String getPurchaseRequestNo() {
		return purchaseRequestNo;
	}

	public void setPurchaseRequestNo(String purchaseRequestNo) {
		this.purchaseRequestNo = purchaseRequestNo;
	}

	public Calendar getPoDate() {
		return poDate;
	}

	public void setPoDate(Calendar poDate) {
		this.poDate = poDate;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Boolean getClosed() {
		return closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
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

	public Calendar getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Calendar deliverDate) {
		this.deliverDate = deliverDate;
	}

	public Long getOrganization() {
		return organization;
	}

	public void setOrganization(Long organization) {
		this.organization = organization;
	}

	public Long getMaterialCatalog() {
		return materialCatalog;
	}

	public void setMaterialCatalog(Long materialCatalog) {
		this.materialCatalog = materialCatalog;
	}

	public Long getWorkorderMaterial() {
		return workorderMaterial;
	}

	public void setWorkorderMaterial(Long workorderMaterial) {
		this.workorderMaterial = workorderMaterial;
	}

	public Calendar getWorkOrderDate() {
		return workOrderDate;
	}

	public void setWorkOrderDate(Calendar workOrderDate) {
		this.workOrderDate = workOrderDate;
	}

	public String getWorkOrderNo() {
		return workOrderNo;
	}

	public void setWorkOrderNo(String workOrderNo) {
		this.workOrderNo = workOrderNo;
	}
	
	
}
