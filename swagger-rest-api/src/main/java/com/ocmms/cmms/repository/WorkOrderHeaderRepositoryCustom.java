package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;

import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WorkOrderHeaderRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WorkOrderHeaderRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param userStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderHeader> findByUserStatus(WorkOrderUserStatusWithNumber userStatus,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderHeader> findByWorkOrderType(WorkOrderType workOrderType, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemCondition
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderHeader> findBySystemCondition(SystemCondition systemCondition,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param activityType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderHeader> findByActivityType(MaintenanceActivityType activityType,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderHeader> findByNotificationHeader(NotificationHeader notificationHeader,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderHeader> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<WorkOrderHeader> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
