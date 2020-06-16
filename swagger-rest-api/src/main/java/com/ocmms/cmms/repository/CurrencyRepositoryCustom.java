package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Currency;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CurrencyRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface CurrencyRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Currency> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Currency> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
