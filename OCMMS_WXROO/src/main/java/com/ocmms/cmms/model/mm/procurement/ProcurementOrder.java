/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ocmms.cmms.model.mm.procurement;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import com.ocmms.cmms.model.srm.Vendor;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

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
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

/**
 * = PurchaseDetail TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_PROCUREMENT_ORDER", entityFormatMessage = "entity_format_message_mm_procurement_order")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class ProcurementOrder {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "procurementOrderGen", sequenceName = "SEQ_MM_PROCUREMENT_ORDER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "procurementOrderGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIORITYTYPE")
	@EntityFormat
	private PriorityType priorityType;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATALOGTYPE")
	@EntityFormat
	private CatalogType catalogType;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "procurementOrder")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<PurchaseExpedite> purchaseExpedites = new HashSet<PurchaseExpedite>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "procurementOrder")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ProcurementOrderFinanceTracking> procurementOrderFinanceTrackings = new HashSet<ProcurementOrderFinanceTracking>();
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "procurementOrder")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ProcurementItemDetail> pocurementItemDetails = new HashSet<ProcurementItemDetail>();
	        
        /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "procurementOrder")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();
        
         /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "procurementOrder")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ImageDocument> images = new HashSet<ImageDocument>();
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUPPLIER")
	@EntityFormat
	private Vendor supplier;	

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ORDERDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar orderDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "ORDERNUMBER")
	private String orderNumber;

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
	@Column(name = "CLOSED")
	private Boolean closed;

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
