package com.ocmms.cmms.model.pm.technicalobject;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import lombok.Data;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * = BillOfMaterial TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_TECHNICALOBJECT_BILLOFMATERIAL")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class BillOfMaterial extends TechnicalObject implements Serializable {

	
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

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	
}
