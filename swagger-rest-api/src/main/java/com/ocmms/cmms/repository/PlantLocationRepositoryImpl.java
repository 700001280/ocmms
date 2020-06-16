package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.QPlantLocation;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = PlantLocationRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PlantLocationRepositoryImpl extends QueryDslRepositorySupportExt<PlantLocation>
		implements PlantLocationRepositoryCustom {

	/**
	 * Default constructor
	 */
	PlantLocationRepositoryImpl() {
		super(PlantLocation.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOCATION = "location";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

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
	public Page<PlantLocation> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPlantLocation plantLocation = QPlantLocation.plantLocation;
		JPQLQuery<PlantLocation> query = from(plantLocation);
		Path<?>[] paths = new Path<?>[] { plantLocation.location, plantLocation.description, plantLocation.organization,
				plantLocation.recordStatus, plantLocation.createdDate, plantLocation.createdBy,
				plantLocation.lastModifiedDate, plantLocation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOCATION, plantLocation.location)
				.map(DESCRIPTION, plantLocation.description).map(ORGANIZATION, plantLocation.organization)
				.map(RECORD_STATUS, plantLocation.recordStatus).map(CREATED_DATE, plantLocation.createdDate)
				.map(CREATED_BY, plantLocation.createdBy).map(LAST_MODIFIED_DATE, plantLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plantLocation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plantLocation);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlantLocation> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPlantLocation plantLocation = QPlantLocation.plantLocation;
		JPQLQuery<PlantLocation> query = from(plantLocation);
		Path<?>[] paths = new Path<?>[] { plantLocation.location, plantLocation.description, plantLocation.organization,
				plantLocation.recordStatus, plantLocation.createdDate, plantLocation.createdBy,
				plantLocation.lastModifiedDate, plantLocation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(plantLocation.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(LOCATION, plantLocation.location)
				.map(DESCRIPTION, plantLocation.description).map(ORGANIZATION, plantLocation.organization)
				.map(RECORD_STATUS, plantLocation.recordStatus).map(CREATED_DATE, plantLocation.createdDate)
				.map(CREATED_BY, plantLocation.createdBy).map(LAST_MODIFIED_DATE, plantLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plantLocation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plantLocation);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plant
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlantLocation> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable) {
		QPlantLocation plantLocation = QPlantLocation.plantLocation;
		JPQLQuery<PlantLocation> query = from(plantLocation);
		Assert.notNull(organization, "organization is required");
		query.where(plantLocation.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { plantLocation.location, plantLocation.description, plantLocation.organization,
				plantLocation.recordStatus, plantLocation.createdDate, plantLocation.createdBy,
				plantLocation.lastModifiedDate, plantLocation.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOCATION, plantLocation.location)
				.map(DESCRIPTION, plantLocation.description).map(ORGANIZATION, plantLocation.organization)
				.map(RECORD_STATUS, plantLocation.recordStatus).map(CREATED_DATE, plantLocation.createdDate)
				.map(CREATED_BY, plantLocation.createdBy).map(LAST_MODIFIED_DATE, plantLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plantLocation.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plantLocation);
	}
}
