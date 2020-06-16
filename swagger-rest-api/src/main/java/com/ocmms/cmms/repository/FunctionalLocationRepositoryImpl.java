package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import com.ocmms.cmms.model.pm.technicalobject.QFunctionalLocation;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = FunctionalLocationRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class FunctionalLocationRepositoryImpl extends QueryDslRepositorySupportExt<FunctionalLocation>
		implements FunctionalLocationRepositoryCustom {

	/**
	 * Default constructor
	 */
	FunctionalLocationRepositoryImpl() {
		super(FunctionalLocation.class);
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
	public static final String LOCATION = "location";

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
	public static final String STR_INDICATOR = "strIndicator";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION_LOCAL = "descriptionLocal";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FUNCTIONAL_LOCATION_CCATEGORY = "functionalLocationCcategory";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT_ALLOWED_IND = "equipmentAllowedInd";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUPERIOR_FUNCTIONAL_LOCATION = "superiorFunctionalLocation";

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
	public Page<FunctionalLocation> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QFunctionalLocation functionalLocation = QFunctionalLocation.functionalLocation;
		JPQLQuery<FunctionalLocation> query = from(functionalLocation);
		Path<?>[] paths = new Path<?>[] { functionalLocation.tag, functionalLocation.description,
				functionalLocation.descriptionLocal, functionalLocation.abcIndicator, functionalLocation.organization,
				functionalLocation.manufacturerModelNumber, functionalLocation.manufacturerSerialNumber,
				functionalLocation.manufacturerPartNumber, functionalLocation.memo, functionalLocation.recordStatus,
				functionalLocation.createdDate, functionalLocation.createdBy, functionalLocation.lastModifiedDate,
				functionalLocation.lastModifiedBy, functionalLocation.location, functionalLocation.equipmentAllowedInd,
				functionalLocation.strIndicator, functionalLocation.functionalLocationCcategory,
				functionalLocation.superiorFunctionalLocation };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, functionalLocation.tag)
				.map(DESCRIPTION, functionalLocation.description)
				.map(DESCRIPTION_LOCAL, functionalLocation.descriptionLocal)
				.map(ABC_INDICATOR, functionalLocation.abcIndicator).map(ORGANIZATION, functionalLocation.organization)
				.map(MANUFACTURER_MODEL_NUMBER, functionalLocation.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, functionalLocation.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, functionalLocation.manufacturerPartNumber)
				.map(MEMO, functionalLocation.memo).map(RECORD_STATUS, functionalLocation.recordStatus)
				.map(CREATED_DATE, functionalLocation.createdDate).map(CREATED_BY, functionalLocation.createdBy)
				.map(LAST_MODIFIED_DATE, functionalLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, functionalLocation.lastModifiedBy).map(LOCATION, functionalLocation.location)
				.map(EQUIPMENT_ALLOWED_IND, functionalLocation.equipmentAllowedInd)
				.map(STR_INDICATOR, functionalLocation.strIndicator)
				.map(FUNCTIONAL_LOCATION_CCATEGORY, functionalLocation.functionalLocationCcategory)
				.map(SUPERIOR_FUNCTIONAL_LOCATION, functionalLocation.superiorFunctionalLocation);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, functionalLocation);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<FunctionalLocation> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QFunctionalLocation functionalLocation = QFunctionalLocation.functionalLocation;
		JPQLQuery<FunctionalLocation> query = from(functionalLocation);
		Path<?>[] paths = new Path<?>[] { functionalLocation.tag, functionalLocation.description,
				functionalLocation.descriptionLocal, functionalLocation.abcIndicator, functionalLocation.organization,
				functionalLocation.manufacturerModelNumber, functionalLocation.manufacturerSerialNumber,
				functionalLocation.manufacturerPartNumber, functionalLocation.memo, functionalLocation.recordStatus,
				functionalLocation.createdDate, functionalLocation.createdBy, functionalLocation.lastModifiedDate,
				functionalLocation.lastModifiedBy, functionalLocation.location, functionalLocation.equipmentAllowedInd,
				functionalLocation.strIndicator, functionalLocation.functionalLocationCcategory,
				functionalLocation.superiorFunctionalLocation };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(functionalLocation.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, functionalLocation.tag)
				.map(DESCRIPTION, functionalLocation.description)
				.map(DESCRIPTION_LOCAL, functionalLocation.descriptionLocal)
				.map(ABC_INDICATOR, functionalLocation.abcIndicator).map(ORGANIZATION, functionalLocation.organization)
				.map(MANUFACTURER_MODEL_NUMBER, functionalLocation.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, functionalLocation.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, functionalLocation.manufacturerPartNumber)
				.map(MEMO, functionalLocation.memo).map(RECORD_STATUS, functionalLocation.recordStatus)
				.map(CREATED_DATE, functionalLocation.createdDate).map(CREATED_BY, functionalLocation.createdBy)
				.map(LAST_MODIFIED_DATE, functionalLocation.lastModifiedDate)
				.map(LAST_MODIFIED_BY, functionalLocation.lastModifiedBy).map(LOCATION, functionalLocation.location)
				.map(EQUIPMENT_ALLOWED_IND, functionalLocation.equipmentAllowedInd)
				.map(STR_INDICATOR, functionalLocation.strIndicator)
				.map(FUNCTIONAL_LOCATION_CCATEGORY, functionalLocation.functionalLocationCcategory)
				.map(SUPERIOR_FUNCTIONAL_LOCATION, functionalLocation.superiorFunctionalLocation);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, functionalLocation);
	}
}
