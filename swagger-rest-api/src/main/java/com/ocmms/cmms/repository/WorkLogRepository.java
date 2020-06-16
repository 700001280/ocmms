package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.WorkLog;

import com.ocmms.cmms.model.assistance.WorkLogType;

import com.ocmms.cmms.model.hrm.Employee;
import java.util.List;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * = WorkLogRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "worklog", path = "worklog")
//@RepositoryRestResource(excerptProjection = VirtualWorkLogProjection.class)
@CrossOrigin(maxAge = 3600)
public interface WorkLogRepository extends  WorkLogRepositoryCustom,
		PagingAndSortingRepository<WorkLog, Long> , QuerydslPredicateExecutor<WorkLog>{
	
	List<WorkLog> findByLogger(@Param("username")Employee logger);	

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param logger
	 * @return Long
	 */
	public abstract long countByLogger(Employee logger);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLogType
	 * @return Long
	 */
	public abstract long countByWorkLogType(WorkLogType workLogType);
	
	
}
