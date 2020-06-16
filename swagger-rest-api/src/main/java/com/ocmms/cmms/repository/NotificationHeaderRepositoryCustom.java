package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationHeader;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = NotificationHeaderRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface NotificationHeaderRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param userStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findByUserStatus(NotificationUserStatusWithNumber userStatus,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantSection
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findByPlantSection(PlantSection plantSection, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findByPlantLocation(PlantLocation plantLocation, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findByNotificationType(NotificationType notificationType,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findByTechnicalObject(TechnicalObject technicalObject,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param reportedBy
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findByReportedBy(Employee reportedBy, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param priority
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findByPriority(NotificationPriority priority, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findBySystemStatus(NotificationSystemStatus systemStatus,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<NotificationHeader> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
