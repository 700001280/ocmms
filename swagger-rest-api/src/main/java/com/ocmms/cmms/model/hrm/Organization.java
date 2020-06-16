package com.ocmms.cmms.model.hrm;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.system.RecordStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.common.Address;
import lombok.Data;
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
import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = Organization TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "HRM_ORGANIZATION")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class Organization implements Serializable {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "organizationGen", sequenceName = "SEQ_HRM_ORGANIZATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organizationGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "CODE", unique = true, length = 15)
	private String code;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "ORG_NAME", unique = true, length = 150)
	private String orgName;

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

	@Column(name = "POSTALCODE")
	private String postalCode;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PHONE")
	private String phone;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */

	@Column(name = "FAX")
	private String fax;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */

	@Column(name = "WEB")
	private String web;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	//@Email
	@Column(name = "MAIL")
	private String mail;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ACTIVE")
	private Boolean active;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SORTS")
	private Integer sorts;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS")
	private Address address;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENTORGANIZATION")
	private Organization parentOrganization;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<MainWorkCenter> maintWorkCenters = new HashSet<MainWorkCenter>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<PlantLocation> plantLocations = new HashSet<PlantLocation>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<PlantSection> plantSections = new HashSet<PlantSection>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<Employee> employees = new HashSet<Employee>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<CostCenter> costCenters = new HashSet<CostCenter>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<Warehouse> warehouses = new HashSet<Warehouse>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<MaterialPlantInfo> materialPlantInfos = new HashSet<MaterialPlantInfo>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<ProcurementItemDetail> procurementItemDetails = new HashSet<ProcurementItemDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<HierarchyWorkCenter> hierarchyWorkCenters = new HashSet<HierarchyWorkCenter>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<WorkCenterResponsible> workCenterResponsibles = new HashSet<WorkCenterResponsible>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<OperationalWorkCenter> operationalWorkCenters = new HashSet<OperationalWorkCenter>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<TechnicalObject> technicalObjects = new HashSet<TechnicalObject>();

	/**** General Information Generated By System Start ****/

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECORDSTATUS")
	private RecordStatus recordStatus;

	/**
	 * record version, while changed or updated should be plus one;
	 *
	 */
	@Version
	@Column(name = "VERSION")
	private Long version;

	/**
	 * record created date, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@CreatedDate
	private Calendar createdDate;

	/**
	 * record created user, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_BY")
	@CreatedBy
	private String createdBy;

	/**
	 * record update date, while update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@LastModifiedDate
	private Calendar lastModifiedDate;

	/**
	 * Record last update user, while last update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_BY")
	@LastModifiedBy
	private String lastModifiedBy;
	/**** General Information Generated By System End ******/
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		if (this.getParentOrganization() != null) {
			return this.getParentOrganization().toString() + "-" + orgName;
		} else {
			return orgName;
		}

	}

	
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
     * TODO Auto-generated method documentation
     * 
     * @param maintWorkCentersToAdd
     */
    public void addToMaintWorkCenters(Iterable<MainWorkCenter> maintWorkCentersToAdd) {
        Assert.notNull(maintWorkCentersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (MainWorkCenter item : maintWorkCentersToAdd) {
            this.maintWorkCenters.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param maintWorkCentersToRemove
     */
    public void removeFromMaintWorkCenters(Iterable<MainWorkCenter> maintWorkCentersToRemove) {
        Assert.notNull(maintWorkCentersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (MainWorkCenter item : maintWorkCentersToRemove) {
            this.maintWorkCenters.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantLocationsToAdd
     */
    public void addToPlantLocations(Iterable<PlantLocation> plantLocationsToAdd) {
        Assert.notNull(plantLocationsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (PlantLocation item : plantLocationsToAdd) {
            this.plantLocations.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantLocationsToRemove
     */
    public void removeFromPlantLocations(Iterable<PlantLocation> plantLocationsToRemove) {
        Assert.notNull(plantLocationsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (PlantLocation item : plantLocationsToRemove) {
            this.plantLocations.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSectionsToAdd
     */
    public void addToPlantSections(Iterable<PlantSection> plantSectionsToAdd) {
        Assert.notNull(plantSectionsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (PlantSection item : plantSectionsToAdd) {
            this.plantSections.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSectionsToRemove
     */
    public void removeFromPlantSections(Iterable<PlantSection> plantSectionsToRemove) {
        Assert.notNull(plantSectionsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (PlantSection item : plantSectionsToRemove) {
            this.plantSections.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employeesToAdd
     */
    public void addToEmployees(Iterable<Employee> employeesToAdd) {
        Assert.notNull(employeesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Employee item : employeesToAdd) {
            this.employees.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employeesToRemove
     */
    public void removeFromEmployees(Iterable<Employee> employeesToRemove) {
        Assert.notNull(employeesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Employee item : employeesToRemove) {
            this.employees.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param costCentersToAdd
     */
    public void addToCostCenters(Iterable<CostCenter> costCentersToAdd) {
        Assert.notNull(costCentersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (CostCenter item : costCentersToAdd) {
            this.costCenters.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param costCentersToRemove
     */
    public void removeFromCostCenters(Iterable<CostCenter> costCentersToRemove) {
        Assert.notNull(costCentersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (CostCenter item : costCentersToRemove) {
            this.costCenters.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehousesToAdd
     */
    public void addToWarehouses(Iterable<Warehouse> warehousesToAdd) {
        Assert.notNull(warehousesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Warehouse item : warehousesToAdd) {
            this.warehouses.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehousesToRemove
     */
    public void removeFromWarehouses(Iterable<Warehouse> warehousesToRemove) {
        Assert.notNull(warehousesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Warehouse item : warehousesToRemove) {
            this.warehouses.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialPlantInfosToAdd
     */
    public void addToMaterialPlantInfos(Iterable<MaterialPlantInfo> materialPlantInfosToAdd) {
        Assert.notNull(materialPlantInfosToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (MaterialPlantInfo item : materialPlantInfosToAdd) {
            this.materialPlantInfos.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialPlantInfosToRemove
     */
    public void removeFromMaterialPlantInfos(Iterable<MaterialPlantInfo> materialPlantInfosToRemove) {
        Assert.notNull(materialPlantInfosToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (MaterialPlantInfo item : materialPlantInfosToRemove) {
            this.materialPlantInfos.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementItemDetailsToAdd
     */
    public void addToProcurementItemDetails(Iterable<ProcurementItemDetail> procurementItemDetailsToAdd) {
        Assert.notNull(procurementItemDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (ProcurementItemDetail item : procurementItemDetailsToAdd) {
            this.procurementItemDetails.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementItemDetailsToRemove
     */
    public void removeFromProcurementItemDetails(Iterable<ProcurementItemDetail> procurementItemDetailsToRemove) {
        Assert.notNull(procurementItemDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (ProcurementItemDetail item : procurementItemDetailsToRemove) {
            this.procurementItemDetails.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hierarchyWorkCentersToAdd
     */
    public void addToHierarchyWorkCenters(Iterable<HierarchyWorkCenter> hierarchyWorkCentersToAdd) {
        Assert.notNull(hierarchyWorkCentersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (HierarchyWorkCenter item : hierarchyWorkCentersToAdd) {
            this.hierarchyWorkCenters.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hierarchyWorkCentersToRemove
     */
    public void removeFromHierarchyWorkCenters(Iterable<HierarchyWorkCenter> hierarchyWorkCentersToRemove) {
        Assert.notNull(hierarchyWorkCentersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (HierarchyWorkCenter item : hierarchyWorkCentersToRemove) {
            this.hierarchyWorkCenters.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsiblesToAdd
     */
    public void addToWorkCenterResponsibles(Iterable<WorkCenterResponsible> workCenterResponsiblesToAdd) {
        Assert.notNull(workCenterResponsiblesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (WorkCenterResponsible item : workCenterResponsiblesToAdd) {
            this.workCenterResponsibles.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsiblesToRemove
     */
    public void removeFromWorkCenterResponsibles(Iterable<WorkCenterResponsible> workCenterResponsiblesToRemove) {
        Assert.notNull(workCenterResponsiblesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (WorkCenterResponsible item : workCenterResponsiblesToRemove) {
            this.workCenterResponsibles.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param operationalWorkCentersToAdd
     */
    public void addToOperationalWorkCenters(Iterable<OperationalWorkCenter> operationalWorkCentersToAdd) {
        Assert.notNull(operationalWorkCentersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (OperationalWorkCenter item : operationalWorkCentersToAdd) {
            this.operationalWorkCenters.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param operationalWorkCentersToRemove
     */
    public void removeFromOperationalWorkCenters(Iterable<OperationalWorkCenter> operationalWorkCentersToRemove) {
        Assert.notNull(operationalWorkCentersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (OperationalWorkCenter item : operationalWorkCentersToRemove) {
            this.operationalWorkCenters.remove(item);
            item.setOrganization(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param technicalObjectsToAdd
     */
    public void addToTechnicalObjects(Iterable<TechnicalObject> technicalObjectsToAdd) {
        Assert.notNull(technicalObjectsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (TechnicalObject item : technicalObjectsToAdd) {
            this.technicalObjects.add(item);
            item.setOrganization(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param technicalObjectsToRemove
     */
    public void removeFromTechnicalObjects(Iterable<TechnicalObject> technicalObjectsToRemove) {
        Assert.notNull(technicalObjectsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (TechnicalObject item : technicalObjectsToRemove) {
            this.technicalObjects.remove(item);
            item.setOrganization(null);
        }
    }
}
