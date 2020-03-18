package com.ocmms.cmms.model.mm.storage;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import io.springlets.format.EntityFormat;

import java.math.BigDecimal;
import java.util.Calendar;
import com.ocmms.cmms.model.common.Currency;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.system.RecordStatus;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

/**
 * = MaterialOutstockDetail TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(inheritanceType = "SINGLE_TABLE", table = "MM_STORAGE_INSTOCKDETAIL", entityFormatMessage = "entity_format_message_mm_storage_instockdetail")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class InstockDetail {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "instockDetailGen", sequenceName = "SEQ_MM_STORAGE_INSTOCKDETAIL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instockDetailGen")
	@Column(name = "ID")
	private Long id;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATERIALCATALOG")
	@EntityFormat
	private MaterialCatalog materialCatalog;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STORAGELOCATION")
	@EntityFormat
	private StorageLocation storageLocation;	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "QUANTITY", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal quantity;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STORAGETYPE")
	@EntityFormat
	private StorageType storageType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MOVEMENTTYPE")
	@EntityFormat
	private MovementType movementType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "GOODRECEIVENO")
	private String goodReceiveNo;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "RECEIVEDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar receiveDate;

	/**
	 * record created date, while created record this filed will be set;
	 *
	 */
	@Column(name = "EXPIRATIONDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@CreatedDate
	private Calendar expirationDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SERIALNUMBER")
	private String serialNumber;
	
	/**
	 * 
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECEIVER")
	@EntityFormat
	private Employee receiver;


	/**
	 * 
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "KEEPER")
	@EntityFormat
	private Employee keeper;
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MEMO")
	private String memo;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CLOSED")
	private Boolean closed;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "instockDetail")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "instockDetail")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ImageDocument> images = new HashSet<ImageDocument>();

	/**** General Information Generated By System Start ****/

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECORDSTATUS")
	@EntityFormat
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
	/**** General Information Generated By System End ******/
}
