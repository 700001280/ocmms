package com.ocmms.cmms.batch.instockdetail;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = PurchaseDetail TODO Auto-generated class documentation
 *
 */

public class InstockDetail {
	
	private String dtype;	
	
	private Long id;
	
	private String orderNo;	
	
	private BigDecimal quantity;

	private BigDecimal unitPrice;
	
	private Long currencyUnit;	
	
	private String goodReceiveNo;
	
	private Calendar receiveDate;

	private Long receiver;

	private Calendar invoiceDate;

	private Long paymentSubmitter;

	private Calendar paymentDate;

	private String memo;

	private Boolean closed;

	private Long version;

	private Calendar createdDate;

	private String createdBy;

	private Calendar lastModifiedDate;

	private String lastModifiedBy;

	private Long materialProcurementItemDetail;

	private Calendar expirationDate;

	private Long organization;

	private Long materialCatalog;	

	private Long storageLocation;	

	private String serialNumber;

	private Long keeper;
  
	private Long storageType;
	
	private Long serviceProcurementItemDetail;

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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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

	public String getGoodReceiveNo() {
		return goodReceiveNo;
	}

	public void setGoodReceiveNo(String goodReceiveNo) {
		this.goodReceiveNo = goodReceiveNo;
	}

	public Calendar getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Calendar receiveDate) {
		this.receiveDate = receiveDate;
	}

	public Long getReceiver() {
		return receiver;
	}

	public void setReceiver(Long receiver) {
		this.receiver = receiver;
	}

	public Calendar getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Calendar invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Long getPaymentSubmitter() {
		return paymentSubmitter;
	}

	public void setPaymentSubmitter(Long paymentSubmitter) {
		this.paymentSubmitter = paymentSubmitter;
	}

	public Calendar getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Calendar paymentDate) {
		this.paymentDate = paymentDate;
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

	public Long getMaterialProcurementItemDetail() {
		return materialProcurementItemDetail;
	}

	public void setMaterialProcurementItemDetail(Long materialProcurementItemDetail) {
		this.materialProcurementItemDetail = materialProcurementItemDetail;
	}

	public Calendar getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Calendar expirationDate) {
		this.expirationDate = expirationDate;
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

	public Long getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(Long storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Long getKeeper() {
		return keeper;
	}

	public void setKeeper(Long keeper) {
		this.keeper = keeper;
	}

	public Long getStorageType() {
		return storageType;
	}

	public void setStorageType(Long storageType) {
		this.storageType = storageType;
	}

	public Long getServiceProcurementItemDetail() {
		return serviceProcurementItemDetail;
	}

	public void setServiceProcurementItemDetail(Long serviceProcurementItemDetail) {
		this.serviceProcurementItemDetail = serviceProcurementItemDetail;
	}
	
}
