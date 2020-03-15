package com.ocmms.cmms.model.pm.routine;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import com.ocmms.cmms.model.pp.configuration.ShaftType;

import io.springlets.format.EntityFormat;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * = EquipmentReplaceRecord TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_ROUTINE_EXTRUDERSHAFTREPLACERECORD", entityFormatMessage = "entity_format_message_pm_routine_extrudershaftreplacerecord")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class ExtruderShaftReplaceRecord extends EquipmentReplaceRecord {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SHAFTTYPE")
	@EntityFormat
	private ShaftType shaftType;

}
