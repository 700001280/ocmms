package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.QPlantSection;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = PlantSectionRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PlantSectionRepositoryImpl extends QueryDslRepositorySupportExt<PlantSection>
		implements PlantSectionRepositoryCustom {

	/**
	 * Default constructor
	 */
	PlantSectionRepositoryImpl() {
		super(PlantSection.class);
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
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SECTION_PHONE_NUMBER = "sectionPhoneNumber";

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
	public static final String SECTION = "section";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlantSection> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPlantSection plantSection = QPlantSection.plantSection;
		JPQLQuery<PlantSection> query = from(plantSection);
		Path<?>[] paths = new Path<?>[] { plantSection.organization, plantSection.description, plantSection.section,
				plantSection.sectionPhoneNumber, plantSection.recordStatus, plantSection.createdDate,
				plantSection.createdBy, plantSection.lastModifiedDate, plantSection.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, plantSection.organization)
				.map(DESCRIPTION, plantSection.description).map(SECTION, plantSection.section)
				.map(SECTION_PHONE_NUMBER, plantSection.sectionPhoneNumber)
				.map(RECORD_STATUS, plantSection.recordStatus).map(CREATED_DATE, plantSection.createdDate)
				.map(CREATED_BY, plantSection.createdBy).map(LAST_MODIFIED_DATE, plantSection.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plantSection.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plantSection);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlantSection> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPlantSection plantSection = QPlantSection.plantSection;
		JPQLQuery<PlantSection> query = from(plantSection);
		Path<?>[] paths = new Path<?>[] { plantSection.organization, plantSection.description, plantSection.section,
				plantSection.sectionPhoneNumber, plantSection.recordStatus, plantSection.createdDate,
				plantSection.createdBy, plantSection.lastModifiedDate, plantSection.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(plantSection.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, plantSection.organization)
				.map(DESCRIPTION, plantSection.description).map(SECTION, plantSection.section)
				.map(SECTION_PHONE_NUMBER, plantSection.sectionPhoneNumber)
				.map(RECORD_STATUS, plantSection.recordStatus).map(CREATED_DATE, plantSection.createdDate)
				.map(CREATED_BY, plantSection.createdBy).map(LAST_MODIFIED_DATE, plantSection.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plantSection.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plantSection);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plant
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PlantSection> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable) {
		QPlantSection plantSection = QPlantSection.plantSection;
		JPQLQuery<PlantSection> query = from(plantSection);
		Assert.notNull(organization, "organization is required");
		query.where(plantSection.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { plantSection.organization, plantSection.description, plantSection.section,
				plantSection.sectionPhoneNumber, plantSection.recordStatus, plantSection.createdDate,
				plantSection.createdBy, plantSection.lastModifiedDate, plantSection.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, plantSection.organization)
				.map(DESCRIPTION, plantSection.description).map(SECTION, plantSection.section)
				.map(SECTION_PHONE_NUMBER, plantSection.sectionPhoneNumber)
				.map(RECORD_STATUS, plantSection.recordStatus).map(CREATED_DATE, plantSection.createdDate)
				.map(CREATED_BY, plantSection.createdBy).map(LAST_MODIFIED_DATE, plantSection.lastModifiedDate)
				.map(LAST_MODIFIED_BY, plantSection.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, plantSection);
	}
}
