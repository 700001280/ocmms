package com.ocmms.cmms.model.mm.master;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = MaterialCatalog TODO Auto-generated class documentation
 *
 */
@Data
//@EqualsAndHashCode(callSuper=false)
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_MASTER_MATERIALCATALOG")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class MaterialCatalog extends MROCatalog implements Serializable {	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATERIALTYPE")
	private MaterialType materialType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DISCIPLINE")
	private MaterialDiscipline discipline;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTOCKTYPE")
	private InstockType instockType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UOM")
	private UnitOfMeasure uom;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "USEFULLIFE")
	private Boolean usefulLife;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SHELFLIFEDAYS")
	@NumberFormat
	private Integer shelfLifeDays;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SHORTDESCRIPTION")
	private String shortDescription;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "LONGDESCRIPTION")
	private String longDescription;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "IMAGE")
	private String image;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "HAZARDOUSMATERIAL")
	private Boolean hazardousMaterial;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<MaterialStorageLocationInfo> materialStorageLocationInfos = new HashSet<MaterialStorageLocationInfo>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<MaterialProcurementItemDetail> materialProcurementItemDetails = new HashSet<MaterialProcurementItemDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<OutstockDetail> outstockDetails = new HashSet<OutstockDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<InstockDetail> instockDetails = new HashSet<InstockDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "bomComponent")

	private Set<BillOfMaterial> equipmentBoms = new HashSet<BillOfMaterial>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<MaterialAttribute> materialAttributes = new HashSet<MaterialAttribute>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<MaterialPlantInfo> materialPlantInfos = new HashSet<MaterialPlantInfo>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<MaterialVendorInfo> materialVendorInfos = new HashSet<MaterialVendorInfo>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")

	private Set<ImageDocument> images = new HashSet<ImageDocument>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialStorageLocationInfosToAdd
	 */
	public void addToMaterialStorageLocationInfos(
			Iterable<MaterialStorageLocationInfo> materialStorageLocationInfosToAdd) {
		Assert.notNull(materialStorageLocationInfosToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MaterialStorageLocationInfo item : materialStorageLocationInfosToAdd) {
			this.materialStorageLocationInfos.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialStorageLocationInfosToRemove
	 */
	public void removeFromMaterialStorageLocationInfos(
			Iterable<MaterialStorageLocationInfo> materialStorageLocationInfosToRemove) {
		Assert.notNull(materialStorageLocationInfosToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MaterialStorageLocationInfo item : materialStorageLocationInfosToRemove) {
			this.materialStorageLocationInfos.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialProcurementItemDetailsToAdd
	 */
	public void addToMaterialProcurementItemDetails(
			Iterable<MaterialProcurementItemDetail> materialProcurementItemDetailsToAdd) {
		Assert.notNull(materialProcurementItemDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MaterialProcurementItemDetail item : materialProcurementItemDetailsToAdd) {
			this.materialProcurementItemDetails.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialProcurementItemDetailsToRemove
	 */
	public void removeFromMaterialProcurementItemDetails(
			Iterable<MaterialProcurementItemDetail> materialProcurementItemDetailsToRemove) {
		Assert.notNull(materialProcurementItemDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MaterialProcurementItemDetail item : materialProcurementItemDetailsToRemove) {
			this.materialProcurementItemDetails.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param outstockDetailsToAdd
	 */
	public void addToOutstockDetails(Iterable<OutstockDetail> outstockDetailsToAdd) {
		Assert.notNull(outstockDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (OutstockDetail item : outstockDetailsToAdd) {
			this.outstockDetails.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param outstockDetailsToRemove
	 */
	public void removeFromOutstockDetails(Iterable<OutstockDetail> outstockDetailsToRemove) {
		Assert.notNull(outstockDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (OutstockDetail item : outstockDetailsToRemove) {
			this.outstockDetails.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param instockDetailsToAdd
	 */
	public void addToInstockDetails(Iterable<InstockDetail> instockDetailsToAdd) {
		Assert.notNull(instockDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (InstockDetail item : instockDetailsToAdd) {
			this.instockDetails.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param instockDetailsToRemove
	 */
	public void removeFromInstockDetails(Iterable<InstockDetail> instockDetailsToRemove) {
		Assert.notNull(instockDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (InstockDetail item : instockDetailsToRemove) {
			this.instockDetails.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentBomsToAdd
	 */
	public void addToEquipmentBoms(Iterable<BillOfMaterial> equipmentBomsToAdd) {
		Assert.notNull(equipmentBomsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (BillOfMaterial item : equipmentBomsToAdd) {
			this.equipmentBoms.add(item);
			item.setBomComponent(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentBomsToRemove
	 */
	public void removeFromEquipmentBoms(Iterable<BillOfMaterial> equipmentBomsToRemove) {
		Assert.notNull(equipmentBomsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (BillOfMaterial item : equipmentBomsToRemove) {
			this.equipmentBoms.remove(item);
			item.setBomComponent(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialAttributesToAdd
	 */
	public void addToMaterialAttributes(Iterable<MaterialAttribute> materialAttributesToAdd) {
		Assert.notNull(materialAttributesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MaterialAttribute item : materialAttributesToAdd) {
			this.materialAttributes.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialAttributesToRemove
	 */
	public void removeFromMaterialAttributes(Iterable<MaterialAttribute> materialAttributesToRemove) {
		Assert.notNull(materialAttributesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MaterialAttribute item : materialAttributesToRemove) {
			this.materialAttributes.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialPlantInfosToAdd
	 */
	public void addToMaterialPlantInfos(Iterable<MaterialPlantInfo> materialPlantInfosToAdd) {
		Assert.notNull(materialPlantInfosToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MaterialPlantInfo item : materialPlantInfosToAdd) {
			this.materialPlantInfos.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialPlantInfosToRemove
	 */
	public void removeFromMaterialPlantInfos(Iterable<MaterialPlantInfo> materialPlantInfosToRemove) {
		Assert.notNull(materialPlantInfosToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MaterialPlantInfo item : materialPlantInfosToRemove) {
			this.materialPlantInfos.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialVendorInfosToAdd
	 */
	public void addToMaterialVendorInfos(Iterable<MaterialVendorInfo> materialVendorInfosToAdd) {
		Assert.notNull(materialVendorInfosToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MaterialVendorInfo item : materialVendorInfosToAdd) {
			this.materialVendorInfos.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialVendorInfosToRemove
	 */
	public void removeFromMaterialVendorInfos(Iterable<MaterialVendorInfo> materialVendorInfosToRemove) {
		Assert.notNull(materialVendorInfosToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MaterialVendorInfo item : materialVendorInfosToRemove) {
			this.materialVendorInfos.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param documentsToAdd
	 */
	public void addToDocuments(Iterable<Document> documentsToAdd) {
		Assert.notNull(documentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (Document item : documentsToAdd) {
			this.documents.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param documentsToRemove
	 */
	public void removeFromDocuments(Iterable<Document> documentsToRemove) {
		Assert.notNull(documentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (Document item : documentsToRemove) {
			this.documents.remove(item);
			item.setMaterialCatalog(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param imagesToAdd
	 */
	public void addToImages(Iterable<ImageDocument> imagesToAdd) {
		Assert.notNull(imagesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (ImageDocument item : imagesToAdd) {
			this.images.add(item);
			item.setMaterialCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param imagesToRemove
	 */
	public void removeFromImages(Iterable<ImageDocument> imagesToRemove) {
		Assert.notNull(imagesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (ImageDocument item : imagesToRemove) {
			this.images.remove(item);
			item.setMaterialCatalog(null);
		}
	}
	
	
	/**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean quals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof MaterialCatalog)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((MaterialCatalog) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String toString() {
        return "MaterialCatalog";
    }
    
}
