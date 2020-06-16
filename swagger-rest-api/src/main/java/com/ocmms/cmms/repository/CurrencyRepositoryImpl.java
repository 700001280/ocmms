package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Currency;
import com.ocmms.cmms.model.common.QCurrency;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CurrencyRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class CurrencyRepositoryImpl extends QueryDslRepositorySupportExt<Currency> implements CurrencyRepositoryCustom {

	/**
	 * Default constructor
	 */
	CurrencyRepositoryImpl() {
		super(Currency.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Currency> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QCurrency currency = QCurrency.currency;
		JPQLQuery<Currency> query = from(currency);
		Path<?>[] paths = new Path<?>[] { currency.code, currency.description, currency.recordStatus,
				currency.createdDate, currency.createdBy, currency.lastModifiedDate, currency.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, currency.code).map(DESCRIPTION, currency.description)
				.map(RECORD_STATUS, currency.recordStatus).map(CREATED_DATE, currency.createdDate)
				.map(CREATED_BY, currency.createdBy).map(LAST_MODIFIED_DATE, currency.lastModifiedDate)
				.map(LAST_MODIFIED_BY, currency.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, currency);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Currency> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QCurrency currency = QCurrency.currency;
		JPQLQuery<Currency> query = from(currency);
		Path<?>[] paths = new Path<?>[] { currency.code, currency.description, currency.recordStatus,
				currency.createdDate, currency.createdBy, currency.lastModifiedDate, currency.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(currency.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, currency.code).map(DESCRIPTION, currency.description)
				.map(RECORD_STATUS, currency.recordStatus).map(CREATED_DATE, currency.createdDate)
				.map(CREATED_BY, currency.createdBy).map(LAST_MODIFIED_DATE, currency.lastModifiedDate)
				.map(LAST_MODIFIED_BY, currency.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, currency);
	}
}
