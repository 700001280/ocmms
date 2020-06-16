package com.ocmms.cmms.model.pm.routine;

import javax.persistence.Column;
import java.math.BigDecimal;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * = PelletizerMaintenanceRecord TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_ROUTINE_PELLETIZERMAINTENANCERECORD")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class PelletizerMaintenanceRecord extends EquipmentMaintenanceRecord implements Serializable {

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
		if (!(obj instanceof PelletizerMaintenanceRecord)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((PelletizerMaintenanceRecord) obj).getId());
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

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @return String
	 */
	public String toString() {
		return "PelletizerMaintenanceRecord {" + "onlineRunTime='" + onlineRunTime + '\'' + ", offlineRunTime='"
				+ offlineRunTime + '\'' + "}" + super.toString();
	}
}
