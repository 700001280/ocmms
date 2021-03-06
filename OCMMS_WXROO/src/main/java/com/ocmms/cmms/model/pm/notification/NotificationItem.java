package com.ocmms.cmms.model.pm.notification;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

/**
 * A notification can contain several items. Reference Objects: All the
 * maintenance notification types can be created for a functional location or
 * for equipment, with or without an assembly, or for a material with a serial
 * number. The hierarchy of this object corresponds to the sequence specified.
 * This means, if you enter a maintenance notification for an assembly on a
 * piece of equipment, which is assigned to a functional location, the system
 * transfers all the relevant data for the piece of equipment and the functional
 * location.
 * @author qinzeyong
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_NOTIFICATION_ITEM", entityFormatMessage = "entity_format_message_pm_notification_item")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class NotificationItem {

	/**
	 * Auto Generation by System
	 */
	@Id
	@SequenceGenerator(name = "notificationItemGen", sequenceName = "SEQ_PM_NOTIFICATION_ITEM_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notificationItemGen")
	@Column(name = "ID")
	private Long id;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NOTIFICATIONHEADER")
	@EntityFormat
	private NotificationHeader notificationHeader;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FAILUREOBJECTPART")
	@EntityFormat
	private FailureObjectPart failureObjectPart;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FAILUREDAMAGETYPE")
	@EntityFormat
	private FailureDamageType failureDamageType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FAILUREDAMAGECAUSE")
	@EntityFormat
	private FailureDamageCause failureDamageCause;
	
	@NotNull
	@Column(name = "FAILUREDESCRIPTION")	
	private String failureDescription;
	
	
	@NotNull
	@Column(name = "ACTIVITY")	
	private String activity;

	
	@Column(name = "EXECUTIONFACTOR")	
	private String executionFactor;	
	
	@NotNull
	@Column(name = "CAUSEOFDAMAGE")	
	private String causeOfDamage;

	
	@Column(name = "MEMO")	
	private String memo;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "notificationItem")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();	
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "notificationItem")
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
