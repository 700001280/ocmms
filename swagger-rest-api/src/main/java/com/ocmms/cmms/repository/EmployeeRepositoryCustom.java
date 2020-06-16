package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.hrm.Employee;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = EmployeeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface EmployeeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Employee> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Employee> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Employee> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Employee> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
