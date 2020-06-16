package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import com.ocmms.cmms.model.loto.QLotoInfo;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = LotoInfoRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class LotoInfoRepositoryImpl extends QueryDslRepositorySupportExt<LotoInfo> implements LotoInfoRepositoryCustom {

	/**
	 * Default constructor
	 */
	LotoInfoRepositoryImpl() {
		super(LotoInfo.class);
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
	public static final String NEXT_AUDIT_DATE = "nextAuditDate";

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
	public static final String LOTO_BASE_INFO = "lotoBaseInfo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REVIEWED_BY = "reviewedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String BAR_URL = "barUrl";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTE = "note";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REVISED_BY = "revisedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_TAG = "lotoTag";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DEVELOPED_BY = "developedBy";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QLotoInfo lotoInfo = QLotoInfo.lotoInfo;
		JPQLQuery<LotoInfo> query = from(lotoInfo);
		Path<?>[] paths = new Path<?>[] { lotoInfo.lotoTag, lotoInfo.description, lotoInfo.equipment,
				lotoInfo.developedBy, lotoInfo.reviewedBy, lotoInfo.revisedBy, lotoInfo.note, lotoInfo.nextAuditDate,
				lotoInfo.barUrl, lotoInfo.lotoBaseInfo, lotoInfo.recordStatus, lotoInfo.createdDate, lotoInfo.createdBy,
				lotoInfo.lastModifiedDate, lotoInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOTO_TAG, lotoInfo.lotoTag)
				.map(DESCRIPTION, lotoInfo.description).map(EQUIPMENT, lotoInfo.equipment)
				.map(DEVELOPED_BY, lotoInfo.developedBy).map(REVIEWED_BY, lotoInfo.reviewedBy)
				.map(REVISED_BY, lotoInfo.revisedBy).map(NOTE, lotoInfo.note)
				.map(NEXT_AUDIT_DATE, lotoInfo.nextAuditDate).map(BAR_URL, lotoInfo.barUrl)
				.map(LOTO_BASE_INFO, lotoInfo.lotoBaseInfo).map(RECORD_STATUS, lotoInfo.recordStatus)
				.map(CREATED_DATE, lotoInfo.createdDate).map(CREATED_BY, lotoInfo.createdBy)
				.map(LAST_MODIFIED_DATE, lotoInfo.lastModifiedDate).map(LAST_MODIFIED_BY, lotoInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QLotoInfo lotoInfo = QLotoInfo.lotoInfo;
		JPQLQuery<LotoInfo> query = from(lotoInfo);
		Path<?>[] paths = new Path<?>[] { lotoInfo.lotoTag, lotoInfo.description, lotoInfo.equipment,
				lotoInfo.developedBy, lotoInfo.reviewedBy, lotoInfo.revisedBy, lotoInfo.note, lotoInfo.nextAuditDate,
				lotoInfo.barUrl, lotoInfo.lotoBaseInfo, lotoInfo.recordStatus, lotoInfo.createdDate, lotoInfo.createdBy,
				lotoInfo.lastModifiedDate, lotoInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(lotoInfo.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(LOTO_TAG, lotoInfo.lotoTag)
				.map(DESCRIPTION, lotoInfo.description).map(EQUIPMENT, lotoInfo.equipment)
				.map(DEVELOPED_BY, lotoInfo.developedBy).map(REVIEWED_BY, lotoInfo.reviewedBy)
				.map(REVISED_BY, lotoInfo.revisedBy).map(NOTE, lotoInfo.note)
				.map(NEXT_AUDIT_DATE, lotoInfo.nextAuditDate).map(BAR_URL, lotoInfo.barUrl)
				.map(LOTO_BASE_INFO, lotoInfo.lotoBaseInfo).map(RECORD_STATUS, lotoInfo.recordStatus)
				.map(CREATED_DATE, lotoInfo.createdDate).map(CREATED_BY, lotoInfo.createdBy)
				.map(LAST_MODIFIED_DATE, lotoInfo.lastModifiedDate).map(LAST_MODIFIED_BY, lotoInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoInfo> findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable) {
		QLotoInfo lotoInfo = QLotoInfo.lotoInfo;
		JPQLQuery<LotoInfo> query = from(lotoInfo);
		Assert.notNull(equipment, "equipment is required");
		query.where(lotoInfo.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { lotoInfo.lotoTag, lotoInfo.description, lotoInfo.equipment,
				lotoInfo.developedBy, lotoInfo.reviewedBy, lotoInfo.revisedBy, lotoInfo.note, lotoInfo.nextAuditDate,
				lotoInfo.barUrl, lotoInfo.lotoBaseInfo, lotoInfo.recordStatus, lotoInfo.createdDate, lotoInfo.createdBy,
				lotoInfo.lastModifiedDate, lotoInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOTO_TAG, lotoInfo.lotoTag)
				.map(DESCRIPTION, lotoInfo.description).map(EQUIPMENT, lotoInfo.equipment)
				.map(DEVELOPED_BY, lotoInfo.developedBy).map(REVIEWED_BY, lotoInfo.reviewedBy)
				.map(REVISED_BY, lotoInfo.revisedBy).map(NOTE, lotoInfo.note)
				.map(NEXT_AUDIT_DATE, lotoInfo.nextAuditDate).map(BAR_URL, lotoInfo.barUrl)
				.map(LOTO_BASE_INFO, lotoInfo.lotoBaseInfo).map(RECORD_STATUS, lotoInfo.recordStatus)
				.map(CREATED_DATE, lotoInfo.createdDate).map(CREATED_BY, lotoInfo.createdBy)
				.map(LAST_MODIFIED_DATE, lotoInfo.lastModifiedDate).map(LAST_MODIFIED_BY, lotoInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoInfo);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoBaseInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoInfo> findByLotoBaseInfo(LotoBaseInfo lotoBaseInfo, GlobalSearch globalSearch, Pageable pageable) {
		QLotoInfo lotoInfo = QLotoInfo.lotoInfo;
		JPQLQuery<LotoInfo> query = from(lotoInfo);
		Assert.notNull(lotoBaseInfo, "lotoBaseInfo is required");
		query.where(lotoInfo.lotoBaseInfo.eq(lotoBaseInfo));
		Path<?>[] paths = new Path<?>[] { lotoInfo.lotoTag, lotoInfo.description, lotoInfo.equipment,
				lotoInfo.developedBy, lotoInfo.reviewedBy, lotoInfo.revisedBy, lotoInfo.note, lotoInfo.nextAuditDate,
				lotoInfo.barUrl, lotoInfo.lotoBaseInfo, lotoInfo.recordStatus, lotoInfo.createdDate, lotoInfo.createdBy,
				lotoInfo.lastModifiedDate, lotoInfo.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(LOTO_TAG, lotoInfo.lotoTag)
				.map(DESCRIPTION, lotoInfo.description).map(EQUIPMENT, lotoInfo.equipment)
				.map(DEVELOPED_BY, lotoInfo.developedBy).map(REVIEWED_BY, lotoInfo.reviewedBy)
				.map(REVISED_BY, lotoInfo.revisedBy).map(NOTE, lotoInfo.note)
				.map(NEXT_AUDIT_DATE, lotoInfo.nextAuditDate).map(BAR_URL, lotoInfo.barUrl)
				.map(LOTO_BASE_INFO, lotoInfo.lotoBaseInfo).map(RECORD_STATUS, lotoInfo.recordStatus)
				.map(CREATED_DATE, lotoInfo.createdDate).map(CREATED_BY, lotoInfo.createdBy)
				.map(LAST_MODIFIED_DATE, lotoInfo.lastModifiedDate).map(LAST_MODIFIED_BY, lotoInfo.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoInfo);
	}
}
