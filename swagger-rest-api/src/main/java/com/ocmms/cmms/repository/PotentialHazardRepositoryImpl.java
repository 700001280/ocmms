package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.PotentialHazard;
import com.ocmms.cmms.model.loto.QPotentialHazard;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PotentialHazardRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PotentialHazardRepositoryImpl extends QueryDslRepositorySupportExt<PotentialHazard>
		implements PotentialHazardRepositoryCustom {

	/**
	 * Default constructor
	 */
	PotentialHazardRepositoryImpl() {
		super(PotentialHazard.class);
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
	public Page<PotentialHazard> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPotentialHazard potentialHazard = QPotentialHazard.potentialHazard;
		JPQLQuery<PotentialHazard> query = from(potentialHazard);
		Path<?>[] paths = new Path<?>[] { potentialHazard.code, potentialHazard.description,
				potentialHazard.recordStatus, potentialHazard.createdDate, potentialHazard.createdBy,
				potentialHazard.lastModifiedDate, potentialHazard.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, potentialHazard.code)
				.map(DESCRIPTION, potentialHazard.description).map(RECORD_STATUS, potentialHazard.recordStatus)
				.map(CREATED_DATE, potentialHazard.createdDate).map(CREATED_BY, potentialHazard.createdBy)
				.map(LAST_MODIFIED_DATE, potentialHazard.lastModifiedDate)
				.map(LAST_MODIFIED_BY, potentialHazard.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, potentialHazard);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PotentialHazard> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPotentialHazard potentialHazard = QPotentialHazard.potentialHazard;
		JPQLQuery<PotentialHazard> query = from(potentialHazard);
		Path<?>[] paths = new Path<?>[] { potentialHazard.code, potentialHazard.description,
				potentialHazard.recordStatus, potentialHazard.createdDate, potentialHazard.createdBy,
				potentialHazard.lastModifiedDate, potentialHazard.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(potentialHazard.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, potentialHazard.code)
				.map(DESCRIPTION, potentialHazard.description).map(RECORD_STATUS, potentialHazard.recordStatus)
				.map(CREATED_DATE, potentialHazard.createdDate).map(CREATED_BY, potentialHazard.createdBy)
				.map(LAST_MODIFIED_DATE, potentialHazard.lastModifiedDate)
				.map(LAST_MODIFIED_BY, potentialHazard.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, potentialHazard);
	}
}
