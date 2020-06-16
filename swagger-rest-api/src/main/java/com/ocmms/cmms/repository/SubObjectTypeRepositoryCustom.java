package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.SubObjectType;

import com.ocmms.cmms.model.pm.configuration.ObjectType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = SubObjectTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface SubObjectTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param objectType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<SubObjectType> findByObjectType(ObjectType objectType, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<SubObjectType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<SubObjectType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
