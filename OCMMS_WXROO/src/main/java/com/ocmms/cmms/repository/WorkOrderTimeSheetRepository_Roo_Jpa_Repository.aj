// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import com.ocmms.cmms.repository.WorkOrderTimeSheetRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect WorkOrderTimeSheetRepository_Roo_Jpa_Repository {
    
    declare @type: WorkOrderTimeSheetRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderOperation
     * @return Long
     */
    public abstract long WorkOrderTimeSheetRepository.countByWorkOrderOperation(WorkOrderOperation workOrderOperation);
    
}
