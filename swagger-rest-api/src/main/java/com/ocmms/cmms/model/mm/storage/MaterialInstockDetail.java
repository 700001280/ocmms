package com.ocmms.cmms.model.mm.storage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import lombok.Data;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * = MaterialInstockDetail TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_STORAGE_MATERIALINSTOCKDETAIL")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class MaterialInstockDetail extends InstockDetail implements Serializable {	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATERIALPROCUREMENTITEMDETAIL")

	private MaterialProcurementItemDetail materialProcurementItemDetail;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	
}
