/***
 * @Version 0.0.0.4
 * @Update Jan 6, 2018
 * @author Alex Qin
 * @LogList
 *
 */
package com.ocmms.cmms.model.pm.technicalobject;

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

import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = FunctionalLocation TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_TECHNICALOBJECT_FUNCTIONLOCATION")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class FunctionalLocation extends TechnicalObject implements Serializable {

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

	private FunctionalLocation superiorFunctionalLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "functionalLocation")

	private Set<Equipment> equipments = new HashSet<Equipment>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "functionalLocation")

	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "functionalLocation")

	private Set<ImageDocument> images = new HashSet<ImageDocument>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	
}
