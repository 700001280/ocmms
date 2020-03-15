package com.ocmms.cmms.model.pm.routine;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * = EquipmentReplaceRecord TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_ROUTINE_PELLETIZERMAINTENANCERECORD", entityFormatMessage = "entity_format_message_pm_routine_pelletizermaintenancerecord")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class PelletizerMaintenanceRecord extends EquipmentMaintenanceRecord {

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
