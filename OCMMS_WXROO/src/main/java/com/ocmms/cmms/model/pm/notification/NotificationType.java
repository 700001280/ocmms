package com.ocmms.cmms.model.pm.notification;

import com.ocmms.cmms.model.system.RecordStatus;
import io.springlets.format.EntityFormat;
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
import javax.validation.constraints.Size;

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

/**
 * Maintenance Notification - Corrective (Planned) Notification<br>
 * 
 * The Corrective Notification will be created to request maintenance assistance
 * for planned corrective maintenance activities. The notification type M1 will
 * be used to request the following types of maintenance Tasks: General
 * maintenance Inspections Improvements Upgrades of technical objects Condition
 * monitoring can initiate the automatic creation of a Corrective
 * Notification<br>
 * 
 * 
 * 
 * Maintenance Notification - Breakdown (Unplanned) Notification<br>
 * 
 * The Breakdown Notification will be created to report the breakdown of a
 * particular technical object. The notification type M2 will be used to record:
 * Breakdown dates and times Malfunction history System availability details<br>
 * 
 * The Breakdown Notification can be created before or after the breakdown has
 * been rectified as it is a process, that might cause production losses.<br>
 * 
 * 
 * 
 * Maintenance Notification - Activity Report<br>
 * 
 * The Activity Report will be created when during preventive maintenance order
 * processing a fault is discovered on a particular technical object.<br>
 * 
 * The notification type M3 will be used to create the activity report. These
 * notification types will not be converted to maintenance orders.<br>
 * 
 * This type of notification can also be used in preventive maintenance to
 * record technical history for technical objects.<br>
 * 
 * 
 * 
 * Maintenance Notification - Preventive Maintenance Notification<br>
 * 
 * The Preventive Maintenance notification will be created automatically by
 * maintenance plans, and will not be created manually by users.<br>
 * 
 * The notification type M4 will be used in the system to create the preventive
 * maintenance notification to perform: Inspection by operations Record
 * technical history This Notification type will not be converted to a
 * maintenance order<br>
 * 
 * 
 * 
 * The Project Maintenance notification will be created to request maintenance
 * activities to be performed for projects that include: Engineering and
 * Maintenance<br>
 * 
 * The notification type M5 will be used to create the project maintenance
 * notification and can be used to record technical history in the system. The
 * project WBS (Work Breakdown Structure) element will be included in the
 * account assignment of the notification record. Project Engineers will be
 * responsible for creating project requests for Engineering Projects.<br>
 * 
 * 
 * 
 * Maintenance Notification - Turnaround Request Notification<br>
 * 
 * The Turnaround Request notification will be created to request maintenance
 * activities to be performed during the plant Turnaround.<br>
 * 
 * The notification type M6 will be used to create the turnaround request
 * notification and can be used to record technical history in the system. The
 * Project WBS (Work Breakdown Structure) element from a turnaround project will
 * be included in the account assignment of the notification record.<br>
 * 
 * @author qinzeyong
 * @version 3.0.0.0
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_NOTIFICATION_TYPE", entityFormatMessage = "entity_format_message_pm_notification_type")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class NotificationType {

	/**
	 * 
	 * Auto Generation by System
	 * 
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Id
	@SequenceGenerator(name = "notificationTypeGen", sequenceName = "SEQ_PM_NOTIFICATION_TYPE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notificationTypeGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * 
	 */
	@NotNull
	@Column(name = "CODE")
	@Size(max = 10)
	private String code;

	/**
	 * 
	 */
	@NotNull
	@Column(name = "TYPE")
	private String type;

	/**
	 * Outstanding Postponed In process Completed
	 */
	@Column(name = "DESCRIPTION")
	private String description;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "notificationType")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<NotificationHeader> notificationHeaders = new HashSet<NotificationHeader>();

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
