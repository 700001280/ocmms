package com.ocmms.cmms.model;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "tasks")
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@Column(name = "description")
    private String description;

	@Column(name = "reference_id")
    private String referenceId;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "task_type")
    private TaskType taskType;
	
	@Column(name = "assign_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date assignDate;
	
	@Column(name = "target_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date targetDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
    private TaskStatus status;
	
	@Column(name = "complete_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date completeDate;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinColumn(name = "owner", nullable = true, insertable = true, updatable = true)
	private Users owner;	
	
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinColumn(name = "support", nullable = true, insertable = true, updatable = true)
	private Users support;	
	
	@Column(name = "revised")
    private String revised;
	
	@Column(name = "memo")
    private String memo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public Date getAssignDate() {
		return assignDate;
	}

	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public Users getOwner() {
		return owner;
	}

	public void setOwner(Users owner) {
		this.owner = owner;
	}

	public Users getSupport() {
		return support;
	}

	public void setSupport(Users support) {
		this.support = support;
	}

	

	public String getRevised() {
		return revised;
	}

	public void setRevised(String revised) {
		this.revised = revised;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	
}
