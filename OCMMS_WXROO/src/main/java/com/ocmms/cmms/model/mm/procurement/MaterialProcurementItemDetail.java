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

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;

import io.springlets.format.EntityFormat;
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_PROCUREMENT_ MATERIALITEMDETAIL", entityFormatMessage = "entity_format_message_mm_procurement_materialitemdetail")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class MaterialProcurementItemDetail extends ProcurementItemDetail{

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "materialProcurementItemDetailGen", sequenceName = "SEQ_MM_PROCUREMENT_MATERIALITEMDETAIL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "materialProcurementItemDetailGen")
	@Column(name = "ID")
	private Long id;

	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROCUREMENTREQUEST")
	@EntityFormat
	private ProcurementRequest procurementRequest;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PRNUMBER")
	private String prNumber;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROCUREMENTORDER")
	@EntityFormat
	private ProcurementOrder procurementOrder;
		
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PONUMBER")
	private String poNumber;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATERIALCATALOG")
	@EntityFormat
	private MaterialCatalog materialCatalog;
		
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MATERIAL")
	private String material;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORKORDERMATERIAL")
	@EntityFormat
	private WorkOrderMaterial workOrderMaterial;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialProcurementItemDetail")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MaterialInstockDetail> materialInstockDetails = new HashSet<MaterialInstockDetail>();

}
