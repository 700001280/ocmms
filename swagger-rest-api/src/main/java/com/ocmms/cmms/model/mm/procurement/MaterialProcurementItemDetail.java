package com.ocmms.cmms.model.mm.procurement;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = MaterialProcurementItemDetail TODO Auto-generated class documentation
 *
 */
@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_PROCUREMENT_ MATERIALITEMDETAIL")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class MaterialProcurementItemDetail extends ProcurementItemDetail implements Serializable {


	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATERIALCATALOG")

	private MaterialCatalog materialCatalog;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORKORDERMATERIAL")

	private WorkOrderMaterial workOrderMaterial;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "materialProcurementItemDetail")

	private Set<MaterialInstockDetail> materialInstockDetails = new HashSet<MaterialInstockDetail>();

	/**
	 * deliverDays： type Long， indicating the how days that PO place date to the material deliver date
	 *
	 */	
	@Column(name = "DELIVERDAYS")
	private Long deliverDays;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialInstockDetailsToAdd
	 */
	public void addToMaterialInstockDetails(Iterable<MaterialInstockDetail> materialInstockDetailsToAdd) {
		Assert.notNull(materialInstockDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (MaterialInstockDetail item : materialInstockDetailsToAdd) {
			this.materialInstockDetails.add(item);
			item.setMaterialProcurementItemDetail(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialInstockDetailsToRemove
	 */
	public void removeFromMaterialInstockDetails(Iterable<MaterialInstockDetail> materialInstockDetailsToRemove) {
		Assert.notNull(materialInstockDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (MaterialInstockDetail item : materialInstockDetailsToRemove) {
			this.materialInstockDetails.remove(item);
			item.setMaterialProcurementItemDetail(null);
		}
	}
	
	/**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean quals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof MaterialProcurementItemDetail)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((MaterialProcurementItemDetail) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
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
        return "MaterialProcurementItemDetail";
    }
}
