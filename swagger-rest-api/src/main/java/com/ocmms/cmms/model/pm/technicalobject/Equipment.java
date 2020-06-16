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

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Data;
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = Equipment TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_TECHNICALOBJECT_EQUIPMENT")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class Equipment extends TechnicalObject implements Serializable {

	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FUNCTIONALLOCATION")

	private FunctionalLocation functionalLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "EQUIPMENTNUMBER", unique = true, length = 18)
	private String equipmentNumber;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUPERIOREQUIPMENT")

	private TechnicalObject superiorEquipment;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAINWORKCENTER")

	private MainWorkCenter mainWorkCenter;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANNERGROUP")

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

	private Country countryOfManufacture;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MANUFACTURER")

	private Vendor manufacturer;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANTSECTION")

	private PlantSection plantSection;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPMENTCATEGORY")

	private EquipmentCategory equipmentCategory;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OBJECTTYPE")

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

	private CriticalClassification criticalClassification;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<MeasuringPoint> measuringPoints = new HashSet<MeasuringPoint>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<MeasuringRecord> measuringRecords = new HashSet<MeasuringRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<LotoInfo> lotoInfoes = new HashSet<LotoInfo>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipments")

	private Set<EquipmentLubrication> equipmentLubrications = new HashSet<EquipmentLubrication>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipments")

	private Set<EquipmentParameter> equipmentParameters = new HashSet<EquipmentParameter>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<EquipmentMaintenanceRecord> equipmentMaintenanceRecords = new HashSet<EquipmentMaintenanceRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

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

	private Currency assetValueCurrency;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ASSETCLASSIFICATION")

	private AssetClassification assetClassification;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<AssetInventoryRecord> assetInventoryRecords = new HashSet<AssetInventoryRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<EquipmentStatusChangeRecord> equipmentStatusChangeRecords = new HashSet<EquipmentStatusChangeRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<AssetStatusChangeRecord> assetStatusChangeRecords = new HashSet<AssetStatusChangeRecord>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<Document> equipDocuments = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "equipment")

	private Set<ImageDocument> images = new HashSet<ImageDocument>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringPointsToAdd
	 */
	public void addToMeasuringPoints(Iterable<MeasuringPoint> measuringPointsToAdd) {
		Assert.notNull(measuringPointsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MeasuringPoint item : measuringPointsToAdd) {
			this.measuringPoints.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringPointsToRemove
	 */
	public void removeFromMeasuringPoints(Iterable<MeasuringPoint> measuringPointsToRemove) {
		Assert.notNull(measuringPointsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MeasuringPoint item : measuringPointsToRemove) {
			this.measuringPoints.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringRecordsToAdd
	 */
	public void addToMeasuringRecords(Iterable<MeasuringRecord> measuringRecordsToAdd) {
		Assert.notNull(measuringRecordsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MeasuringRecord item : measuringRecordsToAdd) {
			this.measuringRecords.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringRecordsToRemove
	 */
	public void removeFromMeasuringRecords(Iterable<MeasuringRecord> measuringRecordsToRemove) {
		Assert.notNull(measuringRecordsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MeasuringRecord item : measuringRecordsToRemove) {
			this.measuringRecords.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfoesToAdd
	 */
	public void addToLotoInfoes(Iterable<LotoInfo> lotoInfoesToAdd) {
		Assert.notNull(lotoInfoesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (LotoInfo item : lotoInfoesToAdd) {
			this.lotoInfoes.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfoesToRemove
	 */
	public void removeFromLotoInfoes(Iterable<LotoInfo> lotoInfoesToRemove) {
		Assert.notNull(lotoInfoesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (LotoInfo item : lotoInfoesToRemove) {
			this.lotoInfoes.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentLubricationsToAdd
	 */
	public void addToEquipmentLubrications(Iterable<EquipmentLubrication> equipmentLubricationsToAdd) {
		Assert.notNull(equipmentLubricationsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (EquipmentLubrication item : equipmentLubricationsToAdd) {
			this.equipmentLubrications.add(item);
			item.getEquipments().add(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentLubricationsToRemove
	 */
	public void removeFromEquipmentLubrications(Iterable<EquipmentLubrication> equipmentLubricationsToRemove) {
		Assert.notNull(equipmentLubricationsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (EquipmentLubrication item : equipmentLubricationsToRemove) {
			this.equipmentLubrications.remove(item);
			item.getEquipments().remove(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentParametersToAdd
	 */
	public void addToEquipmentParameters(Iterable<EquipmentParameter> equipmentParametersToAdd) {
		Assert.notNull(equipmentParametersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (EquipmentParameter item : equipmentParametersToAdd) {
			this.equipmentParameters.add(item);
			item.getEquipments().add(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentParametersToRemove
	 */
	public void removeFromEquipmentParameters(Iterable<EquipmentParameter> equipmentParametersToRemove) {
		Assert.notNull(equipmentParametersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (EquipmentParameter item : equipmentParametersToRemove) {
			this.equipmentParameters.remove(item);
			item.getEquipments().remove(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecordsToAdd
	 */
	public void addToEquipmentMaintenanceRecords(
			Iterable<EquipmentMaintenanceRecord> equipmentMaintenanceRecordsToAdd) {
		Assert.notNull(equipmentMaintenanceRecordsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (EquipmentMaintenanceRecord item : equipmentMaintenanceRecordsToAdd) {
			this.equipmentMaintenanceRecords.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecordsToRemove
	 */
	public void removeFromEquipmentMaintenanceRecords(
			Iterable<EquipmentMaintenanceRecord> equipmentMaintenanceRecordsToRemove) {
		Assert.notNull(equipmentMaintenanceRecordsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (EquipmentMaintenanceRecord item : equipmentMaintenanceRecordsToRemove) {
			this.equipmentMaintenanceRecords.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentReplaceRecordsToAdd
	 */
	public void addToEquipmentReplaceRecords(Iterable<EquipmentReplaceRecord> equipmentReplaceRecordsToAdd) {
		Assert.notNull(equipmentReplaceRecordsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (EquipmentReplaceRecord item : equipmentReplaceRecordsToAdd) {
			this.equipmentReplaceRecords.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentReplaceRecordsToRemove
	 */
	public void removeFromEquipmentReplaceRecords(Iterable<EquipmentReplaceRecord> equipmentReplaceRecordsToRemove) {
		Assert.notNull(equipmentReplaceRecordsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (EquipmentReplaceRecord item : equipmentReplaceRecordsToRemove) {
			this.equipmentReplaceRecords.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetInventoryRecordsToAdd
	 */
	public void addToAssetInventoryRecords(Iterable<AssetInventoryRecord> assetInventoryRecordsToAdd) {
		Assert.notNull(assetInventoryRecordsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (AssetInventoryRecord item : assetInventoryRecordsToAdd) {
			this.assetInventoryRecords.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetInventoryRecordsToRemove
	 */
	public void removeFromAssetInventoryRecords(Iterable<AssetInventoryRecord> assetInventoryRecordsToRemove) {
		Assert.notNull(assetInventoryRecordsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (AssetInventoryRecord item : assetInventoryRecordsToRemove) {
			this.assetInventoryRecords.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentStatusChangeRecordsToAdd
	 */
	public void addToEquipmentStatusChangeRecords(
			Iterable<EquipmentStatusChangeRecord> equipmentStatusChangeRecordsToAdd) {
		Assert.notNull(equipmentStatusChangeRecordsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (EquipmentStatusChangeRecord item : equipmentStatusChangeRecordsToAdd) {
			this.equipmentStatusChangeRecords.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentStatusChangeRecordsToRemove
	 */
	public void removeFromEquipmentStatusChangeRecords(
			Iterable<EquipmentStatusChangeRecord> equipmentStatusChangeRecordsToRemove) {
		Assert.notNull(equipmentStatusChangeRecordsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (EquipmentStatusChangeRecord item : equipmentStatusChangeRecordsToRemove) {
			this.equipmentStatusChangeRecords.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatusChangeRecordsToAdd
	 */
	public void addToAssetStatusChangeRecords(Iterable<AssetStatusChangeRecord> assetStatusChangeRecordsToAdd) {
		Assert.notNull(assetStatusChangeRecordsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (AssetStatusChangeRecord item : assetStatusChangeRecordsToAdd) {
			this.assetStatusChangeRecords.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatusChangeRecordsToRemove
	 */
	public void removeFromAssetStatusChangeRecords(Iterable<AssetStatusChangeRecord> assetStatusChangeRecordsToRemove) {
		Assert.notNull(assetStatusChangeRecordsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (AssetStatusChangeRecord item : assetStatusChangeRecordsToRemove) {
			this.assetStatusChangeRecords.remove(item);
			item.setEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipDocumentsToAdd
	 */
	public void addToEquipDocuments(Iterable<Document> equipDocumentsToAdd) {
		Assert.notNull(equipDocumentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (Document item : equipDocumentsToAdd) {
			this.equipDocuments.add(item);
			item.setEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipDocumentsToRemove
	 */
	public void removeFromEquipDocuments(Iterable<Document> equipDocumentsToRemove) {
		Assert.notNull(equipDocumentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (Document item : equipDocumentsToRemove) {
			this.equipDocuments.remove(item);
			item.setEquipment(null);
		}
	}
}
