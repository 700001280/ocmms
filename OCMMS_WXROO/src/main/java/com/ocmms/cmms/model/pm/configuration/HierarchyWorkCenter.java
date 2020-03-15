package com.ocmms.cmms.model.pm.configuration;

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
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

/**
 * Plant Maintenance Work Centers A Main Work Center is an organizational unit
 * within Plant Maintenance where maintenance work can be carried out. Main Work
 * Centers are part of master data and will provide the capacity required by the
 * plant to perform a task(s). These main work centers can be: A machine or
 * group of machines A person or a group of people Work Center for services (in
 * SADAF) <br>
 * A Main Work Center record should be created for the following purposes
 * identified as:<br>
 *
 * The responsible work center in a maintenance item<br>
 * The responsible work center in the FL and Equipment master records<br>
 * The responsible employee in the Maintenance Order header<br>
 * The executing work center in the operations of a Task List<br>
 * The executing work center in the operations of a Maintenance Order<br>
 *
 * The work center master record is used to record the details of the work
 * center.<br>
 * The work center master record consists of a number of tabs that stores this
 * information: <br>
 * Basic data: Name, description, usage 009, supply area to default the storage
 * location for spares, standard value key SAP0.<br>
 * Default values: Control key, printer name, <br>
 * Capacities: Capacity category, pooled capacity, other formula SAP008,
 * distribution key SAP050, internal distribution key SAP050, <br>
 * Capacity header: capacity planner group, factory calendar SA, active version
 * 1, UoM H, working times, break times, capacity utilization, number of
 * capacities, finite scheduling, used by multiple operations. Grouping 01 is to
 * be used if shift sequences and variable capacities per shift needs to be
 * defined. Scheduling: Capacity category, other formula key SAP004<br>
 * Costing: Start date, end date, cost center, activity type, calculation
 * formula SAP008.<br>
 *
 * The hierarchy work center is used to:<br> • Define the work center hierarchy
 * structure<br> • Represent the first level of the work center hierarchy When
 * the Hierarchy Work Center is created:<br> • Only the Basic Data tab will be
 * completed for the master record<br> • It will not be used for any technical
 * objects or within maintenance orders and task lists (task list usage 000)
 *
 * @author qinzeyong
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_CONFIGURATION_HIERARCHYWORKCENTER", entityFormatMessage = "entity_format_message_pm_configuration_hierarchyworkcenter")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class HierarchyWorkCenter {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "hierarchyWorkCenterGen", sequenceName = "SEQ_PM_CONFIGURATION_HIERARCHYWORKCENTER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hierarchyWorkCenterGen")
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
     * Work Center Code,eg: CQ
     *
     */
    @NotNull
    @Column(name = "CODE", unique = true, length = 10)
    private String code;

    /**
     * Work Center Code,eg: PM01
     *
     */
    @NotNull
    @Column(name = "CATEGORY", length = 10)
    private String category;

    /**
     * WORK CENTER NAME
     *
     */
    @NotNull
    @Column(name = "NAME", unique = true, length = 40)
    private String name;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE")
    @EntityFormat
    private WorkCenterResponsible responsible;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "hierarchyWorkCenter")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<MainWorkCenter> mainWorkCenters = new HashSet<MainWorkCenter>();

    /**
     * ** General Information Generated By System Start ***
     */
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
    /**
     * ** General Information Generated By System End *****
     */
}
