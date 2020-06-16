package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoDetail;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.QLotoDetail;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = LotoDetailRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class LotoDetailRepositoryImpl extends QueryDslRepositorySupportExt<LotoDetail>
		implements LotoDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	LotoDetailRepositoryImpl() {
		super(LotoDetail.class);
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
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_DEVICE_TYPE = "lotoDeviceType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SOURCE_TAG = "sourceTag";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DEVICE = "device";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_INFO = "lotoInfo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_DETAIL_TYPE = "lotoDetailType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String POTENTIAL_HAZARD = "potentialHazard";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTE = "note";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SOURCE = "source";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String METHOD = "method";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RETURN_SERVICE_ORDER = "returnServiceOrder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ISOLATION_METHOD = "isolationMethod";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String VERIFICATION = "verification";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QLotoDetail lotoDetail = QLotoDetail.lotoDetail;
		JPQLQuery<LotoDetail> query = from(lotoDetail);
		Path<?>[] paths = new Path<?>[] { lotoDetail.source, lotoDetail.potentialHazard, lotoDetail.sourceTag,
				lotoDetail.device, lotoDetail.lotoDeviceType, lotoDetail.location, lotoDetail.method,
				lotoDetail.isolationMethod, lotoDetail.verification, lotoDetail.returnServiceOrder,
				lotoDetail.lotoDetailType, lotoDetail.note, lotoDetail.lotoInfo, lotoDetail.recordStatus,
				lotoDetail.createdDate, lotoDetail.createdBy, lotoDetail.lastModifiedDate, lotoDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SOURCE, lotoDetail.source)
				.map(POTENTIAL_HAZARD, lotoDetail.potentialHazard).map(SOURCE_TAG, lotoDetail.sourceTag)
				.map(DEVICE, lotoDetail.device).map(LOTO_DEVICE_TYPE, lotoDetail.lotoDeviceType)
				.map(LOCATION, lotoDetail.location).map(METHOD, lotoDetail.method)
				.map(ISOLATION_METHOD, lotoDetail.isolationMethod).map(VERIFICATION, lotoDetail.verification)
				.map(RETURN_SERVICE_ORDER, lotoDetail.returnServiceOrder)
				.map(LOTO_DETAIL_TYPE, lotoDetail.lotoDetailType).map(NOTE, lotoDetail.note)
				.map(LOTO_INFO, lotoDetail.lotoInfo).map(RECORD_STATUS, lotoDetail.recordStatus)
				.map(CREATED_DATE, lotoDetail.createdDate).map(CREATED_BY, lotoDetail.createdBy)
				.map(LAST_MODIFIED_DATE, lotoDetail.lastModifiedDate).map(LAST_MODIFIED_BY, lotoDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QLotoDetail lotoDetail = QLotoDetail.lotoDetail;
		JPQLQuery<LotoDetail> query = from(lotoDetail);
		Path<?>[] paths = new Path<?>[] { lotoDetail.source, lotoDetail.potentialHazard, lotoDetail.sourceTag,
				lotoDetail.device, lotoDetail.lotoDeviceType, lotoDetail.location, lotoDetail.method,
				lotoDetail.isolationMethod, lotoDetail.verification, lotoDetail.returnServiceOrder,
				lotoDetail.lotoDetailType, lotoDetail.note, lotoDetail.lotoInfo, lotoDetail.recordStatus,
				lotoDetail.createdDate, lotoDetail.createdBy, lotoDetail.lastModifiedDate, lotoDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(lotoDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(SOURCE, lotoDetail.source)
				.map(POTENTIAL_HAZARD, lotoDetail.potentialHazard).map(SOURCE_TAG, lotoDetail.sourceTag)
				.map(DEVICE, lotoDetail.device).map(LOTO_DEVICE_TYPE, lotoDetail.lotoDeviceType)
				.map(LOCATION, lotoDetail.location).map(METHOD, lotoDetail.method)
				.map(ISOLATION_METHOD, lotoDetail.isolationMethod).map(VERIFICATION, lotoDetail.verification)
				.map(RETURN_SERVICE_ORDER, lotoDetail.returnServiceOrder)
				.map(LOTO_DETAIL_TYPE, lotoDetail.lotoDetailType).map(NOTE, lotoDetail.note)
				.map(LOTO_INFO, lotoDetail.lotoInfo).map(RECORD_STATUS, lotoDetail.recordStatus)
				.map(CREATED_DATE, lotoDetail.createdDate).map(CREATED_BY, lotoDetail.createdBy)
				.map(LAST_MODIFIED_DATE, lotoDetail.lastModifiedDate).map(LAST_MODIFIED_BY, lotoDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<LotoDetail> findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable) {
		QLotoDetail lotoDetail = QLotoDetail.lotoDetail;
		JPQLQuery<LotoDetail> query = from(lotoDetail);
		Assert.notNull(lotoInfo, "lotoInfo is required");
		query.where(lotoDetail.lotoInfo.eq(lotoInfo));
		Path<?>[] paths = new Path<?>[] { lotoDetail.source, lotoDetail.potentialHazard, lotoDetail.sourceTag,
				lotoDetail.device, lotoDetail.lotoDeviceType, lotoDetail.location, lotoDetail.method,
				lotoDetail.isolationMethod, lotoDetail.verification, lotoDetail.returnServiceOrder,
				lotoDetail.lotoDetailType, lotoDetail.note, lotoDetail.lotoInfo, lotoDetail.recordStatus,
				lotoDetail.createdDate, lotoDetail.createdBy, lotoDetail.lastModifiedDate, lotoDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(SOURCE, lotoDetail.source)
				.map(POTENTIAL_HAZARD, lotoDetail.potentialHazard).map(SOURCE_TAG, lotoDetail.sourceTag)
				.map(DEVICE, lotoDetail.device).map(LOTO_DEVICE_TYPE, lotoDetail.lotoDeviceType)
				.map(LOCATION, lotoDetail.location).map(METHOD, lotoDetail.method)
				.map(ISOLATION_METHOD, lotoDetail.isolationMethod).map(VERIFICATION, lotoDetail.verification)
				.map(RETURN_SERVICE_ORDER, lotoDetail.returnServiceOrder)
				.map(LOTO_DETAIL_TYPE, lotoDetail.lotoDetailType).map(NOTE, lotoDetail.note)
				.map(LOTO_INFO, lotoDetail.lotoInfo).map(RECORD_STATUS, lotoDetail.recordStatus)
				.map(CREATED_DATE, lotoDetail.createdDate).map(CREATED_BY, lotoDetail.createdBy)
				.map(LAST_MODIFIED_DATE, lotoDetail.lastModifiedDate).map(LAST_MODIFIED_BY, lotoDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, lotoDetail);
	}
}
