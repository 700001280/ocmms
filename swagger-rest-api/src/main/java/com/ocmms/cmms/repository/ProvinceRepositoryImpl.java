package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Province;
import com.ocmms.cmms.model.common.QProvince;
import com.ocmms.cmms.model.common.Region;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ProvinceRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ProvinceRepositoryImpl extends QueryDslRepositorySupportExt<Province> implements ProvinceRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProvinceRepositoryImpl() {
		super(Province.class);
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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REGION = "region";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Province> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProvince province = QProvince.province;
		JPQLQuery<Province> query = from(province);
		Path<?>[] paths = new Path<?>[] { province.description, province.region, province.recordStatus,
				province.createdDate, province.createdBy, province.lastModifiedDate, province.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, province.description)
				.map(REGION, province.region).map(RECORD_STATUS, province.recordStatus)
				.map(CREATED_DATE, province.createdDate).map(CREATED_BY, province.createdBy)
				.map(LAST_MODIFIED_DATE, province.lastModifiedDate).map(LAST_MODIFIED_BY, province.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, province);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Province> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QProvince province = QProvince.province;
		JPQLQuery<Province> query = from(province);
		Path<?>[] paths = new Path<?>[] { province.description, province.region, province.recordStatus,
				province.createdDate, province.createdBy, province.lastModifiedDate, province.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(province.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, province.description)
				.map(REGION, province.region).map(RECORD_STATUS, province.recordStatus)
				.map(CREATED_DATE, province.createdDate).map(CREATED_BY, province.createdBy)
				.map(LAST_MODIFIED_DATE, province.lastModifiedDate).map(LAST_MODIFIED_BY, province.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, province);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param region
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Province> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable) {
		QProvince province = QProvince.province;
		JPQLQuery<Province> query = from(province);
		Assert.notNull(region, "region is required");
		query.where(province.region.eq(region));
		Path<?>[] paths = new Path<?>[] { province.description, province.region, province.recordStatus,
				province.createdDate, province.createdBy, province.lastModifiedDate, province.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, province.description)
				.map(REGION, province.region).map(RECORD_STATUS, province.recordStatus)
				.map(CREATED_DATE, province.createdDate).map(CREATED_BY, province.createdBy)
				.map(LAST_MODIFIED_DATE, province.lastModifiedDate).map(LAST_MODIFIED_BY, province.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, province);
	}
}
