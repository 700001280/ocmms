package com.ocmms.cmms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.mail.javamail.JavaMailSender;

import com.ocmms.cmms.jwt.controllers.IOStockResult;
import com.ocmms.cmms.jwt.domain.UserLogin;
import com.ocmms.cmms.jwt.repository.UserLoginRepository;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.repository.EmployeeRepository;
import com.ocmms.cmms.repository.MaterialPlantInfoRepository;
import com.ocmms.cmms.repository.MaterialStorageLocationInfoRepository;
import com.ocmms.cmms.repository.RecordStatusRepository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

	@Autowired
	private UserLoginRepository userLoginRepository;

	@Autowired
	private MaterialPlantInfoRepository materialPlantInfoRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private RecordStatusRepository recordStatusRepository;

	@Autowired
	private MaterialStorageLocationInfoRepository materialStorageLocationInfoRepository;

	@Value("${spring.application.upload.savefilepath}")
	private String fileSavePath;

	public UserLogin getCurrentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		logger.debug("get authentication name: " + name);
		if (name != null) {
			Optional<UserLogin> currentUser = userLoginRepository.findByUsername(name);
			if (!currentUser.isPresent()) {
				logger.debug("get userLogin name: null");
				return null;
			}
			logger.debug("get userLogin name: " + currentUser.toString());
			return currentUser.get();
		} else {
			logger.debug("get userLogin name: null");
			return null;
		}
	}

	public String getUserMail() {
		String username = getCurrentUser().getUsername();
		Employee employee = employeeRepository.findByUsername(username);
		String email = employee.getEmail();
		logger.debug("getUserEmail: {} ", email);
		return email;

	}

	public Employee getCurrentEmployee() {
		String username = getCurrentUser().getUsername();
		return employeeRepository.findByUsername(username);

	}

	public Boolean checkCurrentEmployeeRole(String role) {
		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities();
		boolean hasRole = false;
		for (GrantedAuthority authority : authorities) {
			hasRole = authority.getAuthority().equals(role);
			if (hasRole) {
				break;
			}
		}
		return hasRole;
	}

	public String getFileSavePath() {
		logger.debug("fileSavePath: {} ", fileSavePath);
		return fileSavePath;

	}

	public IOStockResult handleInstock(MaterialInstockDetail materialInstockDetail) {
		return new IOStockResult(addMaterialInstockQuantityToOrganization(materialInstockDetail),addMaterialInstockQuantityToStorageLocation(materialInstockDetail));
		
	}

	public IOStockResult handleOutstock(MaterialOutstockDetail materialOutstockDetail) {
		return new IOStockResult(subMaterialOutstockQuantityToOrganization(materialOutstockDetail),subMaterialOutstockQuantityToStorageLocation(materialOutstockDetail));
		
	}

	public BigDecimal addMaterialInstockQuantityToOrganization(MaterialInstockDetail materialInstockDetail) {
		BigDecimal result = new BigDecimal("-1.00");
		Long count = materialPlantInfoRepository.countByMaterialCatalogAndOrganization(
				materialInstockDetail.getMaterialCatalog(),
				materialInstockDetail.getStorageLocation().getWarehouse().getOrganization());

		MaterialPlantInfo materialPlantInfo;
		if (count > 0) {
			List<MaterialPlantInfo> materialPlantInfoes = materialPlantInfoRepository
					.findByMaterialCatalogAndOrganization(materialInstockDetail.getMaterialCatalog(),
							materialInstockDetail.getStorageLocation().getWarehouse().getOrganization());
			materialPlantInfo = materialPlantInfoes.get(0);
			logger.info("Before material: {} Plant Stock {}", materialPlantInfo.getMaterialCatalog(),
					materialPlantInfo.getStock());
			materialPlantInfo.setStock(materialPlantInfo.getStock().add(materialInstockDetail.getQuantity()));
			MaterialPlantInfo newMaterialPlantInfo = materialPlantInfoRepository.save(materialPlantInfo);
			result=newMaterialPlantInfo.getStock();
			logger.info("After material: {} Plant Stock {}", newMaterialPlantInfo.getMaterialCatalog(), result);

		} else {
			materialPlantInfo = new MaterialPlantInfo();
			materialPlantInfo.setMaterialCatalog(materialInstockDetail.getMaterialCatalog());
			materialPlantInfo
					.setOrganization(materialInstockDetail.getStorageLocation().getWarehouse().getOrganization());
			materialPlantInfo.setStock(materialInstockDetail.getQuantity());
			materialPlantInfo.setSafetyStock(BigDecimal.valueOf(0));
			materialPlantInfo.setReqReorderPoint(BigDecimal.valueOf(0));
			materialPlantInfo.setConsumableInventory(false);
			materialPlantInfo.setCritical(false);
			materialPlantInfo.setUsefulLife(false);
			materialPlantInfo.setShelfLifeDays(0);
			materialPlantInfo.setDeclarationNumber("-");
			materialPlantInfo.setDeclarationName(materialInstockDetail.getMaterialCatalog().getMaterialName());
			materialPlantInfo.setDocumentType("-");
			materialPlantInfo.setVersion(1L);
			materialPlantInfo.setRecordStatus(recordStatusRepository.findById(-7L).get());
			MaterialPlantInfo newMaterialPlantInfo = materialPlantInfoRepository.save(materialPlantInfo);
			result=newMaterialPlantInfo.getStock();
			logger.info("After material: {} Plant Stock {}", newMaterialPlantInfo.getMaterialCatalog(), result);
		}
		return result;
	}

	public BigDecimal subMaterialOutstockQuantityToOrganization(MaterialOutstockDetail materialOutstockDetail) {
		BigDecimal result = new BigDecimal("-1.00");
		Long count = materialPlantInfoRepository.countByMaterialCatalogAndOrganization(
				materialOutstockDetail.getMaterialCatalog(),
				materialOutstockDetail.getStorageLocation().getWarehouse().getOrganization());
		if (count > 0) {
			List<MaterialPlantInfo> materialPlantInfoes = materialPlantInfoRepository
					.findByMaterialCatalogAndOrganization(materialOutstockDetail.getMaterialCatalog(),
							materialOutstockDetail.getStorageLocation().getWarehouse().getOrganization());
			MaterialPlantInfo materialPlantInfo = materialPlantInfoes.get(0);
			logger.info("Before material: {} Plant Stock {}", materialPlantInfo.getMaterialCatalog(),
					materialPlantInfo.getStock());
			if (materialPlantInfo.getStock().compareTo(materialOutstockDetail.getOutstockQuantity()) > -1) {
				materialPlantInfo
						.setStock(materialPlantInfo.getStock().subtract(materialOutstockDetail.getOutstockQuantity()));
				MaterialPlantInfo newMaterialPlantInfo = materialPlantInfoRepository.save(materialPlantInfo);
				result=newMaterialPlantInfo.getStock();
				logger.info("After material: {} Plant Stock {}", newMaterialPlantInfo.getMaterialCatalog(), result);
			}

		}
		return result;

	}

	public BigDecimal addMaterialInstockQuantityToStorageLocation(MaterialInstockDetail materialInstockDetail) {
		BigDecimal result = new BigDecimal("-1.00");
		Long count = materialStorageLocationInfoRepository.countByMaterialCatalogAndStorageLocation(
				materialInstockDetail.getMaterialCatalog(), materialInstockDetail.getStorageLocation());

		MaterialStorageLocationInfo materialStorageLocationInfo;
		if (count > 0) {
			List<MaterialStorageLocationInfo> materialStorageLocationInfoes = materialStorageLocationInfoRepository
					.findByMaterialCatalogAndStorageLocation(materialInstockDetail.getMaterialCatalog(),
							materialInstockDetail.getStorageLocation());
			materialStorageLocationInfo = materialStorageLocationInfoes.get(0);
			logger.info("Before material: {} StorageLocation Stock {}",
					materialStorageLocationInfo.getMaterialCatalog(), materialStorageLocationInfo.getStock());
			materialStorageLocationInfo
					.setStock(materialStorageLocationInfo.getStock().add(materialInstockDetail.getQuantity()));
			MaterialStorageLocationInfo newMaterialStorageLocationInfo=materialStorageLocationInfoRepository.save(materialStorageLocationInfo);
			result=newMaterialStorageLocationInfo.getStock();
			logger.info("After material: {} StorageLocation Stock {}", newMaterialStorageLocationInfo.getMaterialCatalog(), result);
		} else {
			materialStorageLocationInfo = new MaterialStorageLocationInfo();
			materialStorageLocationInfo.setMaterialCatalog(materialInstockDetail.getMaterialCatalog());
			materialStorageLocationInfo.setStorageLocation(materialInstockDetail.getStorageLocation());
			materialStorageLocationInfo.setStock(materialInstockDetail.getQuantity());
			materialStorageLocationInfo.setVersion(1L);
			materialStorageLocationInfo.setRecordStatus(recordStatusRepository.findById(-6L).get());			
			MaterialStorageLocationInfo newMaterialStorageLocationInfo=materialStorageLocationInfoRepository.save(materialStorageLocationInfo);
			result=newMaterialStorageLocationInfo.getStock();
			logger.info("After material: {} StorageLocation Stock {}", newMaterialStorageLocationInfo.getMaterialCatalog(), result);
		}
		return result;
	}

	public BigDecimal subMaterialOutstockQuantityToStorageLocation(MaterialOutstockDetail materialOutstockDetail) {
		BigDecimal result = new BigDecimal("-1.00");
		Long count = materialStorageLocationInfoRepository.countByMaterialCatalogAndStorageLocation(
				materialOutstockDetail.getMaterialCatalog(), materialOutstockDetail.getStorageLocation());
		if (count > 0) {
			List<MaterialStorageLocationInfo> materialStorageLocationInfoes = materialStorageLocationInfoRepository
					.findByMaterialCatalogAndStorageLocation(materialOutstockDetail.getMaterialCatalog(),
							materialOutstockDetail.getStorageLocation());
			MaterialStorageLocationInfo materialStorageLocationInfo = materialStorageLocationInfoes.get(0);			
			result=materialStorageLocationInfo.getStock();
			logger.info("Before material: {} StorageLocation Stock {}", materialStorageLocationInfo.getMaterialCatalog(), result);
			
			if (materialStorageLocationInfo.getStock().compareTo(materialOutstockDetail.getOutstockQuantity()) > -1) {
				materialStorageLocationInfo.setStock(
						materialStorageLocationInfo.getStock().subtract(materialOutstockDetail.getOutstockQuantity()));				
				MaterialStorageLocationInfo newMaterialStorageLocationInfo=materialStorageLocationInfoRepository.save(materialStorageLocationInfo);
				result=newMaterialStorageLocationInfo.getStock();
				logger.info("After material: {} StorageLocation Stock {}", newMaterialStorageLocationInfo.getMaterialCatalog(), result);
			}

		}
		return result;
	}
}
