package com.ocmms.cmms.model.mm.master;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;

/**
 * = MaterialCatalog TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_SERVICECATALOG", entityFormatMessage = "entity_format_message_mm_master_servicecatalog")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class ServiceCatalog extends MROCatalog {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "serviceCatalogGen", sequenceName = "SEQ_MM_SERVICECATALOG_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serviceCatalogGen")
	@Column(name = "ID")
	private Long id;

	/** * TODO Auto-generated attribute documentation * */
	@Column(name = "CATEGORY")
	private String category;
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PURPOSE")
	private String purpose;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "GENERALLEDGERACCOUNT")
	private String generalLedgerAccount;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "serviceCatalog")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ServiceProcurementItemDetail> serviceProcurementItemDetails = new HashSet<ServiceProcurementItemDetail>();

}
