package com.ocmms.cmms.model.mm.storage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
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
 * = PartScrappingOutstockDetail TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_STORAGE_PARTSCRAPPINGOUTSTOCKDETAIL")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class PartScrappingOutstockDetail extends OutstockDetail implements Serializable {

	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARTSCRAPPINGRECORD")

	private PartScrappingRecord partScrappingRecord;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

}
