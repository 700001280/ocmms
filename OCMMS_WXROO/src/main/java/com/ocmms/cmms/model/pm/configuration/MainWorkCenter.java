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

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Department;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

/**
 * The Main Work Center will be assigned in the following records as the
 * responsible maintenance work center: • Functional Locations and Equipment •
 * Task Lists • Maintenance Notifications and Orders When the Main Work Centers
 * are created: • The Basic Data, Defaults, Capacities, (Operating time with 1
 * capacity) and Costing (Cost Center) tabs will be completed for the master
 * record. • It will be used in capacity evaluation to aggregate operational
 * work centers.
 *
 * @author qinzeyong
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_CONFIGURATION_MAINWORKCENTER", entityFormatMessage = "entity_format_message_pm_configuration_mainworkcenter")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class MainWorkCenter {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "mainWorkCenterGen", sequenceName = "SEQ_PM_CONFIGURATION_MAINWORKCENTER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mainWorkCenterGen")
    @Column(name = "ID")
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT")
    @EntityFormat
    private Department department;

    /**
     * Work Center Code,eg: MTCE-01
     *
     */
    @NotNull
    @Column(name = "CODE", unique = true, length = 8)
    private String code;

    /**
     * Work Center Code,eg: PM02
     *
     */
    @NotNull
    @Column(name = "CATEGORY", length = 10)
    private String category;

    /**
     * WORK CENTER NAME:MAINTENANCE DEPARTMENT
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

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HIERARCHYWORKCENTER")
    @EntityFormat
    private HierarchyWorkCenter hierarchyWorkCenter;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "mainWorkCenter")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Equipment> technicalObjects = new HashSet<Equipment>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "mainWorkCenter")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<OperationalWorkCenter> operationalWorkCenters = new HashSet<OperationalWorkCenter>();

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
