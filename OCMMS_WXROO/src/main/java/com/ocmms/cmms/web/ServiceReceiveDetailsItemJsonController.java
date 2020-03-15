package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ServiceReceiveDetailsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ServiceReceiveDetail.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ServiceReceiveDetailsItemJsonController {
}
