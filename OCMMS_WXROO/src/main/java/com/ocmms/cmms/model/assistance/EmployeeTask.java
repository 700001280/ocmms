package com.ocmms.cmms.model.assistance;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.dto.annotations.RooEntityProjection;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.srm.Vendor;

import io.springlets.format.EntityFormat;

/**
 * = EmployeeTask
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooEquals
@RooEntityProjection(entity = TaskTracking.class, fields = { "id", "submitDate", "submitter","description","targetDate","memo"}, formatExpression = "#{description}")
public class EmployeeTask {

    private Long id;

    @NotNull
    @Size(min = 10)
    private String description;
    
    /**
	 * TODO Auto-generated attribute documentation
	 *
	 */	
	@DateTimeFormat(style = "M-")
	private Calendar submitDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */	
	@EntityFormat
	private Employee submitter;		


	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */	
	@DateTimeFormat(style = "MM")
	private Calendar targetDate;

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull	
	private String memo;

	
}
