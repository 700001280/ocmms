package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoInfo;

import com.ocmms.cmms.model.loto.LotoBaseInfo;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = LotoInfoRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface LotoInfoRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoBaseInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoInfo> findByLotoBaseInfo(LotoBaseInfo lotoBaseInfo, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoInfo> findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoInfo> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
