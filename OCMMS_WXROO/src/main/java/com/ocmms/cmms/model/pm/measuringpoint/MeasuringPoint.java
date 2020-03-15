package com.ocmms.cmms.model.pm.measuringpoint;

import java.math.BigDecimal;
import java.util.Calendar;
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
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_MEASURINGPOINT", entityFormatMessage = "entity_format_message_pm_measuringpoint")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class MeasuringPoint {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "measuringPointGen", sequenceName = "SEQ_PM_MEASURINGPOINT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "measuringPointGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "measuringTag", unique = true)
	private String measuringTag;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DESCRIPTION")
	private String description;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEASURINGTYPE")
	@EntityFormat
	private MeasuringType measuringType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEDIUM")
	@EntityFormat
	private Medium medium;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "LOWLIMIT", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal lowLimit;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "UPPERLIMIT", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal upperLimit;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "LOWALARM", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal lowAlarm;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "UPPERALARM", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal upperAlarm;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "LOWInterlock", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal lowInterlock;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "UPPERInterlock", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	private BigDecimal upperInterlock;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNITOFMEASURE")
	@EntityFormat
	private UnitOfMeasure unitOfMeasure;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPMENT")
	@EntityFormat
	private Equipment equipment;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "measuringPoint")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "measuringPoint")
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
