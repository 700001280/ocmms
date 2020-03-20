package com.ocmms.cmms.model.hrm;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
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
 * = Plant1 TODO Auto-generated class documentation
 *
 */

@RooJavaBean
@RooToString
@RooJpaEntity(table = "HRM_PLANT", entityFormatMessage = "entity_format_message_hrm_plant")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class Plant extends Organization {
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "plantGen", sequenceName = "SEQ_HRM_PLANT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plantGen")
	@Column(name = "ID")
	private Long id;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "plant")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<PlantLocation> plantLocations = new HashSet<PlantLocation>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "plant")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<PlantSection> plantSections = new HashSet<PlantSection>();

	
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPANY")
	@EntityFormat
	private Company company;

}
