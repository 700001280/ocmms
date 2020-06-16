package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EmployeeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends  EmployeeRepositoryCustom,
		PagingAndSortingRepository<Employee, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @return Long
	 */
	public abstract long countByCostCenter(CostCenter costCenter);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);
	
	public Employee findByUsername(String username);
}
