package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Country;
import com.ocmms.cmms.model.common.QCountry;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CountryRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class CountryRepositoryImpl extends QueryDslRepositorySupportExt<Country> implements CountryRepositoryCustom {

	/**
	 * Default constructor
	 */
	CountryRepositoryImpl() {
		super(Country.class);
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
	public Page<Country> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QCountry country = QCountry.country;
		JPQLQuery<Country> query = from(country);
		Path<?>[] paths = new Path<?>[] { country.code, country.description, country.recordStatus, country.createdDate,
				country.createdBy, country.lastModifiedDate, country.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, country.code).map(DESCRIPTION, country.description)
				.map(RECORD_STATUS, country.recordStatus).map(CREATED_DATE, country.createdDate)
				.map(CREATED_BY, country.createdBy).map(LAST_MODIFIED_DATE, country.lastModifiedDate)
				.map(LAST_MODIFIED_BY, country.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, country);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Country> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QCountry country = QCountry.country;
		JPQLQuery<Country> query = from(country);
		Path<?>[] paths = new Path<?>[] { country.code, country.description, country.recordStatus, country.createdDate,
				country.createdBy, country.lastModifiedDate, country.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(country.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, country.code).map(DESCRIPTION, country.description)
				.map(RECORD_STATUS, country.recordStatus).map(CREATED_DATE, country.createdDate)
				.map(CREATED_BY, country.createdBy).map(LAST_MODIFIED_DATE, country.lastModifiedDate)
				.map(LAST_MODIFIED_BY, country.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, country);
	}
}
