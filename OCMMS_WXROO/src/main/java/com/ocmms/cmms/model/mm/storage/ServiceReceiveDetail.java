package com.ocmms.cmms.model.mm.storage;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import io.springlets.format.EntityFormat;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * = MaterialInstockDetail TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "MM_STORAGE_SERVICERECEIVEDETAIL", entityFormatMessage = "entity_format_message_mm_storage_servicereceivedetail")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class ServiceReceiveDetail extends InstockDetail {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "serviceReceiveDetailGen", sequenceName = "SEQ_MM_STORAGE_SERVICERECEIVEDETAIL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serviceReceiveDetailGen")
	@Column(name = "ID")
	private Long id;

	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SERVICEPROCUREMENTITEMDETAIL")
	@EntityFormat
	private ServiceProcurementItemDetail serviceProcurementItemDetail;
	

}
