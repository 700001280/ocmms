package com.ocmms.cmms.web.reports;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocmms.cmms.InitApplication;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.service.api.EquipmentService;
import com.ocmms.cmms.service.api.LotoInfoService;
import com.ocmms.cmms.service.api.MaterialProcurementItemDetailService;
import com.ocmms.cmms.service.api.ProcurementOrderService;
import com.ocmms.cmms.service.api.PartMaintenanceRecordService;
import com.ocmms.cmms.service.api.StorageLocationService;

import io.springlets.data.domain.GlobalSearch;
import net.sf.jasperreports.crosstabs.JRCrosstab;
import net.sf.jasperreports.engine.JRBreak;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRComponentElement;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRElementGroup;
import net.sf.jasperreports.engine.JREllipse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRFrame;
import net.sf.jasperreports.engine.JRGenericElement;
import net.sf.jasperreports.engine.JRImage;
import net.sf.jasperreports.engine.JRLine;
import net.sf.jasperreports.engine.JRRectangle;
import net.sf.jasperreports.engine.JRStaticText;
import net.sf.jasperreports.engine.JRSubreport;
import net.sf.jasperreports.engine.JRTextField;
import net.sf.jasperreports.engine.JRVisitor;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRElementsVisitor;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

@Component
public class CustomReportProcessor {

	private static Logger logger = LoggerFactory.getLogger(CustomReportProcessor.class);

	@Value("${ocmms.report.template.path}")
	private String templatePath;

	@Value("${ocmms.report.template.equipment}")
	private String equipmentTemplate;
	
	@Value("${ocmms.report.template.pomaterialdetail}")
	private String poMaterialDetailTemplate;		

			
	@Value("${ocmms.report.template.podetail}")
	private String poDetailTemplate;

	@Value("${ocmms.report.template.storageLogcation}")
	private String storagelocationTemplate;

	@Value("${ocmms.report.template.equipmaintenance}")
	private String equipMaintenanceTemplate;

	@Value("${ocmms.report.template.partmaintenance}")
	private String partMaintenanceTemplate;
	
	@Value("${ocmms.report.template.lotoreport}")
	private String lotoReportTemplate;
	
	@Value("${ocmms.report.template.lotodetail}")
	private String lotoDetailReportTemplate;

