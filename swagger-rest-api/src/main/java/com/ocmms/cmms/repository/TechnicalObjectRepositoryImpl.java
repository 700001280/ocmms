package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import com.ocmms.cmms.model.pm.technicalobject.QTechnicalObject;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = TechnicalObjectRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TechnicalObjectRepositoryImpl extends QueryDslRepositorySupportExt<TechnicalObject>
		implements TechnicalObjectRepositoryCustom {

	/**
	 * Default constructor
	 */
	TechnicalObjectRepositoryImpl() {
		super(TechnicalObject.class);
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
	public static final String MANUFACTURER_MODEL_NUMBER = "manufacturerModelNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ABC_INDICATOR = "abcIndicator";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_SERIAL_NUMBER = "manufacturerSerialNumber";

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
	public static final String DESCRIPTION_LOCAL = "descriptionLocal";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_PART_NUMBER = "manufacturerPartNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TAG = "tag";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TechnicalObject> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTechnicalObject technicalObject = QTechnicalObject.technicalObject;
		JPQLQuery<TechnicalObject> query = from(technicalObject);
		Path<?>[] paths = new Path<?>[] { technicalObject.tag, technicalObject.description,
				technicalObject.descriptionLocal, technicalObject.abcIndicator, technicalObject.organization,
				technicalObject.manufacturerModelNumber, technicalObject.manufacturerSerialNumber,
				technicalObject.manufacturerPartNumber, technicalObject.memo, technicalObject.recordStatus,
				technicalObject.createdDate, technicalObject.createdBy, technicalObject.lastModifiedDate,
				technicalObject.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, technicalObject.tag)
				.map(DESCRIPTION, technicalObject.description).map(DESCRIPTION_LOCAL, technicalObject.descriptionLocal)
				.map(ABC_INDICATOR, technicalObject.abcIndicator).map(ORGANIZATION, technicalObject.organization)
				.map(MANUFACTURER_MODEL_NUMBER, technicalObject.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, technicalObject.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, technicalObject.manufacturerPartNumber).map(MEMO, technicalObject.memo)
				.map(RECORD_STATUS, technicalObject.recordStatus).map(CREATED_DATE, technicalObject.createdDate)
				.map(CREATED_BY, technicalObject.createdBy).map(LAST_MODIFIED_DATE, technicalObject.lastModifiedDate)
				.map(LAST_MODIFIED_BY, technicalObject.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, technicalObject);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TechnicalObject> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTechnicalObject technicalObject = QTechnicalObject.technicalObject;
		JPQLQuery<TechnicalObject> query = from(technicalObject);
		Path<?>[] paths = new Path<?>[] { technicalObject.tag, technicalObject.description,
				technicalObject.descriptionLocal, technicalObject.abcIndicator, technicalObject.organization,
				technicalObject.manufacturerModelNumber, technicalObject.manufacturerSerialNumber,
				technicalObject.manufacturerPartNumber, technicalObject.memo, technicalObject.recordStatus,
				technicalObject.createdDate, technicalObject.createdBy, technicalObject.lastModifiedDate,
				technicalObject.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(technicalObject.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, technicalObject.tag)
				.map(DESCRIPTION, technicalObject.description).map(DESCRIPTION_LOCAL, technicalObject.descriptionLocal)
				.map(ABC_INDICATOR, technicalObject.abcIndicator).map(ORGANIZATION, technicalObject.organization)
				.map(MANUFACTURER_MODEL_NUMBER, technicalObject.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, technicalObject.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, technicalObject.manufacturerPartNumber).map(MEMO, technicalObject.memo)
				.map(RECORD_STATUS, technicalObject.recordStatus).map(CREATED_DATE, technicalObject.createdDate)
				.map(CREATED_BY, technicalObject.createdBy).map(LAST_MODIFIED_DATE, technicalObject.lastModifiedDate)
				.map(LAST_MODIFIED_BY, technicalObject.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, technicalObject);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param abcIndicator
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TechnicalObject> findByAbcIndicator(AbcIndicator abcIndicator, GlobalSearch globalSearch,
			Pageable pageable) {
		QTechnicalObject technicalObject = QTechnicalObject.technicalObject;
		JPQLQuery<TechnicalObject> query = from(technicalObject);
		Assert.notNull(abcIndicator, "abcIndicator is required");
		query.where(technicalObject.abcIndicator.eq(abcIndicator));
		Path<?>[] paths = new Path<?>[] { technicalObject.tag, technicalObject.description,
				technicalObject.descriptionLocal, technicalObject.abcIndicator, technicalObject.organization,
				technicalObject.manufacturerModelNumber, technicalObject.manufacturerSerialNumber,
				technicalObject.manufacturerPartNumber, technicalObject.memo, technicalObject.recordStatus,
				technicalObject.createdDate, technicalObject.createdBy, technicalObject.lastModifiedDate,
				technicalObject.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, technicalObject.tag)
				.map(DESCRIPTION, technicalObject.description).map(DESCRIPTION_LOCAL, technicalObject.descriptionLocal)
				.map(ABC_INDICATOR, technicalObject.abcIndicator).map(ORGANIZATION, technicalObject.organization)
				.map(MANUFACTURER_MODEL_NUMBER, technicalObject.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, technicalObject.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, technicalObject.manufacturerPartNumber).map(MEMO, technicalObject.memo)
				.map(RECORD_STATUS, technicalObject.recordStatus).map(CREATED_DATE, technicalObject.createdDate)
				.map(CREATED_BY, technicalObject.createdBy).map(LAST_MODIFIED_DATE, technicalObject.lastModifiedDate)
				.map(LAST_MODIFIED_BY, technicalObject.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, technicalObject);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TechnicalObject> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable) {
		QTechnicalObject technicalObject = QTechnicalObject.technicalObject;
		JPQLQuery<TechnicalObject> query = from(technicalObject);
		Assert.notNull(organization, "organization is required");
		query.where(technicalObject.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { technicalObject.tag, technicalObject.description,
				technicalObject.descriptionLocal, technicalObject.abcIndicator, technicalObject.organization,
				technicalObject.manufacturerModelNumber, technicalObject.manufacturerSerialNumber,
				technicalObject.manufacturerPartNumber, technicalObject.memo, technicalObject.recordStatus,
				technicalObject.createdDate, technicalObject.createdBy, technicalObject.lastModifiedDate,
				technicalObject.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, technicalObject.tag)
				.map(DESCRIPTION, technicalObject.description).map(DESCRIPTION_LOCAL, technicalObject.descriptionLocal)
				.map(ABC_INDICATOR, technicalObject.abcIndicator).map(ORGANIZATION, technicalObject.organization)
				.map(MANUFACTURER_MODEL_NUMBER, technicalObject.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, technicalObject.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, technicalObject.manufacturerPartNumber).map(MEMO, technicalObject.memo)
				.map(RECORD_STATUS, technicalObject.recordStatus).map(CREATED_DATE, technicalObject.createdDate)
				.map(CREATED_BY, technicalObject.createdBy).map(LAST_MODIFIED_DATE, technicalObject.lastModifiedDate)
				.map(LAST_MODIFIED_BY, technicalObject.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, technicalObject);
	}
}
