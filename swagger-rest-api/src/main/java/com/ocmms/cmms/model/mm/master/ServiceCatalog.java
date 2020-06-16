package com.ocmms.cmms.model.mm.master;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = ServiceCatalog TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_SERVICECATALOG")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class ServiceCatalog extends MROCatalog implements Serializable {

	
	/** * TODO Auto-generated attribute documentation * */
	@Column(name = "CATEGORY")
	private String category;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PURPOSE")
	private String purpose;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "GENERALLEDGERACCOUNT")
	private String generalLedgerAccount;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "serviceCatalog")

	private Set<ServiceProcurementItemDetail> serviceProcurementItemDetails = new HashSet<ServiceProcurementItemDetail>();

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
		if (!(obj instanceof ServiceCatalog)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((ServiceCatalog) obj).getId());
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
		return "ServiceCatalog {category='" + category + '\'' + ", purpose='" + purpose
				+ '\'' + ", generalLedgerAccount='" + generalLedgerAccount + '\'' + "}" + super.toString();
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceProcurementItemDetailsToAdd
	 */
	public void addToServiceProcurementItemDetails(
			Iterable<ServiceProcurementItemDetail> serviceProcurementItemDetailsToAdd) {
		Assert.notNull(serviceProcurementItemDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (ServiceProcurementItemDetail item : serviceProcurementItemDetailsToAdd) {
			this.serviceProcurementItemDetails.add(item);
			item.setServiceCatalog(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceProcurementItemDetailsToRemove
	 */
	public void removeFromServiceProcurementItemDetails(
			Iterable<ServiceProcurementItemDetail> serviceProcurementItemDetailsToRemove) {
		Assert.notNull(serviceProcurementItemDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (ServiceProcurementItemDetail item : serviceProcurementItemDetailsToRemove) {
			this.serviceProcurementItemDetails.remove(item);
			item.setServiceCatalog(null);
		}
	}
}
