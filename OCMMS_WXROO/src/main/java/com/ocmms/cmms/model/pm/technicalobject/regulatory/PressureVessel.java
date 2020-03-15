package com.ocmms.cmms.model.pm.technicalobject.regulatory;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_REGULATORY_PRESSUREVESSEL", entityFormatMessage = "entity_format_message_pm_regulatory_pressurevessel")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class PressureVessel extends Equipment {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "PressureVesselGen", sequenceName = "SEQ_PM_REGULATORY_PRESSUREVESSEL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PressureVesselGen")
	@Column(name = "ID")
	private Long id;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
    @Column(name = "LASTINSPECTIONDATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar lastInspectionDate;
    
    /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
    @Column(name = "NEXTINSPECTIONDATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar nextInspectionDate;
    
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SERVICEREGISTRATIONNUMBER")
	private String serviceRegistrationNumber;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MANUFACTURERNAME")
	private String manufacturerName;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
    @Column(name = "MANUFACTUREDATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar manufactureDate;

    
    /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DESIGNEDSERVICELIFE")
	@NumberFormat
	private BigDecimal designedServiceLife;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DESIGNPRESSURE")
	@NumberFormat
	private BigDecimal designPressure;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MAWP")
	@NumberFormat
	private BigDecimal maximumAllowableWorkingPressure;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PRESSUREVESSELCATEGORY")
	private String pressureVesselCategory;
    
}
