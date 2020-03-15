package com.ocmms.cmms.model.pm.task;



import com.ocmms.cmms.model.system.RecordStatus;
import io.springlets.format.EntityFormat;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import java.util.Calendar;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;

/**
 * General Maintenance Task List
General task lists will be created for a type of job rather than a specific functional location or
piece of equipment. These Task Lists can be used as a common task list for equipment and
functional locations. Therefore the general Task List can be used for:
• Corrective maintenance
• Preventive maintenance and
• Refurbishment processing
The Task List can also be created with reference to other task lists. The Task List will be
identified by:
• Group name – This is a logical naming convention given to general task lists (consisting of
8 characters; Coding Standard: XXYYYYYN where
XX = Plant Code (BZ, MV, SN, etc.)
YYYYY = 5 character Object Type Code (global object types)
N = Sequence character (A – Z)
MV10100A = Mt. Vernon Boiler
• Counter – Each task list within a general task list group will have a unique counter number
Only Spare Parts (ERSA) and Non-Valuated Materials (UNBW) components with the Item
Category L for Stock Item can be assigned to the General task lists operations.
1
The Task List type that will be used to create a general Task List is Task List Type A.
 
	A (" General Maintenance Task List",1),
	

	 * Functional Location Task List
Functional location Task Lists will be created for a specific functional location and can only
be used for that FL. It is possible to have multiple task lists created for the same FL. Each of
these Task Lists will have their own unique counter number. It can be used for:
• Corrective maintenance and
• Preventive maintenance
The Task List can also be created with reference to other task lists by copying the existing
operations and making changes where necessary. The FL Task List is created in third and
fourth levels and fifth levels. The Task List will be identified by:
• Group name – This is automatically generated
• Counter – Each task list within a functional location task list group will have a unique
counter number
2
The Task List type that will be used to create a Functional location Task List is Task List
Type T.

	T (" Functional Location Task List",2),
	
	
	 * Equipment Task List
Equipment Task Lists will be created for a specific piece of equipment and can only be used
for that piece of equipment. It is possible to have multiple task lists created for the same
piece of equipment. Each of these Task Lists will have their own unique counter number.
Can be used for:
• Corrective maintenance and
• Preventive maintenance
The Task List can also be created with reference to other task lists by copying the existing
operations and making changes where necessary. The Task List will be identified by:
• Group name – This is automatically generated
• Counter – Each task list within an equipment task list group will have a unique counter
number
3
The Task List type that will be used to create an Equipment Task List is Task List Type E.
	
	E (" Equipment Task List",3);
	 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_TASK_TYPE", entityFormatMessage = "entity_format_message_pm_task_type")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class TaskType {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "taskTypeGen", sequenceName = "SEQ_PM_TASK_TYPE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskTypeGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "TYPE", unique = true)
	private String type;

	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "DESCRIPTION", unique = true)
	private String description;

		
	
	

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
