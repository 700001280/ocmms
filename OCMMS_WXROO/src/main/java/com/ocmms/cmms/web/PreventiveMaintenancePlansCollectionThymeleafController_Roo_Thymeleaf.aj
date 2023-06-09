// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import com.ocmms.cmms.service.api.PreventiveMaintenancePlanService;
import com.ocmms.cmms.web.PreventiveMaintenancePlansCollectionThymeleafController;
import com.ocmms.cmms.web.PreventiveMaintenancePlansItemThymeleafController;
import com.ocmms.cmms.web.PreventiveMaintenancePlansItemThymeleafLinkFactory;
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

privileged aspect PreventiveMaintenancePlansCollectionThymeleafController_Roo_Thymeleaf {
    
    declare @type: PreventiveMaintenancePlansCollectionThymeleafController: @Controller;
    
    declare @type: PreventiveMaintenancePlansCollectionThymeleafController: @RequestMapping(value = "/preventivemaintenanceplans", name = "PreventiveMaintenancePlansCollectionThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PreventiveMaintenancePlanService PreventiveMaintenancePlansCollectionThymeleafController.preventiveMaintenancePlanService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource PreventiveMaintenancePlansCollectionThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<PreventiveMaintenancePlansItemThymeleafController> PreventiveMaintenancePlansCollectionThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<PreventiveMaintenancePlansCollectionThymeleafController> PreventiveMaintenancePlansCollectionThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService PreventiveMaintenancePlansCollectionThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param preventiveMaintenancePlanService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public PreventiveMaintenancePlansCollectionThymeleafController.new(PreventiveMaintenancePlanService preventiveMaintenancePlanService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setPreventiveMaintenancePlanService(preventiveMaintenancePlanService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(PreventiveMaintenancePlansItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(PreventiveMaintenancePlansCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PreventiveMaintenancePlanService
     */
    public PreventiveMaintenancePlanService PreventiveMaintenancePlansCollectionThymeleafController.getPreventiveMaintenancePlanService() {
        return preventiveMaintenancePlanService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlanService
     */
    public void PreventiveMaintenancePlansCollectionThymeleafController.setPreventiveMaintenancePlanService(PreventiveMaintenancePlanService preventiveMaintenancePlanService) {
        this.preventiveMaintenancePlanService = preventiveMaintenancePlanService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource PreventiveMaintenancePlansCollectionThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void PreventiveMaintenancePlansCollectionThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<PreventiveMaintenancePlansItemThymeleafController> PreventiveMaintenancePlansCollectionThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void PreventiveMaintenancePlansCollectionThymeleafController.setItemLink(MethodLinkBuilderFactory<PreventiveMaintenancePlansItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<PreventiveMaintenancePlansCollectionThymeleafController> PreventiveMaintenancePlansCollectionThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void PreventiveMaintenancePlansCollectionThymeleafController.setCollectionLink(MethodLinkBuilderFactory<PreventiveMaintenancePlansCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService PreventiveMaintenancePlansCollectionThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void PreventiveMaintenancePlansCollectionThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "list")
    public ModelAndView PreventiveMaintenancePlansCollectionThymeleafController.list(Model model) {
        return new ModelAndView("preventivemaintenanceplans/list");
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
    public ResponseEntity<ConvertedDatatablesData<PreventiveMaintenancePlan>> PreventiveMaintenancePlansCollectionThymeleafController.datatables(DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<PreventiveMaintenancePlan> preventiveMaintenancePlans = getPreventiveMaintenancePlanService().findAll(search, pageable);
        long totalPreventiveMaintenancePlansCount = preventiveMaintenancePlans.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalPreventiveMaintenancePlansCount = getPreventiveMaintenancePlanService().count();
        }
        ConvertedDatatablesData<PreventiveMaintenancePlan> datatablesData = new ConvertedDatatablesData<PreventiveMaintenancePlan>(preventiveMaintenancePlans, totalPreventiveMaintenancePlansCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<PreventiveMaintenancePlan>> PreventiveMaintenancePlansCollectionThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<PreventiveMaintenancePlan> preventiveMaintenancePlans = getPreventiveMaintenancePlanService().findAllByIdsIn(ids, search, pageable);
        long totalPreventiveMaintenancePlansCount = preventiveMaintenancePlans.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalPreventiveMaintenancePlansCount = getPreventiveMaintenancePlanService().count();
        }
        ConvertedDatatablesData<PreventiveMaintenancePlan> datatablesData = new ConvertedDatatablesData<PreventiveMaintenancePlan>(preventiveMaintenancePlans, totalPreventiveMaintenancePlansCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<Select2DataSupport<PreventiveMaintenancePlan>> PreventiveMaintenancePlansCollectionThymeleafController.select2(GlobalSearch search, Pageable pageable, Locale locale) {
        Page<PreventiveMaintenancePlan> preventiveMaintenancePlans = getPreventiveMaintenancePlanService().findAll(search, pageable);
        String idExpression = "#{id}";
        Select2DataSupport<PreventiveMaintenancePlan> select2Data = new Select2DataWithConversion<PreventiveMaintenancePlan>(preventiveMaintenancePlans, idExpression, getConversionService());
        return ResponseEntity.ok(select2Data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("preventiveMaintenancePlan")
    public void PreventiveMaintenancePlansCollectionThymeleafController.initPreventiveMaintenancePlanBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(PreventiveMaintenancePlan.class, getPreventiveMaintenancePlanService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void PreventiveMaintenancePlansCollectionThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("startDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void PreventiveMaintenancePlansCollectionThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlan
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView PreventiveMaintenancePlansCollectionThymeleafController.create(@Valid @ModelAttribute PreventiveMaintenancePlan preventiveMaintenancePlan, BindingResult result, Model model) {
        if (result.hasErrors()) {
            populateForm(model);
            
            return new ModelAndView("preventivemaintenanceplans/create");
        }
        PreventiveMaintenancePlan newPreventiveMaintenancePlan = getPreventiveMaintenancePlanService().save(preventiveMaintenancePlan);
        UriComponents showURI = getItemLink().to(PreventiveMaintenancePlansItemThymeleafLinkFactory.SHOW).with("preventiveMaintenancePlan", newPreventiveMaintenancePlan.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView PreventiveMaintenancePlansCollectionThymeleafController.createForm(Model model) {
        populateForm(model);
        
        model.addAttribute("preventiveMaintenancePlan", new PreventiveMaintenancePlan());
        return new ModelAndView("preventivemaintenanceplans/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    @ResponseBody
    public ResponseEntity<?> PreventiveMaintenancePlansCollectionThymeleafController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getPreventiveMaintenancePlanService().delete(ids);
        
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
    public void PreventiveMaintenancePlansCollectionThymeleafController.export(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, String[] datatablesColumns, HttpServletResponse response, JasperReportsExporter exporter, String fileName, Locale locale) {
        // Obtain the filtered and ordered elements
        Page<PreventiveMaintenancePlan> preventiveMaintenancePlans = getPreventiveMaintenancePlanService().findAll(search, pageable);
        
        // Prevent generation of reports with empty data
        if (preventiveMaintenancePlans == null || preventiveMaintenancePlans.getContent().isEmpty()) {
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
        JRDataSource ds = new JRBeanCollectionDataSource(preventiveMaintenancePlans.getContent());
        
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
    public ResponseEntity<?> PreventiveMaintenancePlansCollectionThymeleafController.exportCsv(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsCsvExporter(), "preventiveMaintenancePlans_report.csv", locale);
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
    public ResponseEntity<?> PreventiveMaintenancePlansCollectionThymeleafController.exportPdf(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsPdfExporter(), "preventiveMaintenancePlans_report.pdf", locale);
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
    public ResponseEntity<?> PreventiveMaintenancePlansCollectionThymeleafController.exportXls(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsXlsExporter(), "preventiveMaintenancePlans_report.xls", locale);
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
    public void PreventiveMaintenancePlansCollectionThymeleafController.addColumnToReportBuilder(String columnName, FastReportBuilder builder, Locale locale, String fileName) {
        try {
        if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_id", null, "Id", locale), "id", Long.class.getName(), 50);
        }
        else if (columnName.equals("code")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_code", null, "Code", locale), "code", String.class.getName(), 100);
        }
        else if (columnName.equals("category")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_category", null, "Category", locale), "category", String.class.getName(), 100);
        }
        else if (columnName.equals("singleCycle")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_singlecycle", null, "Single Cycle", locale), "singleCycle", Integer.class.getName(), 100);
        }
        else if (columnName.equals("description")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_description", null, "Description", locale), "description", String.class.getName(), 100);
        }
        else if (columnName.equals("schedulingPeriod")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_schedulingperiod", null, "Scheduling Period", locale), "schedulingPeriod", Integer.class.getName(), 100);
        }
        else if (columnName.equals("callHorizon")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_callhorizon", null, "Call Horizon", locale), "callHorizon", Integer.class.getName(), 100);
        }
        else if (columnName.equals("startDate")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_startdate", null, "Start Date", locale), "startDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("startCounter")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_startcounter", null, "Start Counter", locale), "startCounter", Integer.class.getName(), 100);
        }
        else if (columnName.equals("version")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_version", null, "Version", locale), "version", Long.class.getName(), 100);
        }
        else if (columnName.equals("createdDate")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_createddate", null, "Created Date", locale), "createdDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("createdBy")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_createdby", null, "Created By", locale), "createdBy", String.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedDate")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_lastmodifieddate", null, "Last Modified Date", locale), "lastModifiedDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedBy")) {
            builder.addColumn(getMessageSource().getMessage("label_preventivemaintenanceplan_lastmodifiedby", null, "Last Modified By", locale), "lastModifiedBy", String.class.getName(), 100);
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
