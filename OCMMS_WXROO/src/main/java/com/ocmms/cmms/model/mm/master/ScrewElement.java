package com.ocmms.cmms.model.mm.master;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * = MaterialPlantInfo TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_MASTER_SCREWELEMENT", entityFormatMessage = "entity_format_message_mm_master_screwelement")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class ScrewElement extends MaterialPlantInfo {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "screwElementGen", sequenceName = "SEQ_MM_MASTER_SCREWELEMENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screwElementGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MACHINETYPE")
	private String machineType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SCREWTYPE")
	private String screwType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MEMO")
	private String memo;

}
