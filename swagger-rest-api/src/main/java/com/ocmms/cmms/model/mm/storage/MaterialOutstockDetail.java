package com.ocmms.cmms.model.mm.storage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import lombok.Data;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * = MaterialOutstockDetail TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_STORAGE_MATERIALOUTSTOCKDETAIL")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class MaterialOutstockDetail extends OutstockDetail implements Serializable {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "ORDERNO")
	private String orderNo;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ISSUEDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar issueDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPMENTMAINTENANCERECORD")

	private EquipmentMaintenanceRecord equipmentMaintenanceRecord;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARTMAINTENANCERECORD")

	private PartMaintenanceRecord partMaintenanceRecord;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	
}
