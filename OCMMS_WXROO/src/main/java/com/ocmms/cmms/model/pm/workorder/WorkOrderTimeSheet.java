package com.ocmms.cmms.model.pm.workorder;


import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

/**
 * 
 * @author qinzeyong
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_WORKORDER_TIMESHEET", entityFormatMessage = "entity_format_message_pm_workorder_timesheet")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class WorkOrderTimeSheet {

	/**
	 * Type: Long <br>
	 * database id<br>
	 * Auto Generation by System
	 * 
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Id
	@SequenceGenerator(name = "timeSheetGen", sequenceName = "SEQ_PM_WORKORDER_TIMESHEET_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timeSheetGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * WorkOrderPriority
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORKORDEROPERATION")
	@EntityFormat
	private WorkOrderOperation workOrderOperation;
	
	/**
	 * OperationalWorkCenter
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORKER")
	@EntityFormat
	private Employee worker;
	
	@NotNull
	@Column(name = "WORKHOURS")
	private BigDecimal workHours;
	

	@Column(name = "WORKDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar workDate;	
	
	/**
	 * OperationalWorkCenter
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APPROVER")
	@EntityFormat
	private Employee approver;
	
	@Column(name = "APPROVEDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar approveDate;	
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