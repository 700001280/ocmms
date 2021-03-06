package com.ocmms.cmms.model.pm.routine;

import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * = PelletizerCutterMaintenanceRecord TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_ROUTINE_PELLETIZERCUTTERMAINTENANCERECORD")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class PelletizerCutterMaintenanceRecord extends PartMaintenanceRecord implements Serializable {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;
}
