package com.ocmms.cmms.model.mm.procurement;

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
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;

import io.springlets.format.EntityFormat;
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_PROCUREMENT_ SERVICEITEMDETAIL", entityFormatMessage = "entity_format_message_mm_procurement_serviceitemdetail")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class ServiceProcurementItemDetail  extends ProcurementItemDetail{

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "serviceProcurementItemDetailGen", sequenceName = "SEQ_MM_PROCUREMENT_SERVICEITEMDETAIL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serviceProcurementItemDetailGen")
	@Column(name = "ID")
	private Long id;


	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SERVICECATALOG")
	@EntityFormat
	private ServiceCatalog serviceCatalog;	

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "DESCRIPTION")
	private String description;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "serviceProcurementItemDetail")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ServiceReceiveDetail> serviceReceiveDetails = new HashSet<ServiceReceiveDetail>();
        
        

}
