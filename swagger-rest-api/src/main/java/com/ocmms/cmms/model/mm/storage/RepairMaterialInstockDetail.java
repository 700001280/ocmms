package com.ocmms.cmms.model.mm.storage;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import lombok.Data;
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
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * = RepairMaterialInstockDetail TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_STORAGE_REPAIRMATERIALINSTOCKDETAIL")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class RepairMaterialInstockDetail extends InstockDetail implements Serializable {

	

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

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	
	/**
	 * This `equals` implementation is specific for JPA entities and uses the entity
	 * identifier for it, following the article in
	 * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
	 *
	 * @param obj
	 * @return Boolean
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		// instanceof is false if the instance is null
		if (!(obj instanceof RepairMaterialInstockDetail)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((RepairMaterialInstockDetail) obj).getId());
	}

	/**
	 * This `hashCode` implementation is specific for JPA entities and uses a fixed
	 * `int` value to be able to identify the entity in collections after a new id
	 * is assigned to the entity, following the article in
	 * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
	 *
	 * @return Integer
	 */
	public int hashCode() {
		return 31;
	}

	
}
