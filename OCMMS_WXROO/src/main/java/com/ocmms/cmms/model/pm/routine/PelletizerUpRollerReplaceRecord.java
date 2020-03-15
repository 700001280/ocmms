package com.ocmms.cmms.model.pm.routine;

import java.math.BigDecimal;

import javax.persistence.Column;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_ROUTINE_PELLETIZERUPROLLERREPLACERECORD", entityFormatMessage = "entity_format_message_pm_routine_pelletizeruprollerreplacerecord")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class PelletizerUpRollerReplaceRecord extends PartReplaceRecord {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ONLINERUNTIME")
	private BigDecimal onlineRunTime;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "OFFLINERUNTIME")
	private BigDecimal offlineRunTime;

}
