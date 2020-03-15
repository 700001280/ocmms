package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.IsolationMethod;
import com.ocmms.cmms.service.api.IsolationMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = IsolationMethodDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = IsolationMethod.class)
public class IsolationMethodDeserializer extends JsonObjectDeserializer<IsolationMethod> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private IsolationMethodService isolationMethodService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param isolationMethodService
     * @param conversionService
     */
    @Autowired
    public IsolationMethodDeserializer(@Lazy IsolationMethodService isolationMethodService, ConversionService conversionService) {
        this.isolationMethodService = isolationMethodService;
        this.conversionService = conversionService;
    }
}
