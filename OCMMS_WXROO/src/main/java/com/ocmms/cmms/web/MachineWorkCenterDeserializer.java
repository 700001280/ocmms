package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;
import com.ocmms.cmms.service.api.MachineWorkCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MachineWorkCenterDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MachineWorkCenter.class)
public class MachineWorkCenterDeserializer extends JsonObjectDeserializer<MachineWorkCenter> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MachineWorkCenterService machineWorkCenterService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param machineWorkCenterService
     * @param conversionService
     */
    @Autowired
    public MachineWorkCenterDeserializer(@Lazy MachineWorkCenterService machineWorkCenterService, ConversionService conversionService) {
        this.machineWorkCenterService = machineWorkCenterService;
        this.conversionService = conversionService;
    }
}
