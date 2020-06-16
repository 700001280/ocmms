package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.QPressureGage;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PressureGageRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PressureGageRepositoryImpl extends QueryDslRepositorySupportExt<PressureGage>
		implements PressureGageRepositoryCustom {

	/**
	 * Default constructor
	 */
	PressureGageRepositoryImpl() {
		super(PressureGage.class);
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
	public static final String NEXT_INSPECTION_DATE = "nextInspectionDate";

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
	public static final String LAST_INSPECTION_DATE = "lastInspectionDate";

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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PARAMETER = "parameter";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PressureGage> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPressureGage pressureGage = QPressureGage.pressureGage;
		JPQLQuery<PressureGage> query = from(pressureGage);
		Path<?>[] paths = new Path<?>[] { pressureGage.tag, pressureGage.description, pressureGage.descriptionLocal,
				pressureGage.abcIndicator, pressureGage.organization, pressureGage.manufacturerModelNumber,
				pressureGage.manufacturerSerialNumber, pressureGage.manufacturerPartNumber, pressureGage.memo,
				pressureGage.recordStatus, pressureGage.createdDate, pressureGage.createdBy,
				pressureGage.lastModifiedDate, pressureGage.lastModifiedBy, pressureGage.lastInspectionDate,
				pressureGage.nextInspectionDate, pressureGage.parameter };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, pressureGage.tag)
				.map(DESCRIPTION, pressureGage.description).map(DESCRIPTION_LOCAL, pressureGage.descriptionLocal)
				.map(ABC_INDICATOR, pressureGage.abcIndicator).map(ORGANIZATION, pressureGage.organization)
				.map(MANUFACTURER_MODEL_NUMBER, pressureGage.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, pressureGage.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, pressureGage.manufacturerPartNumber).map(MEMO, pressureGage.memo)
				.map(RECORD_STATUS, pressureGage.recordStatus).map(CREATED_DATE, pressureGage.createdDate)
				.map(CREATED_BY, pressureGage.createdBy).map(LAST_MODIFIED_DATE, pressureGage.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pressureGage.lastModifiedBy)
				.map(LAST_INSPECTION_DATE, pressureGage.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, pressureGage.nextInspectionDate).map(PARAMETER, pressureGage.parameter);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pressureGage);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PressureGage> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPressureGage pressureGage = QPressureGage.pressureGage;
		JPQLQuery<PressureGage> query = from(pressureGage);
		Path<?>[] paths = new Path<?>[] { pressureGage.tag, pressureGage.description, pressureGage.descriptionLocal,
				pressureGage.abcIndicator, pressureGage.organization, pressureGage.manufacturerModelNumber,
				pressureGage.manufacturerSerialNumber, pressureGage.manufacturerPartNumber, pressureGage.memo,
				pressureGage.recordStatus, pressureGage.createdDate, pressureGage.createdBy,
				pressureGage.lastModifiedDate, pressureGage.lastModifiedBy, pressureGage.lastInspectionDate,
				pressureGage.nextInspectionDate, pressureGage.parameter };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pressureGage.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, pressureGage.tag)
				.map(DESCRIPTION, pressureGage.description).map(DESCRIPTION_LOCAL, pressureGage.descriptionLocal)
				.map(ABC_INDICATOR, pressureGage.abcIndicator).map(ORGANIZATION, pressureGage.organization)
				.map(MANUFACTURER_MODEL_NUMBER, pressureGage.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, pressureGage.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, pressureGage.manufacturerPartNumber).map(MEMO, pressureGage.memo)
				.map(RECORD_STATUS, pressureGage.recordStatus).map(CREATED_DATE, pressureGage.createdDate)
				.map(CREATED_BY, pressureGage.createdBy).map(LAST_MODIFIED_DATE, pressureGage.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pressureGage.lastModifiedBy)
				.map(LAST_INSPECTION_DATE, pressureGage.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, pressureGage.nextInspectionDate).map(PARAMETER, pressureGage.parameter);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pressureGage);
	}
}
