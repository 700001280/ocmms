package com.ocmms.cmms.batch.servicematerialdetail;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * = PurchaseDetail TODO Auto-generated class documentation
 *
 */

public class ServiceMaterialDetail {
	
	private String dtype;

	private Long id;	
	
	private String description;
	
	private BigDecimal quantity;
	
	private BigDecimal unitPrice;
	
	private Long currencyUnit;	
	
	private String memo;
	
	private Boolean closed;
	
	private Long version;
	
	private Calendar createdDate;
	
	private String createdBy;
	
	private Calendar lastModifiedDate;
	
	private String lastModifiedBy;	
	
	private Long serviceCatalog;
	
	private Long servicePurchaseDetail;

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

	public Long getServiceCatalog() {
		return serviceCatalog;
	}

	public void setServiceCatalog(Long serviceCatalog) {
		this.serviceCatalog = serviceCatalog;
	}

	public Long getServicePurchaseDetail() {
		return servicePurchaseDetail;
	}

	public void setServicePurchaseDetail(Long servicePurchaseDetail) {
		this.servicePurchaseDetail = servicePurchaseDetail;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}
	

	
}
