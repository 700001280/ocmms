package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MROCatalog;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MROCatalogRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface MROCatalogRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MROCatalog> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MROCatalog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
