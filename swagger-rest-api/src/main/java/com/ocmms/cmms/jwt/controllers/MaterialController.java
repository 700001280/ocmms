package com.ocmms.cmms.jwt.controllers;

import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.repository.EmployeeRepository;
import com.ocmms.cmms.repository.MaterialCatalogRepository;
import com.ocmms.cmms.repository.MaterialInstockDetailRepository;
import com.ocmms.cmms.repository.MaterialOutstockDetailRepository;
import com.ocmms.cmms.repository.MaterialProcurementItemDetailRepository;
import com.ocmms.cmms.repository.MaterialStorageLocationInfoRepository;
import com.ocmms.cmms.repository.MovementTypeRepository;
import com.ocmms.cmms.repository.ProcurementOrderRepository;
import com.ocmms.cmms.repository.RecordStatusRepository;
import com.ocmms.cmms.repository.StorageLocationRepository;
import com.ocmms.cmms.repository.StorageTypeRepository;
import com.ocmms.cmms.service.UserInfoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/material")
public class MaterialController {

	private static Logger logger = LoggerFactory.getLogger(MaterialController.class);

	@Autowired
	MaterialCatalogRepository materialCatalogRepository;

	@Autowired
	MaterialStorageLocationInfoRepository materialStorageLocationInfoRepository;

	@Autowired
	StorageLocationRepository storageLocationRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	MaterialProcurementItemDetailRepository materialProcurementItemDetailRepository;
	@Autowired
	ProcurementOrderRepository procurementOrderRepository;
	@Autowired
	MovementTypeRepository movementTypeRepository;
	@Autowired
	RecordStatusRepository recordStatusRepository;
	@Autowired
	StorageTypeRepository storageTypeRepository;

	@Autowired
	UserInfoService userInfoService;

