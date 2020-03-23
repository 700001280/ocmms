package com.ocmms.cmms.model.mm.master;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;

import io.springlets.format.EntityFormat;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

/**
 * = MaterialCatalog TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_MASTER_MATERIALCATALOG", entityFormatMessage = "entity_format_message_mm_master_materialcatalog")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class MaterialCatalog extends MROCatalog {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "materialCatalogGen", sequenceName = "SEQ_MM_MASTER_MATERIALCATALOG_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "materialCatalogGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATERIALTYPE")
	@EntityFormat
	private MaterialType materialType;	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DISCIPLINE")
	@EntityFormat
	private MaterialDiscipline discipline;	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTOCKTYPE")
	@EntityFormat	
	private InstockType instockType;	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UOM")
	@EntityFormat
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
	@Column(name = "HAZARDOUSMATERIAL")
	private Boolean hazardousMaterial;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MaterialStorageLocationInfo> materialStorageLocationInfos = new HashSet<MaterialStorageLocationInfo>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MaterialProcurementItemDetail> materialProcurementItemDetails = new HashSet<MaterialProcurementItemDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<OutstockDetail> outstockDetails = new HashSet<OutstockDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<InstockDetail> instockDetails = new HashSet<InstockDetail>();
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "bomComponent")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<BillOfMaterial> equipmentBoms = new HashSet<BillOfMaterial>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MaterialAttribute> materialAttributes = new HashSet<MaterialAttribute>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MaterialPlantInfo> materialPlantInfos = new HashSet<MaterialPlantInfo>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MaterialVendorInfo> materialVendorInfos = new HashSet<MaterialVendorInfo>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ImageDocument> images = new HashSet<ImageDocument>();
}
