package com.ocmms.cmms.model.pm.routine;

import java.math.BigDecimal;
import javax.persistence.Column;

import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * = PelletizerCutterReplaceRecord TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_ROUTINE_PELLETIZERCUTTERREPLACERECORD")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class PelletizerCutterReplaceRecord extends PartReplaceRecord implements Serializable {

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

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	
}
