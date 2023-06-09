// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.web.PlantSectionsItemNotificationHeadersThymeleafController;
import com.ocmms.cmms.web.PlantSectionsItemNotificationHeadersThymeleafLinkFactory;
import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect PlantSectionsItemNotificationHeadersThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: PlantSectionsItemNotificationHeadersThymeleafLinkFactory implements MethodLinkFactory<PlantSectionsItemNotificationHeadersThymeleafController>;
    
    declare @type: PlantSectionsItemNotificationHeadersThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlantSectionsItemNotificationHeadersThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlantSectionsItemNotificationHeadersThymeleafLinkFactory.DATATABLESBYIDSIN = "datatablesByIdsIn";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlantSectionsItemNotificationHeadersThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlantSectionsItemNotificationHeadersThymeleafLinkFactory.REMOVEFROMNOTIFICATIONHEADERS = "removeFromNotificationHeaders";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlantSectionsItemNotificationHeadersThymeleafLinkFactory.REMOVEFROMNOTIFICATIONHEADERSBATCH = "removeFromNotificationHeadersBatch";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PlantSectionsItemNotificationHeadersThymeleafLinkFactory.CREATE = "create";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PlantSectionsItemNotificationHeadersThymeleafController> PlantSectionsItemNotificationHeadersThymeleafLinkFactory.getControllerClass() {
        return PlantSectionsItemNotificationHeadersThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents PlantSectionsItemNotificationHeadersThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(DATATABLESBYIDSIN)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatablesByIdsIn(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMNOTIFICATIONHEADERS)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromNotificationHeaders(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(REMOVEFROMNOTIFICATIONHEADERSBATCH)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).removeFromNotificationHeadersBatch(null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATE)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).create(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
