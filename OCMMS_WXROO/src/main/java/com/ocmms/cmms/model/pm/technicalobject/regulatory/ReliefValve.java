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

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_REGULATORY_RELIEFVALVE", entityFormatMessage = "entity_format_message_pm_regulatory_reliefvalve")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class ReliefValve extends TechnicalObject {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "ReliefValveGen", sequenceName = "SEQ_PM_REGULATORY_RELIEFVALVE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ReliefValveGen")
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
	@Column(name = "NOMINALPRESSURE")
	@NumberFormat
	private BigDecimal nominalPressure;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "WORKINGPRESSURE")
	@NumberFormat
	private BigDecimal workingPressure;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SETTINGPRESSURE")
	@NumberFormat
	private BigDecimal settingPressure;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "NOMINALDIAMETER")
	@NumberFormat
	private BigDecimal nominalDiameter;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DESIGNTEMPERATURE")
	@NumberFormat
	private BigDecimal designTemperature;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "WORKINGTEMPERATURE")
	@NumberFormat
	private BigDecimal workingTemperature;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CONNECTIONTYPE")
	private String connectionType;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MEDIUM")
	private String medium;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "FLUIDSTATE")
	private String fluidState;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DISCHARGELOCATION")
	private String dischargeLocation;
	
	
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
	@Column(name = "CLASSIFICATIONCATEGORY")
	private String classificationCategory;
    
	

}
