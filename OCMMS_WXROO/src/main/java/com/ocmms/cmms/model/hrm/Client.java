package com.ocmms.cmms.model.hrm;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/**
 * = Client TODO Auto-generated class documentation
 *
 */

@RooJavaBean
@RooToString
@RooJpaEntity(table = "HRM_CLIENT",  entityFormatMessage = "entity_format_message_hrm_client")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class Client extends Organization {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "clientGen", sequenceName = "SEQ_HRM_CLIENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientGen")
	@Column(name = "ID")
	private Long id;	
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "client")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Company> companies = new HashSet<Company>();

}
