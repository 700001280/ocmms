// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.model.pm.routine;

import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;
import java.util.Objects;

privileged aspect PelletizerUpRollerMaintenanceRecord_Roo_JavaBean {
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean PelletizerUpRollerMaintenanceRecord.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof PelletizerUpRollerMaintenanceRecord)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((PelletizerUpRollerMaintenanceRecord) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int PelletizerUpRollerMaintenanceRecord.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PelletizerUpRollerMaintenanceRecord.toString() {
        return "PelletizerUpRollerMaintenanceRecord {" + 
        "}" + super.toString();
    }
    
}
