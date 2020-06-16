package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Region;
import com.ocmms.cmms.model.common.Country;
import com.ocmms.cmms.model.common.QRegion;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = RegionRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class RegionRepositoryImpl extends QueryDslRepositorySupportExt<Region> implements RegionRepositoryCustom {

	/**
	 * Default constructor
	 */
	RegionRepositoryImpl() {
		super(Region.class);
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
	public static final String COUNTRY = "country";

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
	public Page<Region> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QRegion region = QRegion.region;
		JPQLQuery<Region> query = from(region);
		Path<?>[] paths = new Path<?>[] { region.description, region.country, region.recordStatus, region.createdDate,
				region.createdBy, region.lastModifiedDate, region.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, region.description)
				.map(COUNTRY, region.country).map(RECORD_STATUS, region.recordStatus)
				.map(CREATED_DATE, region.createdDate).map(CREATED_BY, region.createdBy)
				.map(LAST_MODIFIED_DATE, region.lastModifiedDate).map(LAST_MODIFIED_BY, region.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, region);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Region> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QRegion region = QRegion.region;
		JPQLQuery<Region> query = from(region);
		Path<?>[] paths = new Path<?>[] { region.description, region.country, region.recordStatus, region.createdDate,
				region.createdBy, region.lastModifiedDate, region.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(region.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, region.description)
				.map(COUNTRY, region.country).map(RECORD_STATUS, region.recordStatus)
				.map(CREATED_DATE, region.createdDate).map(CREATED_BY, region.createdBy)
				.map(LAST_MODIFIED_DATE, region.lastModifiedDate).map(LAST_MODIFIED_BY, region.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, region);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param country
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Region> findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable) {
		QRegion region = QRegion.region;
		JPQLQuery<Region> query = from(region);
		Assert.notNull(country, "country is required");
		query.where(region.country.eq(country));
		Path<?>[] paths = new Path<?>[] { region.description, region.country, region.recordStatus, region.createdDate,
				region.createdBy, region.lastModifiedDate, region.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, region.description)
				.map(COUNTRY, region.country).map(RECORD_STATUS, region.recordStatus)
				.map(CREATED_DATE, region.createdDate).map(CREATED_BY, region.createdBy)
				.map(LAST_MODIFIED_DATE, region.lastModifiedDate).map(LAST_MODIFIED_BY, region.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, region);
	}
}
