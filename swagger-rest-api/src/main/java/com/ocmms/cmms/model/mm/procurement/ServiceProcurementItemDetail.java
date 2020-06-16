package com.ocmms.cmms.model.mm.procurement;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import lombok.Data;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = ServiceProcurementItemDetail TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_PROCUREMENT_ SERVICEITEMDETAIL")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class ServiceProcurementItemDetail extends ProcurementItemDetail implements Serializable {
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SERVICECATALOG")

	private ServiceCatalog serviceCatalog;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "DESCRIPTION")
	private String description;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "serviceProcurementItemDetail")

	private Set<ServiceReceiveDetail> serviceReceiveDetails = new HashSet<ServiceReceiveDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceReceiveDetailsToAdd
	 */
	public void addToServiceReceiveDetails(Iterable<ServiceReceiveDetail> serviceReceiveDetailsToAdd) {
		Assert.notNull(serviceReceiveDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (ServiceReceiveDetail item : serviceReceiveDetailsToAdd) {
			this.serviceReceiveDetails.add(item);
			item.setServiceProcurementItemDetail(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceReceiveDetailsToRemove
	 */
	public void removeFromServiceReceiveDetails(Iterable<ServiceReceiveDetail> serviceReceiveDetailsToRemove) {
		Assert.notNull(serviceReceiveDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (ServiceReceiveDetail item : serviceReceiveDetailsToRemove) {
			this.serviceReceiveDetails.remove(item);
			item.setServiceProcurementItemDetail(null);
		}
	}
}
