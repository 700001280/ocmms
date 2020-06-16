package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Currency;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CurrencyRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "currency", path = "currency")
public interface CurrencyRepository extends  CurrencyRepositoryCustom,
		PagingAndSortingRepository<Currency, Long> {
}
