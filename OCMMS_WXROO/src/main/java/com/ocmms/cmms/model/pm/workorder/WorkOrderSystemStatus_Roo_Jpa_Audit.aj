// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.workorder;

import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import javax.persistence.EntityListeners;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

privileged aspect WorkOrderSystemStatus_Roo_Jpa_Audit {
    
    declare @type: WorkOrderSystemStatus: @EntityListeners(AuditingEntityListener.class);
    
}
