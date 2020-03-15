package com.ocmms.cmms.model.hrm;

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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import io.springlets.format.EntityFormat;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;

import javax.validation.constraints.NotNull;

/**
 * = Plant TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "HRM_DEPARTMENT",  entityFormatMessage = "entity_format_message_hrm_department")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class Department  extends Organization  {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "DepartmentGen", sequenceName = "SEQ_HRM_DEPARTMENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DepartmentGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORGANIZATION")
	@EntityFormat
	private Organization organization;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "department")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MainWorkCenter> maintWorkCenters = new HashSet<MainWorkCenter>();

}