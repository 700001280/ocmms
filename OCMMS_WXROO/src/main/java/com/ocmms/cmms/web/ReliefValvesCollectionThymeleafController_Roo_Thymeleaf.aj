// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;
import com.ocmms.cmms.service.api.ReliefValveService;
import com.ocmms.cmms.web.ReliefValvesCollectionThymeleafController;
import com.ocmms.cmms.web.ReliefValvesItemThymeleafController;
import com.ocmms.cmms.web.ReliefValvesItemThymeleafLinkFactory;
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

privileged aspect ReliefValvesCollectionThymeleafController_Roo_Thymeleaf {
    
    declare @type: ReliefValvesCollectionThymeleafController: @Controller;
    
    declare @type: ReliefValvesCollectionThymeleafController: @RequestMapping(value = "/reliefvalves", name = "ReliefValvesCollectionThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ReliefValveService ReliefValvesCollectionThymeleafController.reliefValveService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource ReliefValvesCollectionThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ReliefValvesItemThymeleafController> ReliefValvesCollectionThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ReliefValvesCollectionThymeleafController> ReliefValvesCollectionThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService ReliefValvesCollectionThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param reliefValveService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public ReliefValvesCollectionThymeleafController.new(ReliefValveService reliefValveService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setReliefValveService(reliefValveService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(ReliefValvesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(ReliefValvesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ReliefValveService
     */
    public ReliefValveService ReliefValvesCollectionThymeleafController.getReliefValveService() {
        return reliefValveService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param reliefValveService
     */
    public void ReliefValvesCollectionThymeleafController.setReliefValveService(ReliefValveService reliefValveService) {
        this.reliefValveService = reliefValveService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource ReliefValvesCollectionThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void ReliefValvesCollectionThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ReliefValvesItemThymeleafController> ReliefValvesCollectionThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void ReliefValvesCollectionThymeleafController.setItemLink(MethodLinkBuilderFactory<ReliefValvesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ReliefValvesCollectionThymeleafController> ReliefValvesCollectionThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void ReliefValvesCollectionThymeleafController.setCollectionLink(MethodLinkBuilderFactory<ReliefValvesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService ReliefValvesCollectionThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void ReliefValvesCollectionThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "list")
    public ModelAndView ReliefValvesCollectionThymeleafController.list(Model model) {
        return new ModelAndView("reliefvalves/list");
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
    public ResponseEntity<ConvertedDatatablesData<ReliefValve>> ReliefValvesCollectionThymeleafController.datatables(DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<ReliefValve> reliefValves = getReliefValveService().findAll(search, pageable);
        long totalReliefValvesCount = reliefValves.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalReliefValvesCount = getReliefValveService().count();
        }
        ConvertedDatatablesData<ReliefValve> datatablesData = new ConvertedDatatablesData<ReliefValve>(reliefValves, totalReliefValvesCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<ReliefValve>> ReliefValvesCollectionThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<ReliefValve> reliefValves = getReliefValveService().findAllByIdsIn(ids, search, pageable);
        long totalReliefValvesCount = reliefValves.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalReliefValvesCount = getReliefValveService().count();
        }
        ConvertedDatatablesData<ReliefValve> datatablesData = new ConvertedDatatablesData<ReliefValve>(reliefValves, totalReliefValvesCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<Select2DataSupport<ReliefValve>> ReliefValvesCollectionThymeleafController.select2(GlobalSearch search, Pageable pageable, Locale locale) {
        Page<ReliefValve> reliefValves = getReliefValveService().findAll(search, pageable);
        String idExpression = "#{id}";
        Select2DataSupport<ReliefValve> select2Data = new Select2DataWithConversion<ReliefValve>(reliefValves, idExpression, getConversionService());
        return ResponseEntity.ok(select2Data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("reliefValve")
    public void ReliefValvesCollectionThymeleafController.initReliefValveBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(ReliefValve.class, getReliefValveService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ReliefValvesCollectionThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastInspectionDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("nextInspectionDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("manufactureDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ReliefValvesCollectionThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param reliefValve
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView ReliefValvesCollectionThymeleafController.create(@Valid @ModelAttribute ReliefValve reliefValve, BindingResult result, Model model) {
        if (result.hasErrors()) {
            populateForm(model);
            
            return new ModelAndView("reliefvalves/create");
        }
        ReliefValve newReliefValve = getReliefValveService().save(reliefValve);
        UriComponents showURI = getItemLink().to(ReliefValvesItemThymeleafLinkFactory.SHOW).with("reliefValve", newReliefValve.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView ReliefValvesCollectionThymeleafController.createForm(Model model) {
        populateForm(model);
        
        model.addAttribute("reliefValve", new ReliefValve());
        return new ModelAndView("reliefvalves/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    @ResponseBody
    public ResponseEntity<?> ReliefValvesCollectionThymeleafController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getReliefValveService().delete(ids);
        
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
    public void ReliefValvesCollectionThymeleafController.export(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, String[] datatablesColumns, HttpServletResponse response, JasperReportsExporter exporter, String fileName, Locale locale) {
        // Obtain the filtered and ordered elements
        Page<ReliefValve> reliefValves = getReliefValveService().findAll(search, pageable);
        
        // Prevent generation of reports with empty data
        if (reliefValves == null || reliefValves.getContent().isEmpty()) {
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
        JRDataSource ds = new JRBeanCollectionDataSource(reliefValves.getContent());
        
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
    public ResponseEntity<?> ReliefValvesCollectionThymeleafController.exportCsv(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsCsvExporter(), "reliefValves_report.csv", locale);
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
    public ResponseEntity<?> ReliefValvesCollectionThymeleafController.exportPdf(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsPdfExporter(), "reliefValves_report.pdf", locale);
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
    public ResponseEntity<?> ReliefValvesCollectionThymeleafController.exportXls(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsXlsExporter(), "reliefValves_report.xls", locale);
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
    public void ReliefValvesCollectionThymeleafController.addColumnToReportBuilder(String columnName, FastReportBuilder builder, Locale locale, String fileName) {
        try {
        if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_id", null, "Id", locale), "id", Long.class.getName(), 50);
        }
        else if (columnName.equals("tag")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_tag", null, "Tag", locale), "tag", String.class.getName(), 100);
        }
        else if (columnName.equals("description")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_description", null, "Description", locale), "description", String.class.getName(), 100);
        }
        else if (columnName.equals("descriptionLocal")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_descriptionlocal", null, "Description Local", locale), "descriptionLocal", String.class.getName(), 100);
        }
        else if (columnName.equals("manufacturerModelNumber")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_manufacturermodelnumber", null, "Manufacturer Model Number", locale), "manufacturerModelNumber", String.class.getName(), 100);
        }
        else if (columnName.equals("manufacturerSerialNumber")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_manufacturerserialnumber", null, "Manufacturer Serial Number", locale), "manufacturerSerialNumber", String.class.getName(), 100);
        }
        else if (columnName.equals("manufacturerPartNumber")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_manufacturerpartnumber", null, "Manufacturer Part Number", locale), "manufacturerPartNumber", String.class.getName(), 100);
        }
        else if (columnName.equals("memo")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_memo", null, "Memo", locale), "memo", String.class.getName(), 100);
        }
        else if (columnName.equals("version")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_version", null, "Version", locale), "version", Long.class.getName(), 100);
        }
        else if (columnName.equals("createdDate")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_createddate", null, "Created Date", locale), "createdDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("createdBy")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_createdby", null, "Created By", locale), "createdBy", String.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedDate")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_lastmodifieddate", null, "Last Modified Date", locale), "lastModifiedDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedBy")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_lastmodifiedby", null, "Last Modified By", locale), "lastModifiedBy", String.class.getName(), 100);
        }
        else if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_id", null, "Id", locale), "id", Long.class.getName(), 50);
        }
        else if (columnName.equals("lastInspectionDate")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_lastinspectiondate", null, "Last Inspection Date", locale), "lastInspectionDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("nextInspectionDate")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_nextinspectiondate", null, "Next Inspection Date", locale), "nextInspectionDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("nominalPressure")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_nominalpressure", null, "Nominal Pressure", locale), "nominalPressure", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("workingPressure")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_workingpressure", null, "Working Pressure", locale), "workingPressure", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("settingPressure")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_settingpressure", null, "Setting Pressure", locale), "settingPressure", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("nominalDiameter")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_nominaldiameter", null, "Nominal Diameter", locale), "nominalDiameter", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("designTemperature")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_designtemperature", null, "Design Temperature", locale), "designTemperature", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("workingTemperature")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_workingtemperature", null, "Working Temperature", locale), "workingTemperature", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("connectionType")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_connectiontype", null, "Connection Type", locale), "connectionType", String.class.getName(), 100);
        }
        else if (columnName.equals("medium")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_medium", null, "Medium", locale), "medium", String.class.getName(), 100);
        }
        else if (columnName.equals("fluidState")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_fluidstate", null, "Fluid State", locale), "fluidState", String.class.getName(), 100);
        }
        else if (columnName.equals("dischargeLocation")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_dischargelocation", null, "Discharge Location", locale), "dischargeLocation", String.class.getName(), 100);
        }
        else if (columnName.equals("manufactureDate")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_manufacturedate", null, "Manufacture Date", locale), "manufactureDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("designedServiceLife")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_designedservicelife", null, "Designed Service Life", locale), "designedServiceLife", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("classificationCategory")) {
            builder.addColumn(getMessageSource().getMessage("label_reliefvalve_classificationcategory", null, "Classification Category", locale), "classificationCategory", String.class.getName(), 100);
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