	@Autowired
	MaterialInstockDetailRepository materialInstockDetailRepository;
	@Autowired
	MaterialOutstockDetailRepository materialOutstockDetailRepository;
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = "/message/{key}")
	public ResponseEntity<String> getLocationMaterialInfos(@PathVariable("key") String key) throws Exception {

		return ResponseEntity.ok(messageSource.getMessage(key, null, "label_mail_greeting", Locale.getDefault()));
	}
	
	@RequestMapping(value = "/search/desc")
	public ResponseEntity<?> getMaterialInfoesByDesc(@RequestParam(name = "desc", defaultValue = "") String desc)
			throws Exception {
		List<MaterialCatalog> materialCatalogs = materialCatalogRepository.findByDescription(desc);
		Set<MaterialInfo> materialInfos = new HashSet<MaterialInfo>();
		for (MaterialCatalog mc : materialCatalogs) {
			materialInfos.add(new MaterialInfo(mc));
		}

		return ResponseEntity.ok(materialInfos);
	}

	@RequestMapping(value = "/search/materialnumber")
	public ResponseEntity<?> getMaterialInfoByNumber(
			@RequestParam(name = "materialNumber", defaultValue = "") String materialNumber) throws Exception {
		Optional<MaterialCatalog> materialCatalog = materialCatalogRepository.findByCode(materialNumber);

		if (materialCatalog.isPresent()) {
			return ResponseEntity.ok(new MaterialInfo(materialCatalog.get()));

		} else {
			return ResponseEntity.ok("null");
		}

	}

	@RequestMapping(value = "/search/location/{id}")
	public ResponseEntity<?> getLocationMaterialInfos(@PathVariable("id") Long id) throws Exception {
		Optional<StorageLocation> storageLocation = storageLocationRepository.findById(id);
		if (storageLocation.isPresent()) {

			List<MaterialStorageLocationInfo> materialStorageLocationInfoes = materialStorageLocationInfoRepository
					.findByStorageLocation(storageLocation.get());
			Set<MaterialInfo> materialInfos = new HashSet<MaterialInfo>();
			for (MaterialStorageLocationInfo ms : materialStorageLocationInfoes) {
				materialInfos.add(new MaterialInfo(ms));
			}

			return ResponseEntity.ok(materialInfos);
		} else {
			return ResponseEntity.ok("null");
		}
	}

	@PostMapping(value = "/instock/po")
	public ResponseEntity<?> instockMaterialByPo(@Valid @RequestBody String materialInstockInfo) throws Exception {
		IOStockResult result = new IOStockResult();
		BarCodeInterpreter bi = new BarCodeInterpreter();
		bi.interpreterBarCodeString(materialInstockInfo);
		logger.info("materialInstockInfo", materialInstockInfo);
		logger.info("bi.createBarCodeString()", bi.createBarCodeString());
		Optional<StorageLocation> storageLocation = storageLocationRepository.findById(bi.getStorageLoactionId());

		if (bi.getMaterialProcurementDetailId() != null && storageLocation.isPresent()) {
			Optional<MaterialProcurementItemDetail> materialProcurementItemDetail = materialProcurementItemDetailRepository
					.findById(bi.getMaterialProcurementDetailId());
			if (materialProcurementItemDetail.isPresent()) {

				MaterialProcurementItemDetail newMaterialProcurementItemDetail = materialProcurementItemDetail.get();

				MaterialInstockDetail materialInstockDetail = new MaterialInstockDetail();
				materialInstockDetail.setCreatedBy(bi.getUser());
				materialInstockDetail.setClosed(true);
				materialInstockDetail.setCreatedDate(Calendar.getInstance());
				materialInstockDetail.setLastModifiedDate(Calendar.getInstance());
				materialInstockDetail.setLastModifiedBy(bi.getUser());
				materialInstockDetail.setKeeper(employeeRepository.findByUsername(bi.getUser()));
				materialInstockDetail.setMaterialCatalog(newMaterialProcurementItemDetail.getMaterialCatalog());
				materialInstockDetail.setMaterialProcurementItemDetail(newMaterialProcurementItemDetail);
				// materialInstockDetail.setMemo(materialInstock.getMemo());
				materialInstockDetail.setMovementType(movementTypeRepository.findById(-1L).get());
				materialInstockDetail.setQuantity(bi.getQuantity());
				materialInstockDetail.setReceiveDate(Calendar.getInstance());
				materialInstockDetail.setRecordStatus(recordStatusRepository.findById(-6L).get());
				materialInstockDetail.setReceiver(employeeRepository.findByUsername(bi.getUser()));
				materialInstockDetail.setSerialNumber(bi.getProcurementOrder() + "-" + bi.getMaterialCatalogCode());
				materialInstockDetail.setStorageLocation(storageLocation.get());
				materialInstockDetail.setStorageType(storageTypeRepository.findById(bi.getStorageTypeId()).get());
				MaterialInstockDetail newMaterialInstockDetail = materialInstockDetailRepository
						.save(materialInstockDetail);
				result = userInfoService.handleInstock(newMaterialInstockDetail);

			}
		}
		return ResponseEntity.ok(result);
	}

	@PostMapping(value = "/outstock/workorder")
	public ResponseEntity<?> outstockMaterialByWorkOrder(@Valid @RequestBody String materialOutstockInfo)
			throws Exception {
		IOStockResult result = new IOStockResult();
		BarCodeInterpreter bi = new BarCodeInterpreter();
		bi.interpreterBarCodeString(materialOutstockInfo);
		logger.info("materialOutstockInfo", materialOutstockInfo);
		logger.info("bi.createBarCodeString()", bi.createBarCodeString());
		Optional<StorageLocation> storageLocation = storageLocationRepository.findById(bi.getStorageLoactionId());
		Optional<MaterialCatalog> materialCatalog = materialCatalogRepository.findById(bi.getMaterialCatalogId());

		if (materialCatalog.isPresent() && storageLocation.isPresent()) {
			MaterialOutstockDetail materialOutstockDetail = new MaterialOutstockDetail();
			materialOutstockDetail.setCreatedBy(bi.getUser());
			materialOutstockDetail.setCreatedDate(Calendar.getInstance());
			materialOutstockDetail.setLastModifiedDate(Calendar.getInstance());
			materialOutstockDetail.setLastModifiedBy(bi.getUser());
			materialOutstockDetail.setKeeper(employeeRepository.findByUsername(bi.getUser()));
			materialOutstockDetail.setMaterialCatalog(materialCatalog.get());
			materialOutstockDetail.setMovementType(movementTypeRepository.findById(-1L).get());
			materialOutstockDetail.setOutstockQuantity(bi.getQuantity());
			materialOutstockDetail.setIssueDate(Calendar.getInstance());
			materialOutstockDetail.setRecordStatus(recordStatusRepository.findById(-6L).get());
			materialOutstockDetail.setReceiver(employeeRepository.findByUsername(bi.getUser()));
			materialOutstockDetail.setMaterialCatalog(materialCatalog.get());
			materialOutstockDetail.setMemo("");
			materialOutstockDetail.setOrderNo("");
			materialOutstockDetail.setOrganization(employeeRepository.findByUsername(bi.getUser()).getOrganization());
			materialOutstockDetail.setSerialNumber("");
			materialOutstockDetail.setStorageLocation(storageLocation.get());
			materialOutstockDetail.setStorageType(storageTypeRepository.findById(bi.getStorageTypeId()).get());
			MaterialOutstockDetail newMaterialOutstockDetail =materialOutstockDetailRepository.save(materialOutstockDetail);
			result = userInfoService.handleOutstock(newMaterialOutstockDetail);
		}
		return ResponseEntity.ok(result);
	}
}
