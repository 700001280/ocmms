package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialPlantInfoRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialplantinfo", path = "materialplantinfo")
public interface MaterialPlantInfoRepository extends  MaterialPlantInfoRepositoryCustom,
		PagingAndSortingRepository<MaterialPlantInfo, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @return Long
	 */
	public abstract long countByMaterialCatalog(MaterialCatalog materialCatalog);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);	
	
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param organization
     * @param pageable
     * @return Page
     */
    public abstract List<MaterialPlantInfo> findByMaterialCatalogAndOrganization(MaterialCatalog materialCatalog, Organization organization);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param organization
     * @return Long
     */
    public abstract long countByMaterialCatalogAndOrganization(MaterialCatalog materialCatalog, Organization organization);
    
    @Query(value = "select * FROM mm_master_materialplantinfo e where e.safetystock >= e.stock", nativeQuery = true)
	public List<MaterialPlantInfo> getLowStockMaterial();
}
