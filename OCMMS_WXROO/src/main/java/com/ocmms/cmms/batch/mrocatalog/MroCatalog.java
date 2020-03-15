package com.ocmms.cmms.batch.mrocatalog;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.NumberFormat;

import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import com.ocmms.cmms.model.mm.master.MaterialType;

import io.springlets.format.EntityFormat;

/**
 * = MroCatalog TODO Auto-generated class documentation
 *
 */

public class MroCatalog {
	
	private String dtype;	

	private Long id;

	private String code;

	private String materialName;
	
	private String materialGroup;

	private Long version;

	private Calendar createdDate;

	private String createdBy;

	private Calendar lastModifiedDate;

	private String lastModifiedBy;

	private Long materialType;

	private Long discipline;

	private Boolean instockType;	

	private Long uom;

	private Boolean usefulLife;
	
	private Integer shelfLifeDays;

	private String shortDescription;

	private String longDescription;

	private Boolean hazardousMaterial;


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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialGroup() {
		return materialGroup;
	}

	public void setMaterialGroup(String materialGroup) {
		this.materialGroup = materialGroup;
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

	public Long getMaterialType() {
		return materialType;
	}

	public void setMaterialType(Long materialType) {
		this.materialType = materialType;
	}

	public Long getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Long discipline) {
		this.discipline = discipline;
	}

	public Boolean getInstockType() {
		return instockType;
	}

	public void setInstockType(Boolean instockType) {
		this.instockType = instockType;
	}

	public Long getUom() {
		return uom;
	}

	public void setUom(Long uom) {
		this.uom = uom;
	}

	public Boolean getUsefulLife() {
		return usefulLife;
	}

	public void setUsefulLife(Boolean usefulLife) {
		this.usefulLife = usefulLife;
	}

	public Integer getShelfLifeDays() {
		return shelfLifeDays;
	}

	public void setShelfLifeDays(Integer shelfLifeDays) {
		this.shelfLifeDays = shelfLifeDays;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Boolean getHazardousMaterial() {
		return hazardousMaterial;
	}

	public void setHazardousMaterial(Boolean hazardousMaterial) {
		this.hazardousMaterial = hazardousMaterial;
	}
	
}
