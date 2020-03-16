package com.ocmms.cmms.model.pm.configuration;

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
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

/**
 * The Machine Work Center represents fixed machines as well as fleet objects
 * that need to be scheduled and costed in maintenance orders. Machine Work
 * Centers will be used within capacity evaluation and assigned to operations
 * in: • Task Lists and • Maintenance Orders Machine Work Center will not be
 * included in a work center hierarchy and when created: • The Basic Data,
 * Defaults, Capacities, Scheduling, and Costing tabs will be completed for the
 * master record
 * 
 * @author qinzeyong
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_CONFIGURATION_MACHINEWORKCENTER", entityFormatMessage = "entity_format_message_pm_configuration_machineworkcenter")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class MachineWorkCenter {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "machineWorkCenterGen", sequenceName = "SEQ_PM_CONFIGURATION_MACHINEWORKCENTER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "machineWorkCenterGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Organization")
	@EntityFormat
	private Organization organization;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OPERATIONALWORKCENTER")
	@EntityFormat
	private OperationalWorkCenter operationalWorkCenter;

	/**
	 * Work Center Code,eg: ME-01/EL-01
	 *
	 */
	@NotNull
	@Column(name = "CODE", unique = true, length = 8)
	private String code;

	/**
	 * Work Center Code,eg: PM03
	 *
	 */
	@NotNull
	@Column(name = "CATEGORY", length = 10)
	private String category;

	/**
	 * WORK CENTER NAME:MECHANIC ELECTRICIAN
	 *
	 * 
	 */
	@NotNull
	@Column(name = "DESCRIPTION", unique = true, length = 40)
	private String description;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESPONSIBLE")
	@EntityFormat
	private WorkCenterResponsible responsible;

	/**
	 * CONTROLKEY:PMIN PMEX
	 *
	 */
	@NotNull
	@Column(name = "CONTROLKEY", length = 4)
	private String controlKey;

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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAPACITYUNITOFMEASURE")
	@EntityFormat
	private UnitOfMeasure capacityUnitOfMeasure;

	/**
	 * notification reported date<br>
	 * 
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "CAPACITYSTARTTIME")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "-M")
	private Calendar capacityStartTime;

	/**
	 * notification reported date<br>
	 * 
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "CAPACITYENDTIME")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "-M")
	private Calendar capacityEndTime;

	/**
	 * Capacity Utilization (in Percentage)
	 *
	 */
	@NotNull
	@Column(name = "CAPACITYUTILIZATION")
	private Integer capacityUtilization;

	/**
	 * Capacity Utilization (in Percentage)
	 *
	 */
	@NotNull
	@Column(name = "NUMBEROFCAPACITIES")
	private Integer numberofCapacities;

	/**
	 * notification reported date<br>
	 * 
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "VALIDITYSTARTDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar validityStartDate;

	/**
	 * notification reported date<br>
	 * 
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "VALIDITYENDDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar validityEndDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COSTCENTER")
	@EntityFormat
	private CostCenter costCenter;

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