	public JasperReport getJasperReport(String templateName) {
		JasperReport jasperReport = null;
		InputStream jrxmlInput = null;
		try {
			logger.info("jrxml file path is {}", templatePath);
			logger.info("jrxml file name is {}", templateName);
			File reportFile = new File(templatePath.concat(templateName));
			if (reportFile.exists()) {
				jrxmlInput = new FileInputStream(reportFile);
				logger.info("Use User Defined Report: {}", reportFile.getName());
			} else {
				jrxmlInput = this.getClass().getClassLoader().getResource("templates/reports/" + templateName)
						.openStream();
				logger.info("Use System Defined Report {}", templateName);
			}
			JasperDesign design = JRXmlLoader.load(jrxmlInput);
			jasperReport = JasperCompileManager.compileReport(design);			

		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (JRException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return jasperReport;
	}

	public String getExportFileName(String templateName) {
		logger.info("original file is {}", templateName);
		String newFileName = templateName.substring(0, templateName.length() - 5).concat("pdf");
		logger.info("new file is {}", newFileName);
		return newFileName;

	}

	public void exportEquipmentTemplate(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable,
			HttpServletResponse response, JasperReportsExporter exporter, EquipmentService equipmentService,
			Map<String, Object> parameters, Locale locale) {
		Page<Equipment> equipments = equipmentService.findAll(search, pageable);
		if (equipments == null || equipments.getContent().isEmpty()) {
			return;
		}
		try {
			JasperReport jasperReport = getJasperReport(equipmentTemplate);
			JRDataSource ds = new JRBeanCollectionDataSource(equipments.getContent());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, ds);
			exporter.export(jasperPrint, getExportFileName(equipmentTemplate), response);
		} catch (JRException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} 
	}

	public void exportPoDetailTemplate(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable,
			HttpServletResponse response, JasperReportsExporter exporter,
			ProcurementOrderService procurementOrderService, Map<String, Object> parameters,
			Locale locale) {
		Page<ProcurementOrder> procurementOrders =procurementOrderService.findAll(search, pageable);
		if (procurementOrders == null || procurementOrders.getContent().isEmpty()) {
			return;
		}
		try {
			JasperReport jasperReport = getJasperReport(poDetailTemplate);
			JRDataSource ds = new JRBeanCollectionDataSource(procurementOrders.getContent());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, ds);
			exporter.export(jasperPrint, getExportFileName(poDetailTemplate), response);
		} catch (JRException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} 
	}
	
	
	public void exportPoMaterialDetailTemplate(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable,
			HttpServletResponse response, JasperReportsExporter exporter,
			MaterialProcurementItemDetailService materialProcurementItemDetailService, Map<String, Object> parameters,
			Locale locale) {
		Page<MaterialProcurementItemDetail> materialProcurementItemDetails =materialProcurementItemDetailService.findAll(search, pageable);
		if (materialProcurementItemDetails == null || materialProcurementItemDetails.getContent().isEmpty()) {
			return;
		}
		try {
			JasperReport jasperReport = getJasperReport(poMaterialDetailTemplate);
			JRDataSource ds = new JRBeanCollectionDataSource(materialProcurementItemDetails.getContent());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, ds);
			exporter.export(jasperPrint, getExportFileName(poMaterialDetailTemplate), response);
		} catch (JRException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} 
	}

	public void exportStorageLocationTemplate(GlobalSearch search,
			@PageableDefault(size = 2147483647) Pageable pageable, HttpServletResponse response,
			JasperReportsExporter exporter, StorageLocationService storageLocationService,
			Map<String, Object> parameters, Locale locale) {
		Page<StorageLocation> storageLocations = storageLocationService.findAll(search, pageable);
		if (storageLocations == null || storageLocations.getContent().isEmpty()) {
			return;
		}
		try {
			JasperReport jasperReport = getJasperReport(storagelocationTemplate);
			JRDataSource ds = new JRBeanCollectionDataSource(storageLocations.getContent());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, ds);
			exporter.export(jasperPrint, getExportFileName(storagelocationTemplate), response);
		} catch (JRException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} 
	}

	public void exportPartMaintenanceTemplate(GlobalSearch search,
			@PageableDefault(size = 2147483647) Pageable pageable, HttpServletResponse response,
			JasperReportsExporter exporter, PartMaintenanceRecordService partMaintenanceRecordService,
			Map<String, Object> parameters, Locale locale) {
		Page<PartMaintenanceRecord> partMaintenanceRecords = partMaintenanceRecordService.findAll(search, pageable);
		if (partMaintenanceRecords == null || partMaintenanceRecords.getContent().isEmpty()) {
			return;
		}
		try {
			JasperReport jasperReport = getJasperReport(partMaintenanceTemplate);
			JRDataSource ds = new JRBeanCollectionDataSource(partMaintenanceRecords.getContent());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, ds);
			exporter.export(jasperPrint, getExportFileName(partMaintenanceTemplate), response);
		} catch (JRException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} 
	}
	
	
	public void exportLotoTemplate(GlobalSearch search,
			@PageableDefault(size = 2147483647) Pageable pageable, HttpServletResponse response,
			JasperReportsExporter exporter, LotoInfoService lotoInfoService,
			Map<String, Object> parameters, Locale locale) {
		Page<LotoInfo> lotoInfos = lotoInfoService.findAll(search, pageable);
		if (lotoInfos == null || lotoInfos.getContent().isEmpty()) {
			return;
		}
		try {
			JasperReport jasperReport = getJasperReport(lotoReportTemplate);
			JRDataSource ds = new JRBeanCollectionDataSource(lotoInfos.getContent());
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, ds);
			exporter.export(jasperPrint, getExportFileName(lotoReportTemplate), response);
		} catch (JRException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} 
	}

	public  JasperReport getLotoDetailReport() {
		return  getJasperReport( lotoDetailReportTemplate);
	}  
   	
}
