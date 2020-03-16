/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ocmms.cmms.model.pm.technicalobject;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import io.springlets.format.EntityFormat;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.common.Currency;
import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.model.common.Country;
import com.ocmms.cmms.model.srm.Vendor;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;

import javax.persistence.ManyToMany;

/**
 * = Equipment TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_TECHNICALOBJECT_EQUIPMENT", entityFormatMessage = "entity_format_message_pm_technicalobject_equipment")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class Equipment  extends TechnicalObject {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "equipmentGen", sequenceName = "SEQ_PM_TECHNICALOBJECT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipmentGen")
	@Column(name = "ID")
	private Long id;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FUNCTIONALLOCATION")
	@EntityFormat
	private FunctionalLocation functionalLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "EQUIPMENTNUMBER", unique = true,length=18)
	private String equipmentNumber;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUPERIOREQUIPMENT")
	@EntityFormat
	private TechnicalObject superiorEquipment;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAINWORKCENTER")
	@EntityFormat
	private MainWorkCenter mainWorkCenter;	
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANNERGROUP")
	@EntityFormat
	private PlannerGroup plannerGroup;	
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CONSTRUCTIONDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar constructionDate;
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRYOFMANUFACTURE")
	@EntityFormat
	private Country countryOfManufacture;	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MANUFACTURER")
	@EntityFormat
	private Vendor manufacturer;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANTSECTION")
	@EntityFormat("#{section}")
	private PlantSection plantSection;
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPMENTCATEGORY")
	@EntityFormat("#{code}")
	private EquipmentCategory equipmentCategory;	
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OBJECTTYPE")
	@EntityFormat
	private ObjectType objectType;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DRAWINGNUMBER")
	private String drawingNumber;
	
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "CATALOGPROFILE")
	private String catalogProfile;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANTLOCATION")
	@EntityFormat("#{location}")
	private PlantLocation plantLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CONSTTYPEMATERIAL")
	private String constTypeMaterial;	
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SIZEDIMENSION")
	private String sizeDimension;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "GROSSWEIGHT")
	@NumberFormat
	private BigDecimal grossWeight;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WEIGHTUNIT")
	@EntityFormat
	private UnitOfMeasure weightUnit;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ACQUISITIONDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar acquisitionDate;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ACQUISITIONVALUE")
	@NumberFormat
	private BigDecimal acquisitionValue;
	
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACQUISITIONVALUECURRENCY")
	@EntityFormat
	private Currency acquisitionValueCurrency;	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "BEGINGUARANTEEDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar beginGuaranteeDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "WARRANTYENDDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar warrantyEndDate;

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUPPLIER")
	@EntityFormat
	private Vendor supplier;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CONTRACT")
	private String contract;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "EHSSCRITICAL")
	private Boolean ehssCritical;
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRITICALCLASSIFICATION")
	@EntityFormat
	private CriticalClassification criticalClassification;	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MeasuringPoint> measuringPoints = new HashSet<MeasuringPoint>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MeasuringRecord> measuringRecords = new HashSet<MeasuringRecord>();
	
		
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<LotoInfo> lotoInfoes = new HashSet<LotoInfo>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipments")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<EquipmentLubrication> equipmentLubrications = new HashSet<EquipmentLubrication>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipments")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<EquipmentParameter> equipmentParameters = new HashSet<EquipmentParameter>();

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<EquipmentMaintenanceRecord> equipmentMaintenanceRecords = new HashSet<EquipmentMaintenanceRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<EquipmentReplaceRecord> equipmentReplaceRecords = new HashSet<EquipmentReplaceRecord>();

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ASSETCODE")
	private String assetCode;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "STARTDEPRECIATIONCOST", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal startDepreciationCost;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DEPRECIATIONYEAR", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal depreciationYear;
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CAPITALIZEDDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar capitalizedDate;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CURRENTBOOKVALUE", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal currentBookValue;	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ORIGINALASSETID")
	private String originalAssetId;

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ASSETVALUECURRENCY")
	@EntityFormat
	private Currency assetValueCurrency;
	
	
	/**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ASSETCLASSIFICATION")
    @EntityFormat
    private AssetClassification assetClassification;   
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<AssetInventoryRecord> assetInventoryRecords = new HashSet<AssetInventoryRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<EquipmentStatusChangeRecord> equipmentStatusChangeRecords = new HashSet<EquipmentStatusChangeRecord>();

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<AssetStatusChangeRecord> assetStatusChangeRecords = new HashSet<AssetStatusChangeRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> equipDocuments = new HashSet<Document>();	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ImageDocument> images = new HashSet<ImageDocument>();
}
