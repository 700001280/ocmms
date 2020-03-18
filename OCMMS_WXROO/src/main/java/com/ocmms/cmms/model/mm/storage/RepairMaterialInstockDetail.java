package com.ocmms.cmms.model.mm.storage;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;

import io.springlets.format.EntityFormat;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * = MaterialInstockDetail TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_STORAGE_REPAIRMATERIALINSTOCKDETAIL", entityFormatMessage = "entity_format_message_mm_storage_repairmaterialinstockdetail")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class RepairMaterialInstockDetail extends InstockDetail {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "repairMaterialInstockDetailGen", sequenceName = "SEQ_MM_STORAGE_REPAIRMATERIALINSTOCKDETAIL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "repairMaterialInstockDetailGen")
	@Column(name = "ID")
	private Long id;	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARTMAINTENANCERECORD")
	@EntityFormat
	private PartMaintenanceRecord partMaintenanceRecord;
	

}
