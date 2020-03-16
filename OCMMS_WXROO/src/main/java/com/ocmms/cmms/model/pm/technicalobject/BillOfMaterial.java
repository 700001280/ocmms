package com.ocmms.cmms.model.pm.technicalobject;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import javax.validation.constraints.NotNull;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;

/**
 * Bill of materials<br>
 * 
 * Bill of materials have different uses in SAP and for Plant Maintenance. The
 * maintenance BOM will contain the items relevant to Plant Maintenance. The
 * maintenance BOM has important functions (usage) that include: Structuring of
 * the object: This is the structure of the object from a maintenance point of
 * view Spare parts planning in an order: This will simplify the spare parts
 * planning during maintenance planning or maintenance order creation Spare
 * parts planning in task lists: Spare parts can be planned in the task lists
 * based on the BOM
 * 
 * The BOM is a structured list of all the components (parts) that make up a
 * technical object.
 *
 * Materials, Equipment and Functional Locations are the three categories of
 * maintenance bill of materials.
 * 
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_TECHNICALOBJECT_BILLOFMATERIAL", entityFormatMessage = "entity_format_message_pm_technicalobject_billofmaterial")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class BillOfMaterial  extends TechnicalObject {	 
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "billOfMaterialGen", sequenceName = "SEQ_PM_TECHNICALOBJECT_BILLOFMATERIAL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billOfMaterialGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "NW_TECHNICALOBJECT_BOMS", joinColumns = {
			@JoinColumn(name = "BOM_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "TECHNICALOBJECT_ID", nullable = false, updatable = false) })
	private Set<TechnicalObject> technicalObjects = new HashSet<TechnicalObject>();	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BOMCOMPONENT")
	@EntityFormat
	private MaterialCatalog bomComponent;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SETSIZE")
	@NumberFormat
	private BigDecimal setSize;	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SAFESTOCK")
	@NumberFormat
	private BigDecimal safestock;	
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNIT")
	private UnitOfMeasure unit;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DRAWINGNUMBER")
	private String drawingNumber;	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "TECHPOSITIONNUMBER")
	private String techPositionNumber;		

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PARAMETER")
	private String parameter;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "POSITIONNUMBER")
	private String positionNumber;	
	
	
	/**
	 * Stock - L / NonStock - N (1)
	 *
	 */
	@NotNull
	@Column(name = "NEEDSTOCK")
	private Boolean needStock;	

}
