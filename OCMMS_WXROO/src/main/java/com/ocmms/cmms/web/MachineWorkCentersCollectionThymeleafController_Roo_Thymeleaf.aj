// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;
import com.ocmms.cmms.service.api.MachineWorkCenterService;
import com.ocmms.cmms.web.MachineWorkCentersCollectionThymeleafController;
import com.ocmms.cmms.web.MachineWorkCentersItemThymeleafController;
import com.ocmms.cmms.web.MachineWorkCentersItemThymeleafLinkFactory;
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

privileged aspect MachineWorkCentersCollectionThymeleafController_Roo_Thymeleaf {
    
    declare @type: MachineWorkCentersCollectionThymeleafController: @Controller;
    
    declare @type: MachineWorkCentersCollectionThymeleafController: @RequestMapping(value = "/machineworkcenters", name = "MachineWorkCentersCollectionThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MachineWorkCenterService MachineWorkCentersCollectionThymeleafController.machineWorkCenterService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource MachineWorkCentersCollectionThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MachineWorkCentersItemThymeleafController> MachineWorkCentersCollectionThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MachineWorkCentersCollectionThymeleafController> MachineWorkCentersCollectionThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService MachineWorkCentersCollectionThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param machineWorkCenterService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public MachineWorkCentersCollectionThymeleafController.new(MachineWorkCenterService machineWorkCenterService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setMachineWorkCenterService(machineWorkCenterService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(MachineWorkCentersItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(MachineWorkCentersCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MachineWorkCenterService
     */
    public MachineWorkCenterService MachineWorkCentersCollectionThymeleafController.getMachineWorkCenterService() {
        return machineWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param machineWorkCenterService
     */
    public void MachineWorkCentersCollectionThymeleafController.setMachineWorkCenterService(MachineWorkCenterService machineWorkCenterService) {
        this.machineWorkCenterService = machineWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource MachineWorkCentersCollectionThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void MachineWorkCentersCollectionThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MachineWorkCentersItemThymeleafController> MachineWorkCentersCollectionThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void MachineWorkCentersCollectionThymeleafController.setItemLink(MethodLinkBuilderFactory<MachineWorkCentersItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MachineWorkCentersCollectionThymeleafController> MachineWorkCentersCollectionThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void MachineWorkCentersCollectionThymeleafController.setCollectionLink(MethodLinkBuilderFactory<MachineWorkCentersCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService MachineWorkCentersCollectionThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void MachineWorkCentersCollectionThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "list")
    public ModelAndView MachineWorkCentersCollectionThymeleafController.list(Model model) {
        return new ModelAndView("machineworkcenters/list");
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
    public ResponseEntity<ConvertedDatatablesData<MachineWorkCenter>> MachineWorkCentersCollectionThymeleafController.datatables(DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<MachineWorkCenter> machineWorkCenters = getMachineWorkCenterService().findAll(search, pageable);
        long totalMachineWorkCentersCount = machineWorkCenters.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalMachineWorkCentersCount = getMachineWorkCenterService().count();
        }
        ConvertedDatatablesData<MachineWorkCenter> datatablesData = new ConvertedDatatablesData<MachineWorkCenter>(machineWorkCenters, totalMachineWorkCentersCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<MachineWorkCenter>> MachineWorkCentersCollectionThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<MachineWorkCenter> machineWorkCenters = getMachineWorkCenterService().findAllByIdsIn(ids, search, pageable);
        long totalMachineWorkCentersCount = machineWorkCenters.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalMachineWorkCentersCount = getMachineWorkCenterService().count();
        }
        ConvertedDatatablesData<MachineWorkCenter> datatablesData = new ConvertedDatatablesData<MachineWorkCenter>(machineWorkCenters, totalMachineWorkCentersCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<Select2DataSupport<MachineWorkCenter>> MachineWorkCentersCollectionThymeleafController.select2(GlobalSearch search, Pageable pageable, Locale locale) {
        Page<MachineWorkCenter> machineWorkCenters = getMachineWorkCenterService().findAll(search, pageable);
        String idExpression = "#{id}";
        Select2DataSupport<MachineWorkCenter> select2Data = new Select2DataWithConversion<MachineWorkCenter>(machineWorkCenters, idExpression, getConversionService());
        return ResponseEntity.ok(select2Data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("machineWorkCenter")
    public void MachineWorkCentersCollectionThymeleafController.initMachineWorkCenterBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(MachineWorkCenter.class, getMachineWorkCenterService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MachineWorkCentersCollectionThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("capacityStartTime_date_format", DateTimeFormat.patternForStyle("-M", LocaleContextHolder.getLocale()));
        model.addAttribute("capacityEndTime_date_format", DateTimeFormat.patternForStyle("-M", LocaleContextHolder.getLocale()));
        model.addAttribute("validityStartDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("validityEndDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MachineWorkCentersCollectionThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param machineWorkCenter
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView MachineWorkCentersCollectionThymeleafController.create(@Valid @ModelAttribute MachineWorkCenter machineWorkCenter, BindingResult result, Model model) {
        if (result.hasErrors()) {
            populateForm(model);
            
            return new ModelAndView("machineworkcenters/create");
        }
        MachineWorkCenter newMachineWorkCenter = getMachineWorkCenterService().save(machineWorkCenter);
        UriComponents showURI = getItemLink().to(MachineWorkCentersItemThymeleafLinkFactory.SHOW).with("machineWorkCenter", newMachineWorkCenter.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView MachineWorkCentersCollectionThymeleafController.createForm(Model model) {
        populateForm(model);
        
        model.addAttribute("machineWorkCenter", new MachineWorkCenter());
        return new ModelAndView("machineworkcenters/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    @ResponseBody
    public ResponseEntity<?> MachineWorkCentersCollectionThymeleafController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMachineWorkCenterService().delete(ids);
        
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
    public void MachineWorkCentersCollectionThymeleafController.export(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, String[] datatablesColumns, HttpServletResponse response, JasperReportsExporter exporter, String fileName, Locale locale) {
        // Obtain the filtered and ordered elements
        Page<MachineWorkCenter> machineWorkCenters = getMachineWorkCenterService().findAll(search, pageable);
        
        // Prevent generation of reports with empty data
        if (machineWorkCenters == null || machineWorkCenters.getContent().isEmpty()) {
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
        JRDataSource ds = new JRBeanCollectionDataSource(machineWorkCenters.getContent());
        
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
    public ResponseEntity<?> MachineWorkCentersCollectionThymeleafController.exportCsv(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsCsvExporter(), "machineWorkCenters_report.csv", locale);
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
    public ResponseEntity<?> MachineWorkCentersCollectionThymeleafController.exportPdf(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsPdfExporter(), "machineWorkCenters_report.pdf", locale);
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
    public ResponseEntity<?> MachineWorkCentersCollectionThymeleafController.exportXls(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsXlsExporter(), "machineWorkCenters_report.xls", locale);
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
    public void MachineWorkCentersCollectionThymeleafController.addColumnToReportBuilder(String columnName, FastReportBuilder builder, Locale locale, String fileName) {
        try {
        if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_id", null, "Id", locale), "id", Long.class.getName(), 50);
        }
        else if (columnName.equals("code")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_code", null, "Code", locale), "code", String.class.getName(), 100);
        }
        else if (columnName.equals("category")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_category", null, "Category", locale), "category", String.class.getName(), 100);
        }
        else if (columnName.equals("description")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_description", null, "Description", locale), "description", String.class.getName(), 100);
        }
        else if (columnName.equals("controlKey")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_controlkey", null, "Control Key", locale), "controlKey", String.class.getName(), 100);
        }
        else if (columnName.equals("capacityStartTime")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_capacitystarttime", null, "Capacity Start Time", locale), "capacityStartTime", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("capacityEndTime")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_capacityendtime", null, "Capacity End Time", locale), "capacityEndTime", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("capacityUtilization")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_capacityutilization", null, "Capacity Utilization", locale), "capacityUtilization", Integer.class.getName(), 100);
        }
        else if (columnName.equals("numberofCapacities")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_numberofcapacities", null, "Numberof Capacities", locale), "numberofCapacities", Integer.class.getName(), 100);
        }
        else if (columnName.equals("validityStartDate")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_validitystartdate", null, "Validity Start Date", locale), "validityStartDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("validityEndDate")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_validityenddate", null, "Validity End Date", locale), "validityEndDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("version")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_version", null, "Version", locale), "version", Long.class.getName(), 100);
        }
        else if (columnName.equals("createdDate")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_createddate", null, "Created Date", locale), "createdDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("createdBy")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_createdby", null, "Created By", locale), "createdBy", String.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedDate")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_lastmodifieddate", null, "Last Modified Date", locale), "lastModifiedDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedBy")) {
            builder.addColumn(getMessageSource().getMessage("label_machineworkcenter_lastmodifiedby", null, "Last Modified By", locale), "lastModifiedBy", String.class.getName(), 100);
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
