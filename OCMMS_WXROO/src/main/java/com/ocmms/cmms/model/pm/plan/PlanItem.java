package com.ocmms.cmms.model.pm.plan;

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

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_PLAN_ITEM", entityFormatMessage = "entity_format_message_pm_plan_item")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class PlanItem {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "planItemGen", sequenceName = "SEQ_PM_PLAN_ITEM_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planItemGen")
    @Column(name = "ID")
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Column(name = "CODE", unique = true)
    private String code;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAN")
    @EntityFormat
    private PreventiveMaintenancePlan plan;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TECHNICALOBJECT")
    @EntityFormat
    private TechnicalObject technicalObject;

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
    @JoinColumn(name = "ORDERTYPE")
    @EntityFormat
    private WorkOrderType orderType;

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
    @JoinColumn(name = "SYSTEMCONDITION")
    @EntityFormat
    private SystemCondition systemCondition;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRIORITY")
    @EntityFormat
    private NotificationPriority priority;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAINTENANCEACTIVITYTYPE")
    @EntityFormat
    private MaintenanceActivityType maintenanceActivityType;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAINWORKCENTER")
    @EntityFormat
    private MainWorkCenter mainWorkCenter;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASKHEADER")
    @EntityFormat
    private TaskHeader taskHeader;

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
