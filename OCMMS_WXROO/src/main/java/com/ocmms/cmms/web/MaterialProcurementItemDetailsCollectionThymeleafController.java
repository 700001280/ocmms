package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.web.reports.CustomReportProcessor;
import com.ocmms.cmms.web.reports.JasperReportsPdfExporter;

import io.springlets.data.domain.GlobalSearch;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * = MaterialProcurementItemDetailsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialProcurementItemDetail.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class MaterialProcurementItemDetailsCollectionThymeleafController {
	
	@Autowired
    private CustomReportProcessor customReportProcessor ;
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
    @GetMapping(name = "exportMaterialProcurementItemDetailPdf", value = "/exportmaterialprocurementitemdetailpdf/pdf")
    @ResponseBody
    public ResponseEntity<?> exportMaterialProcurementItemDetailPdf(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
    	 Map<String, Object> parameters = new HashMap<>();
         parameters.put("title", "Procurement Order BarCode");
    	
    	customReportProcessor.exportPoMaterialDetailTemplate(search,pageable,
    			response, new JasperReportsPdfExporter(), getMaterialProcurementItemDetailService(),
    			parameters, locale);
    	//export(search, pageable, datatablesColumns, response, new JasperReportsPdfExporter(), "equipments_report.pdf", locale);
        return ResponseEntity.ok().build();
    }
}
