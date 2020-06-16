package com.ocmms.cmms.model.pm.routine;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;
import com.ocmms.cmms.model.srm.Vendor;
import com.ocmms.cmms.model.system.RecordStatus;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = PartMaintenanceRecord TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_ROUTINE_PARTMAINTENANCERECORD")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class PartMaintenanceRecord implements Serializable {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "partMaintenanceRecordGen", sequenceName = "SEQ_PM_ROUTINE_PARTMAINTENANCERECORD_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partMaintenanceRecordGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATERIALCATALOG")

	private MaterialCatalog materialCatalog;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SERIALNUMBER")
	private String serialNumber;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MAINTSTARTDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar maintStartDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MAINTENDDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar maintEndDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "DESCRIPTION")
	private String description;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "DOWNTIME")
	private BigDecimal downtime;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "SHUTDOWN")
	private Boolean shutdown;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORKER")

	private Employee worker;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUPPORTVENDOR")

	private Vendor supportVendor;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROCUREMENTORDER")

	private ProcurementOrder procurementOrder;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "partMaintenanceRecord")

	private Set<MaterialOutstockDetail> materialOutstockDetails = new HashSet<MaterialOutstockDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "partMaintenanceRecord")

	private Set<RepairMaterialInstockDetail> repairMaterialInstockDetails = new HashSet<RepairMaterialInstockDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "partMaintenanceRecord")

	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "partMaintenanceRecord")

	private Set<ImageDocument> images = new HashSet<ImageDocument>();

	/**** General Information Generated By System Start ****/
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECORDSTATUS")

	private RecordStatus recordStatus;

	/**
	 * record version, while changed or updated should be plus one;
	 *
	 */
	@Version
	@Column(name = "VERSION")
	private Long version;

	/**
	 * record created date, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@CreatedDate
	private Calendar createdDate;

	/**
	 * record created user, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_BY")
	@CreatedBy
	private String createdBy;

	/**
	 * record update date, while update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@LastModifiedDate
	private Calendar lastModifiedDate;

	/**
	 * Record last update user, while last update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_BY")
	@LastModifiedBy
	private String lastModifiedBy;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	

	/**
	 * This `equals` implementation is specific for JPA entities and uses the entity
	 * identifier for it, following the article in
	 * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
	 *
	 * @param obj
	 * @return Boolean
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		// instanceof is false if the instance is null
		if (!(obj instanceof PartMaintenanceRecord)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((PartMaintenanceRecord) obj).getId());
	}

	/**
	 * This `hashCode` implementation is specific for JPA entities and uses a fixed
	 * `int` value to be able to identify the entity in collections after a new id
	 * is assigned to the entity, following the article in
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
		return "PartMaintenanceRecord {" + "id='" + id + '\'' + ", serialNumber='" + serialNumber + '\''
				+ ", maintStartDate='" + maintStartDate == null
						? null
						: java.text.DateFormat.getDateTimeInstance().format(maintStartDate.getTime()) + '\''
								+ ", maintEndDate='" + maintEndDate == null
										? null
										: java.text.DateFormat.getDateTimeInstance().format(maintEndDate.getTime())
												+ '\'' + ", description='" + description + '\'' + ", downtime='"
												+ downtime + '\'' + ", shutdown='" + shutdown + '\'' + ", version='"
												+ version + '\'' + ", createdDate='" + createdDate == null
														? null
														: java.text.DateFormat.getDateTimeInstance()
																.format(createdDate.getTime()) + '\'' + ", createdBy='"
																+ createdBy + '\'' + ", lastModifiedDate='"
																+ lastModifiedDate == null
																		? null
																		: java.text.DateFormat.getDateTimeInstance()
																				.format(lastModifiedDate.getTime())
																				+ '\'' + ", lastModifiedBy='"
																				+ lastModifiedBy + '\'' + "}"
																				+ super.toString();
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialOutstockDetailsToAdd
	 */
	public void addToMaterialOutstockDetails(Iterable<MaterialOutstockDetail> materialOutstockDetailsToAdd) {
		Assert.notNull(materialOutstockDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MaterialOutstockDetail item : materialOutstockDetailsToAdd) {
			this.materialOutstockDetails.add(item);
			item.setPartMaintenanceRecord(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialOutstockDetailsToRemove
	 */
	public void removeFromMaterialOutstockDetails(Iterable<MaterialOutstockDetail> materialOutstockDetailsToRemove) {
		Assert.notNull(materialOutstockDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MaterialOutstockDetail item : materialOutstockDetailsToRemove) {
			this.materialOutstockDetails.remove(item);
			item.setPartMaintenanceRecord(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param repairMaterialInstockDetailsToAdd
	 */
	public void addToRepairMaterialInstockDetails(
			Iterable<RepairMaterialInstockDetail> repairMaterialInstockDetailsToAdd) {
		Assert.notNull(repairMaterialInstockDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (RepairMaterialInstockDetail item : repairMaterialInstockDetailsToAdd) {
			this.repairMaterialInstockDetails.add(item);
			item.setPartMaintenanceRecord(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param repairMaterialInstockDetailsToRemove
	 */
	public void removeFromRepairMaterialInstockDetails(
			Iterable<RepairMaterialInstockDetail> repairMaterialInstockDetailsToRemove) {
		Assert.notNull(repairMaterialInstockDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (RepairMaterialInstockDetail item : repairMaterialInstockDetailsToRemove) {
			this.repairMaterialInstockDetails.remove(item);
			item.setPartMaintenanceRecord(null);
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
			item.setPartMaintenanceRecord(this);
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
			item.setPartMaintenanceRecord(null);
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
			item.setPartMaintenanceRecord(this);
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
			item.setPartMaintenanceRecord(null);
		}
	}
}
