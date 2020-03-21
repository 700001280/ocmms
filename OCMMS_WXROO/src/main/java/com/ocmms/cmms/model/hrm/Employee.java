package com.ocmms.cmms.model.hrm;

import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.system.RecordStatus;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;

/**
 * = Person TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "HRM_PERSON", entityFormatMessage = "entity_format_message_hrm_employee")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class Employee {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "personGen", sequenceName = "SEQ_HRM_PERSON_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personGen")
    @Column(name = "ID")
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION")
    @EntityFormat
    private Organization organization;

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
    @JoinColumn(name = "MAINTWORKCENTER")
    @EntityFormat
    private MainWorkCenter maintWorkCenter;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "PERSONNUMBER")
    private String personNumber;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Email
    @Column(name = "EMAIL")
    private String email;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Column(name = "PHONE")
    private String phone;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "FIRSTNAME")
    private String firstName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "LASTNAME")
    private String lastName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "FAX")
    private String fax;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "sex", nullable = true, length = 1)
    private String sex;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar birthday;

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
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "reportedBy")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<NotificationHeader> notificationHeaders = new HashSet<NotificationHeader>();
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "employee")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Document> documents = new HashSet<Document>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "employee")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<ImageDocument> images = new HashSet<ImageDocument>();
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "taskOwner")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<TaskTracking> taskTrackings = new HashSet<TaskTracking>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "logger")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<WorkLog> workLogs = new HashSet<WorkLog>();
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "requester")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<ProcurementItemDetail> procurementItemDetails = new HashSet<ProcurementItemDetail>();
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "requester")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<ProcurementRequest> procurementRequests = new HashSet<ProcurementRequest>();
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "owner")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<PreventiveMaintenanceStandard> preventiveMaintenanceStandards = new HashSet<PreventiveMaintenanceStandard>();
    
    
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
