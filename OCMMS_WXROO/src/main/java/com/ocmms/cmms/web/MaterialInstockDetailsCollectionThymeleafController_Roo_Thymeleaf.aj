// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;

import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.service.api.MaterialInstockDetailService;
import com.ocmms.cmms.service.api.UserInfoService;
import com.ocmms.cmms.web.MaterialInstockDetailsCollectionThymeleafController;
import com.ocmms.cmms.web.MaterialInstockDetailsItemThymeleafController;
import com.ocmms.cmms.web.MaterialInstockDetailsItemThymeleafLinkFactory;
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
import org.springframework.data.domain.PageRequest;
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

privileged aspect MaterialInstockDetailsCollectionThymeleafController_Roo_Thymeleaf {
    
    declare @type: MaterialInstockDetailsCollectionThymeleafController: @Controller;
    
    declare @type: MaterialInstockDetailsCollectionThymeleafController: @RequestMapping(value = "/materialinstockdetails", name = "MaterialInstockDetailsCollectionThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialInstockDetailService MaterialInstockDetailsCollectionThymeleafController.materialInstockDetailService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource MaterialInstockDetailsCollectionThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MaterialInstockDetailsItemThymeleafController> MaterialInstockDetailsCollectionThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MaterialInstockDetailsCollectionThymeleafController> MaterialInstockDetailsCollectionThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService MaterialInstockDetailsCollectionThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private UserInfoService MaterialInstockDetailsCollectionThymeleafController.userInfoService;
   
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialInstockDetailService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public MaterialInstockDetailsCollectionThymeleafController.new(UserInfoService userInfoService,MaterialInstockDetailService materialInstockDetailService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
    	setUserInfoService(userInfoService);
    	setMaterialInstockDetailService(materialInstockDetailService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(MaterialInstockDetailsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(MaterialInstockDetailsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProcurementRequestService
     */
    public UserInfoService MaterialInstockDetailsCollectionThymeleafController.getUserInfoService() {
        return userInfoService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementRequestService
     */
    public void MaterialInstockDetailsCollectionThymeleafController.setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialInstockDetailService
     */
    public MaterialInstockDetailService MaterialInstockDetailsCollectionThymeleafController.getMaterialInstockDetailService() {
        return materialInstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetailService
     */
    public void MaterialInstockDetailsCollectionThymeleafController.setMaterialInstockDetailService(MaterialInstockDetailService materialInstockDetailService) {
        this.materialInstockDetailService = materialInstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource MaterialInstockDetailsCollectionThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void MaterialInstockDetailsCollectionThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MaterialInstockDetailsItemThymeleafController> MaterialInstockDetailsCollectionThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void MaterialInstockDetailsCollectionThymeleafController.setItemLink(MethodLinkBuilderFactory<MaterialInstockDetailsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MaterialInstockDetailsCollectionThymeleafController> MaterialInstockDetailsCollectionThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void MaterialInstockDetailsCollectionThymeleafController.setCollectionLink(MethodLinkBuilderFactory<MaterialInstockDetailsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService MaterialInstockDetailsCollectionThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void MaterialInstockDetailsCollectionThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "list")
    public ModelAndView MaterialInstockDetailsCollectionThymeleafController.list(Model model) {
        return new ModelAndView("materialinstockdetails/list");
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
    public ResponseEntity<ConvertedDatatablesData<MaterialInstockDetail>> MaterialInstockDetailsCollectionThymeleafController.datatables(DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<MaterialInstockDetail> materialInstockDetails = getMaterialInstockDetailService().findAll(search, pageable);
        long totalMaterialInstockDetailsCount = materialInstockDetails.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalMaterialInstockDetailsCount = getMaterialInstockDetailService().count();
        }
        ConvertedDatatablesData<MaterialInstockDetail> datatablesData = new ConvertedDatatablesData<MaterialInstockDetail>(materialInstockDetails, totalMaterialInstockDetailsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<MaterialInstockDetail>> MaterialInstockDetailsCollectionThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<MaterialInstockDetail> materialInstockDetails = getMaterialInstockDetailService().findAllByIdsIn(ids, search, pageable);
        long totalMaterialInstockDetailsCount = materialInstockDetails.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalMaterialInstockDetailsCount = getMaterialInstockDetailService().count();
        }
        ConvertedDatatablesData<MaterialInstockDetail> datatablesData = new ConvertedDatatablesData<MaterialInstockDetail>(materialInstockDetails, totalMaterialInstockDetailsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<Select2DataSupport<MaterialInstockDetail>> MaterialInstockDetailsCollectionThymeleafController.select2(GlobalSearch search, Pageable pageable, Locale locale) {
        Page<MaterialInstockDetail> materialInstockDetails = getMaterialInstockDetailService().findAll(search, pageable);
        String idExpression = "#{id}";
        Select2DataSupport<MaterialInstockDetail> select2Data = new Select2DataWithConversion<MaterialInstockDetail>(materialInstockDetails, idExpression, getConversionService());
        return ResponseEntity.ok(select2Data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("materialInstockDetail")
    public void MaterialInstockDetailsCollectionThymeleafController.initMaterialInstockDetailBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(MaterialInstockDetail.class, getMaterialInstockDetailService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MaterialInstockDetailsCollectionThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("receiveDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("expirationDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MaterialInstockDetailsCollectionThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetail
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView MaterialInstockDetailsCollectionThymeleafController.create(@Valid @ModelAttribute MaterialInstockDetail materialInstockDetail, BindingResult result, Model model) {
        if (result.hasErrors()) {
            populateForm(model);
            
            return new ModelAndView("materialinstockdetails/create");
        }
        
        materialInstockDetail.setMaterialCatalog(materialInstockDetail.getMaterialProcurementItemDetail().getMaterialCatalog());
        materialInstockDetail.setReceiver(getUserInfoService().getCurrentEmployee());
        materialInstockDetail.setReceiveDate(Calendar.getInstance());
        
        if(materialInstockDetail.getMaterialProcurementItemDetail().getMaterialCatalog().getInstockType()!=null&&materialInstockDetail.getMaterialProcurementItemDetail().getMaterialCatalog().getInstockType().getType()=="EACH") {
        	materialInstockDetail.setSerialNumber(materialInstockDetail.getMaterialProcurementItemDetail().getProcurementOrder().getOrderNumber()+"-"+materialInstockDetail.getMaterialProcurementItemDetail().getMaterialCatalog().getCode()+"-"+materialInstockDetail.getQuantity());
            
        }else {     	
        	
        	materialInstockDetail.setSerialNumber(materialInstockDetail.getMaterialProcurementItemDetail().getProcurementOrder().getOrderNumber()+"-"+materialInstockDetail.getMaterialProcurementItemDetail().getMaterialCatalog().getCode());

        }
        MaterialInstockDetail newMaterialInstockDetail = getMaterialInstockDetailService().save(materialInstockDetail);
        
        
        if(getUserInfoService().handleInstock(newMaterialInstockDetail)){
        	UriComponents showURI = getItemLink().to(MaterialInstockDetailsItemThymeleafLinkFactory.SHOW).with("materialInstockDetail", newMaterialInstockDetail.getId()).toUri();
            return new ModelAndView("redirect:" + showURI.toUriString());
        }else{
        	populateForm(model);
            
            model.addAttribute("materialInstockDetail", materialInstockDetail);
            return new ModelAndView("materialinstockdetails/create");
        }
        
        
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView MaterialInstockDetailsCollectionThymeleafController.createForm(Model model) {
        populateForm(model);
        
        model.addAttribute("materialInstockDetail", new MaterialInstockDetail());
        return new ModelAndView("materialinstockdetails/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    @ResponseBody
    public ResponseEntity<?> MaterialInstockDetailsCollectionThymeleafController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMaterialInstockDetailService().delete(ids);
        
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
    public void MaterialInstockDetailsCollectionThymeleafController.export(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, String[] datatablesColumns, HttpServletResponse response, JasperReportsExporter exporter, String fileName, Locale locale) {
        // Obtain the filtered and ordered elements
        Page<MaterialInstockDetail> materialInstockDetails = getMaterialInstockDetailService().findAll(search, pageable);
        
        // Prevent generation of reports with empty data
        if (materialInstockDetails == null || materialInstockDetails.getContent().isEmpty()) {
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
        JRDataSource ds = new JRBeanCollectionDataSource(materialInstockDetails.getContent());
        
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
    public ResponseEntity<?> MaterialInstockDetailsCollectionThymeleafController.exportCsv(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsCsvExporter(), "materialInstockDetails_report.csv", locale);
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
    public ResponseEntity<?> MaterialInstockDetailsCollectionThymeleafController.exportPdf(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsPdfExporter(), "materialInstockDetails_report.pdf", locale);
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
    public ResponseEntity<?> MaterialInstockDetailsCollectionThymeleafController.exportXls(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsXlsExporter(), "materialInstockDetails_report.xls", locale);
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
    public void MaterialInstockDetailsCollectionThymeleafController.addColumnToReportBuilder(String columnName, FastReportBuilder builder, Locale locale, String fileName) {
        try {
        if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_id", null, "Id", locale), "id", Long.class.getName(), 50);
        }
        else if (columnName.equals("quantity")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_quantity", null, "Quantity", locale), "quantity", BigDecimal.class.getName(), 100);
        }
        else if (columnName.equals("goodReceiveNo")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_goodreceiveno", null, "Good Receive No", locale), "goodReceiveNo", String.class.getName(), 100);
        }
        else if (columnName.equals("receiveDate")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_receivedate", null, "Receive Date", locale), "receiveDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("expirationDate")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_expirationdate", null, "Expiration Date", locale), "expirationDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("serialNumber")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_serialnumber", null, "Serial Number", locale), "serialNumber", String.class.getName(), 100);
        }
        else if (columnName.equals("memo")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_memo", null, "Memo", locale), "memo", String.class.getName(), 100);
        }
        else if (columnName.equals("closed")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_closed", null, "Closed", locale), "closed", Boolean.class.getName(), 100);
        }
        else if (columnName.equals("version")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_version", null, "Version", locale), "version", Long.class.getName(), 100);
        }
        else if (columnName.equals("createdDate")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_createddate", null, "Created Date", locale), "createdDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("createdBy")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_createdby", null, "Created By", locale), "createdBy", String.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedDate")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_lastmodifieddate", null, "Last Modified Date", locale), "lastModifiedDate", Calendar.class.getName(), 100);
        }
        else if (columnName.equals("lastModifiedBy")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_lastmodifiedby", null, "Last Modified By", locale), "lastModifiedBy", String.class.getName(), 100);
        }
        else if (columnName.equals("id")) {
            builder.addColumn(getMessageSource().getMessage("label_materialinstockdetail_id", null, "Id", locale), "id", Long.class.getName(), 50);
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
