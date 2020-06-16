package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoInfoRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "lotoinfo", path = "lotoinfo")
public interface LotoInfoRepository extends  LotoInfoRepositoryCustom,
		PagingAndSortingRepository<LotoInfo, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoBaseInfo
	 * @return Long
	 */
	public abstract long countByLotoBaseInfo(LotoBaseInfo lotoBaseInfo);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);
}
