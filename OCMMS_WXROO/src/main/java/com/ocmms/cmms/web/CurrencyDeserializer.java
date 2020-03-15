package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.Currency;
import com.ocmms.cmms.service.api.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = CurrencyDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Currency.class)
public class CurrencyDeserializer extends JsonObjectDeserializer<Currency> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CurrencyService currencyService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param currencyService
     * @param conversionService
     */
    @Autowired
    public CurrencyDeserializer(@Lazy CurrencyService currencyService, ConversionService conversionService) {
        this.currencyService = currencyService;
        this.conversionService = conversionService;
    }
}
