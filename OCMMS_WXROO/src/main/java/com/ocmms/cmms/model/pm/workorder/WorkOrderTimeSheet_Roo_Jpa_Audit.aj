// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.workorder;

import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import javax.persistence.EntityListeners;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

privileged aspect WorkOrderTimeSheet_Roo_Jpa_Audit {
    
    declare @type: WorkOrderTimeSheet: @EntityListeners(AuditingEntityListener.class);
    
}
