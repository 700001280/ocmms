// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.service.api.ServiceProcurementItemDetailService;
import com.ocmms.cmms.web.ServiceProcurementItemDetailsCollectionThymeleafController;
import com.ocmms.cmms.web.ServiceProcurementItemDetailsItemThymeleafController;
import com.ocmms.cmms.web.ServiceProcurementItemDetailsItemThymeleafLinkFactory;
import com.ocmms.cmms.web.reports.ExportingErrorException;
import com.ocmms.cmms.web.reports.JasperReportsCsvExporter;
import com.ocmms.cmms.web.reports.JasperReportsExporter;
import com.ocmms.cmms.web.reports.JasperReportsPdfExporter;
import com.ocmms.cmms.web.reports.JasperReportsXlsExporter;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.datatables.ConvertedDatatablesData;
import io.springlets.data.web.datatables.Datatables;
import io.springlets.data.web.datatables.DatatablesColumns;
import io.springlets.data.web.datatables.DatatablesPageable;
import io.springlets.data.web.select2.Select2DataSupport;
import io.springlets.data.web.select2.Select2DataWithConversion;
import io.springlets.data.web.validation.GenericValidator;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;

privileged aspect ServiceProcurementItemDetailsCollectionThymeleafController_Roo_Thymeleaf {
    
    declare @type: ServiceProcurementItemDetailsCollectionThymeleafController: @Controller;
    
    declare @type: ServiceProcurementItemDetailsCollectionThymeleafController: @RequestMapping(value = "/serviceprocurementitemdetails", name = "ServiceProcurementItemDetailsCollectionThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ServiceProcurementItemDetailService ServiceProcurementItemDetailsCollectionThymeleafController.serviceProcurementItemDetailService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource ServiceProcurementItemDetailsCollectionThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ServiceProcurementItemDetailsItemThymeleafController> ServiceProcurementItemDetailsCollectionThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ServiceProcurementItemDetailsCollectionThymeleafController> ServiceProcurementItemDetailsCollectionThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService ServiceProcurementItemDetailsCollectionThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param serviceProcurementItemDetailService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public ServiceProcurementItemDetailsCollectionThymeleafController.new(ServiceProcurementItemDetailService serviceProcurementItemDetailService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setServiceProcurementItemDetailService(serviceProcurementItemDetailService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(ServiceProcurementItemDetailsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(ServiceProcurementItemDetailsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ServiceProcurementItemDetailService
     */
    public ServiceProcurementItemDetailService ServiceProcurementItemDetailsCollectionThymeleafController.getServiceProcurementItemDetailService() {
        return serviceProcurementItemDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceProcurementItemDetailService
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.setServiceProcurementItemDetailService(ServiceProcurementItemDetailService serviceProcurementItemDetailService) {
        this.serviceProcurementItemDetailService = serviceProcurementItemDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource ServiceProcurementItemDetailsCollectionThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ServiceProcurementItemDetailsItemThymeleafController> ServiceProcurementItemDetailsCollectionThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.setItemLink(MethodLinkBuilderFactory<ServiceProcurementItemDetailsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ServiceProcurementItemDetailsCollectionThymeleafController> ServiceProcurementItemDetailsCollectionThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.setCollectionLink(MethodLinkBuilderFactory<ServiceProcurementItemDetailsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService ServiceProcurementItemDetailsCollectionThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "list")
    public ModelAndView ServiceProcurementItemDetailsCollectionThymeleafController.list(Model model) {
        return new ModelAndView("serviceprocurementitemdetails/list");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(produces = Datatables.MEDIA_TYPE, name = "datatables", value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<ServiceProcurementItemDetail>> ServiceProcurementItemDetailsCollectionThymeleafController.datatables(DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<ServiceProcurementItemDetail> serviceProcurementItemDetails = getServiceProcurementItemDetailService().findAll(search, pageable);
        long totalServiceProcurementItemDetailsCount = serviceProcurementItemDetails.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalServiceProcurementItemDetailsCount = getServiceProcurementItemDetailService().count();
        }
        ConvertedDatatablesData<ServiceProcurementItemDetail> datatablesData = new ConvertedDatatablesData<ServiceProcurementItemDetail>(serviceProcurementItemDetails, totalServiceProcurementItemDetailsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(datatablesData);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(produces = Datatables.MEDIA_TYPE, name = "datatablesByIdsIn", value = "/dtByIdsIn")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<ServiceProcurementItemDetail>> ServiceProcurementItemDetailsCollectionThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<ServiceProcurementItemDetail> serviceProcurementItemDetails = getServiceProcurementItemDetailService().findAllByIdsIn(ids, search, pageable);
        long totalServiceProcurementItemDetailsCount = serviceProcurementItemDetails.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalServiceProcurementItemDetailsCount = getServiceProcurementItemDetailService().count();
        }
        ConvertedDatatablesData<ServiceProcurementItemDetail> datatablesData = new ConvertedDatatablesData<ServiceProcurementItemDetail>(serviceProcurementItemDetails, totalServiceProcurementItemDetailsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(datatablesData);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param search
     * @param pageable
     * @param locale
     * @return ResponseEntity
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, name = "select2", value = "/s2")
    @ResponseBody
    public ResponseEntity<Select2DataSupport<ServiceProcurementItemDetail>> ServiceProcurementItemDetailsCollectionThymeleafController.select2(GlobalSearch search, Pageable pageable, Locale locale) {
        Page<ServiceProcurementItemDetail> serviceProcurementItemDetails = getServiceProcurementItemDetailService().findAll(search, pageable);
        String idExpression = "#{id}";
        Select2DataSupport<ServiceProcurementItemDetail> select2Data = new Select2DataWithConversion<ServiceProcurementItemDetail>(serviceProcurementItemDetails, idExpression, getConversionService());
        return ResponseEntity.ok(select2Data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("serviceProcurementItemDetail")
    public void ServiceProcurementItemDetailsCollectionThymeleafController.initServiceProcurementItemDetailBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(ServiceProcurementItemDetail.class, getServiceProcurementItemDetailService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("submitDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceProcurementItemDetail
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView ServiceProcurementItemDetailsCollectionThymeleafController.create(@Valid @ModelAttribute ServiceProcurementItemDetail serviceProcurementItemDetail, BindingResult result, Model model) {
        if (result.hasErrors()) {
            populateForm(model);
            
            return new ModelAndView("serviceprocurementitemdetails/create");
        }
        ServiceProcurementItemDetail newServiceProcurementItemDetail = getServiceProcurementItemDetailService().save(serviceProcurementItemDetail);
        UriComponents showURI = getItemLink().to(ServiceProcurementItemDetailsItemThymeleafLinkFactory.SHOW).with("serviceProcurementItemDetail", newServiceProcurementItemDetail.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView ServiceProcurementItemDetailsCollectionThymeleafController.createForm(Model model) {
        populateForm(model);
        
        model.addAttribute("serviceProcurementItemDetail", new ServiceProcurementItemDetail());
        return new ModelAndView("serviceprocurementitemdetails/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    @ResponseBody
    public ResponseEntity<?> ServiceProcurementItemDetailsCollectionThymeleafController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getServiceProcurementItemDetailService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * Method that obtains the filtered and ordered records using the Datatables information and 
     * export them to a new report file. (It ignores the current pagination).
     * 
     * To generate the report file it uses the `DynamicJasper` library
     * (http://dynamicjasper.com). This library allows developers to generate reports dynamically
     * without use an specific template to each entity.
     * 
     * To customize the appearance of ALL generated reports, you could customize the 
     * "export_default.jrxml" template located in "src/main/resources/templates/reports/". However,
     * if you want to customize the appearance of this specific report, you could create a new
     * ".jrxml" file and provide it to the library replacing the `builder.setTemplateFile();`
     * operation used in this implementation.
     * 
     * @param search GlobalSearch that contains the filter provided by the Datatables component.
     * @param pageable Pageable that contains the Sort info provided by the Datatabes component.
     * @param datatablesColumns Columns displayed in the Datatables component.
     * @param response The HttpServletResponse.
     * @param exporter An specific JasperReportsExporter to be used during export process.
     * @param fileName The final filename to use.
     * @param locale The current Locale in the view context.
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.export(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, String[] datatablesColumns, HttpServletResponse response, JasperReportsExporter exporter, String fileName, Locale locale) {
        // Obtain the filtered and ordered elements
        Page<ServiceProcurementItemDetail> serviceProcurementItemDetails = getServiceProcurementItemDetailService().findAll(search, pageable);
        
        // Prevent generation of reports with empty data
        if (serviceProcurementItemDetails == null || serviceProcurementItemDetails.getContent().isEmpty()) {
            return;
        }
        
        // Creates a new ReportBuilder using DynamicJasper library
        FastReportBuilder builder = new FastReportBuilder();
        
        // IMPORTANT: By default, this application uses "export_default.jrxml"
        // to generate all reports. If you want to customize this specific report,
        // create a new ".jrxml" template and customize it. (Take in account the 
        // DynamicJasper restrictions: 
        // http://dynamicjasper.com/2010/10/06/how-to-use-custom-jrxml-templates/)
        builder.setTemplateFile("templates/reports/export_default.jrxml");
        
        // The generated report will display the same columns as the Datatables component.
        // However, this is not mandatory. You could edit this code if you want to ignore
        // the provided datatablesColumns
        if (datatablesColumns != null) {
            for (String column : datatablesColumns) {
                // Delegates in addColumnToReportBuilder to include each datatables column
                // to the report builder
                addColumnToReportBuilder(column, builder, locale, fileName);
            }
        }
        
        // This property resizes the columns to use full width page.
        // Set false value if you want to use the specific width of each column.
        builder.setUseFullPageWidth(true);
        
        // Creates a new Jasper Reports Datasource using the obtained elements
        JRDataSource ds = new JRBeanCollectionDataSource(serviceProcurementItemDetails.getContent());
        
        // Generates the JasperReport
        JasperPrint jp;
        try {
            jp = DynamicJasperHelper.generateJasperPrint(builder.build(), new ClassicLayoutManager(), ds);
        }
        catch (JRException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", 
                new Object[] {StringUtils.substringAfterLast(fileName, ".").toUpperCase()}, 
                String.format("Error while exporting data to StringUtils file", StringUtils.
                    substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
        
        // Converts the JaspertReport element to a ByteArrayOutputStream and
        // write it into the response stream using the provided JasperReportExporter
        try {
            exporter.export(jp, fileName, response);
        }
        catch (JRException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", 
                new Object[] {StringUtils.substringAfterLast(fileName, ".").toUpperCase()}, 
                String.format("Error while exporting data to StringUtils file", StringUtils.
                    substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
        catch (IOException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", 
                new Object[] {StringUtils.substringAfterLast(fileName, ".").toUpperCase()}, 
                String.format("Error while exporting data to StringUtils file", StringUtils.
                    substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
    }
    
    /**
     * It delegates in the `export` method providing the necessary information
     * to generate a CSV report.
     * 
     * @param search The GlobalSearch that contains the filter provided by the Datatables component
     * @param pageable The Pageable that contains the Sort info provided by the Datatabes component
     * @param datatablesColumns The Columns displayed in the Datatables component
     * @param response The HttpServletResponse
     * @return ResponseEntity
     */
    @GetMapping(name = "exportCsv", value = "/export/csv")
    @ResponseBody
    public ResponseEntity<?> ServiceProcurementItemDetailsCollectionThymeleafController.exportCsv(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsCsvExporter(), "serviceProcurementItemDetails_report.csv", locale);
        return ResponseEntity.ok().build();
    }
    
    /**
     * It delegates in the `export` method providing the necessary information
     * to generate a PDF report.
     * 
     * @param search The GlobalSearch that contains the filter provided by the Datatables component
     * @param pageable The Pageable that contains the Sort info provided by the Datatabes component
     * @param datatablesColumns The Columns displayed in the Datatables component
     * @param response The HttpServletResponse
     * @return ResponseEntity
     */
    @GetMapping(name = "exportPdf", value = "/export/pdf")
    @ResponseBody
    public ResponseEntity<?> ServiceProcurementItemDetailsCollectionThymeleafController.exportPdf(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsPdfExporter(), "serviceProcurementItemDetails_report.pdf", locale);
        return ResponseEntity.ok().build();
    }
    
    /**
     * It delegates in the `export` method providing the necessary information
     * to generate a XLS report.
     * 
     * @param search The GlobalSearch that contains the filter provided by the Datatables component
     * @param pageable The Pageable that contains the Sort info provided by the Datatabes component
     * @param datatablesColumns The Columns displayed in the Datatables component
     * @param response The HttpServletResponse
     * @return ResponseEntity
     */
    @GetMapping(name = "exportXls", value = "/export/xls")
    @ResponseBody
    public ResponseEntity<?> ServiceProcurementItemDetailsCollectionThymeleafController.exportXls(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsXlsExporter(), "serviceProcurementItemDetails_report.xls", locale);
        return ResponseEntity.ok().build();
    }
    
    /**
     * This method contains all the entity fields that are able to be displayed in a 
     * report. The developer could add a new column to the report builder providing the 
     * field name and the builder where the new field will be added as column.
     * 
     * @param columnName the field name to show as column
     * @param builder The builder where the new field will be added as column.
     */
    public void ServiceProcurementItemDetailsCollectionThymeleafController.addColumnToReportBuilder(String columnName, FastReportBuilder builder, Locale locale, String fileName) {
        try {
        if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_id", null, "Id", locale), "id", Long.class.getName(), 50);
        }
        else if (columnName.equals("prNumber")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_prnumber", null, "Pr Number", locale), "prNumber", String.class.getName(), 100);
        }
        else if (columnName.equals("poNumber")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_ponumber", null, "Po Number", locale), "poNumber", String.class.getName(), 100);
        }
        else if (columnName.equals("material")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_material", null, "Material", locale), "material", String.class.getName(), 100);
        }
        else if (columnName.equals("submitDate")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_submitdate", null, "Submit Date", locale), "submitDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("quantity")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_quantity", null, "Quantity", locale), "quantity", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("unitPrice")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_unitprice", null, "Unit Price", locale), "unitPrice", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("memo")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_memo", null, "Memo", locale), "memo", String.class.getName(), 100);
        }
        else if (columnName.equals("closed")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_closed", null, "Closed", locale), "closed", Boolean.class.getName(), 100);
        }
        else if (columnName.equals("version")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_version", null, "Version", locale), "version", Long.class.getName(), 100);
        }
        else if (columnName.equals("createdDate")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_createddate", null, "Created Date", locale), "createdDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("createdBy")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_createdby", null, "Created By", locale), "createdBy", String.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedDate")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_lastmodifieddate", null, "Last Modified Date", locale), "lastModifiedDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedBy")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_lastmodifiedby", null, "Last Modified By", locale), "lastModifiedBy", String.class.getName(), 100);
        }
        else if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_id", null, "Id", locale), "id", Long.class.getName(), 50);
        }
        else if (columnName.equals("description")) {
            builder.addColumn(getMessageSource().getMessage("label_serviceprocurementitemdetail_description", null, "Description", locale), "description", String.class.getName(), 100);
        }
        }
        catch (ColumnBuilderException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", 
                new Object[] {StringUtils.substringAfterLast(fileName, ".").toUpperCase()}, 
                String.format("Error while exporting data to StringUtils file", StringUtils.
                    substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
        catch (ClassNotFoundException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", 
                new Object[] {StringUtils.substringAfterLast(fileName, ".").toUpperCase()}, 
                String.format("Error while exporting data to StringUtils file", StringUtils.
                    substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
    }
    
}
