/***
 * @Version 0.0.0.4
 * @Update Jan 6, 2018
 * @author Alex Qin
 * @LogList
 *
 */
package com.ocmms.cmms.model.pm.technicalobject;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import io.springlets.format.EntityFormat;

/**
 * Functional Locations:<br>
 * 
 * Functional locations are hierarchically ordered structures that will
 * represent a technical system, building or part of the building. Technical
 * objects can be installed here. You can structure them according to: Spatial
 * criteria – For example, building 1 or building 2 Technical criteria – For
 * example drive unit or pumping station Process-oriented criteria - For example
 * condensation or polymerisation<br>
 * Each functional location is managed separately to enable:<br>
 * Managing the data effectively for each object individually<br>
 * Performing individual maintenance tasks for the object <br>
 * Keeping record of the tasks performed for the object <br>
 * To collect and evaluate data over longer periods of time
 * 
 * @author qinzeyong
 * @version 3.0.0.0
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_TECHNICALOBJECT_FUNCTIONLOCATION", entityFormatMessage = "entity_format_message_pm_technicalobject_functionlocation")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class FunctionalLocation extends TechnicalObject {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "functionLocationGen", sequenceName = "SEQ_PM_TECHNICALOBJECT_FUNCTIONLOCATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "functionLocationGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "LOCATION", unique = true, length = 30)
	private String location;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "EQUIPMENTALLOWEDIND")
	private Boolean equipmentAllowedInd;

	/**
	 * strIndicator:SABIC
	 *
	 */
	@Column(name = "STRINDICATOR")
	private String strIndicator;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */

	@Column(name = "FUNCTIONALLOCATIONCATEGORY")
	private String functionalLocationCcategory;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUPERIORFUNCTIONALLOCATION")
	@EntityFormat
	private FunctionalLocation superiorFunctionalLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "functionalLocation")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Equipment> equipments = new HashSet<Equipment>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "functionalLocation")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "functionalLocation")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ImageDocument> images = new HashSet<ImageDocument>();
}
