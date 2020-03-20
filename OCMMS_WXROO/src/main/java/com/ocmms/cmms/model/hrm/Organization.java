package com.ocmms.cmms.model.hrm;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.common.Address;

import io.springlets.format.EntityFormat;

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

/**
 * = OrgComInformation TODO Auto-generated class documentation
 *
 */

@RooJavaBean
@RooToString
//@RooJpaEntity(inheritanceType = "JOINED", mappedSuperclass = true)
@RooJpaEntity(inheritanceType = "SINGLE_TABLE",table = "HRM_ORGANIZATION", entityFormatMessage = "entity_format_message_hrm_organization")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class Organization extends OrgComInformation {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "organizationGen", sequenceName = "SEQ_HRM_ORGANIZATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organizationGen")
	@Column(name = "ID")
	private Long id;

	
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORGANIZATIONCATALOG")
	@EntityFormat
	private OrganizationCatalog organizationCatalog;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS")
	@EntityFormat
	private Address address;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Department> departments = new HashSet<Department>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Employee> employees = new HashSet<Employee>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<CostCenter> costCenters = new HashSet<CostCenter>();
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Warehouse> warehouses = new HashSet<Warehouse>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MaterialPlantInfo> materialPlantInfos = new HashSet<MaterialPlantInfo>();
	
		
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ProcurementItemDetail> procurementItemDetails = new HashSet<ProcurementItemDetail>();	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<HierarchyWorkCenter> hierarchyWorkCenters = new HashSet<HierarchyWorkCenter>();

	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<WorkCenterResponsible> workCenterResponsibles = new HashSet<WorkCenterResponsible>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<OperationalWorkCenter> operationalWorkCenters = new HashSet<OperationalWorkCenter>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<TechnicalObject> technicalObjects = new HashSet<TechnicalObject>();
	
}
