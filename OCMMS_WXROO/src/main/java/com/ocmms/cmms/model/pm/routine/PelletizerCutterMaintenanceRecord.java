package com.ocmms.cmms.model.pm.routine;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_ROUTINE_PELLETIZERCUTTERMAINTENANCERECORD", entityFormatMessage = "entity_format_message_pm_routine_pelletizercuttermaintenancerecord")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class PelletizerCutterMaintenanceRecord extends PartMaintenanceRecord {

	
}
