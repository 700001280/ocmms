package com.ocmms.cmms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.PageRequest;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.repository.EmployeeRepository;
import com.ocmms.cmms.repository.MaterialPlantInfoRepository;
import com.ocmms.cmms.service.api.EmployeeService;
import com.ocmms.cmms.service.api.MaterialPlantInfoService;
import com.ocmms.cmms.service.api.MaterialStorageLocationInfoService;
import com.ocmms.cmms.service.api.RecordStatusService;
import com.ocmms.cmms.service.api.UserInfoService;

import io.springlets.security.jpa.domain.UserLogin;
import io.springlets.security.jpa.repository.UserLoginRepository;
import io.springlets.security.jpa.service.api.UserLoginService;

import java.math.BigDecimal;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private UserLoginService userLoginService;

	@Autowired
	private MaterialPlantInfoService materialPlantInfoService;

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private RecordStatusService recordStatusService;
	
	@Autowired
	private MaterialStorageLocationInfoService materialStorageLocationInfoService;
	

	@Value("${spring.application.upload.savefilepath}")
	private String fileSavePath;

	public UserLogin getCurrentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		logger.debug("get authentication name: " + name);
		if (name != null) {
			UserLogin currentUser = userLoginService.findByUsername(name);
			logger.debug("get userLogin name: " + currentUser.toString());
			return currentUser;
		} else {
			logger.debug("get userLogin name: null");
			return null;
		}
	}

	public String getUserMail() {
		String username = getCurrentUser().getUsername();
		Employee employee = employeeService.findOneByUsername(username);
		String email = employee.getEmail();
		logger.debug("getUserEmail: {} ", email);
		return email;

	}

	public Employee getCurrentEmployee() {
		String username = getCurrentUser().getUsername();
		return employeeService.findOneByUsername(username);

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

	public Boolean handleInstock(MaterialInstockDetail materialInstockDetail) {
		return addMaterialInstockQuantityToOrganization(materialInstockDetail)&&addMaterialInstockQuantityToStorageLocation( materialInstockDetail);
	}
	
	public Boolean handleOutstock(MaterialOutstockDetail materialOutstockDetail) {
		return subMaterialOutstockQuantityToOrganization(materialOutstockDetail)&&subMaterialOutstockQuantityToStorageLocation( materialOutstockDetail);
	}
	
	public Boolean addMaterialInstockQuantityToOrganization(MaterialInstockDetail materialInstockDetail) {
		Long count=materialPlantInfoService.countByMaterialCatalogAndOrganization(materialInstockDetail.getMaterialCatalog(), getCurrentEmployee().getOrganization());
		logger.debug("count {}",count);
		MaterialPlantInfo materialPlantInfo;
		if(count>0) {
			Page<MaterialPlantInfo> materialPlantInfoes=materialPlantInfoService.findByMaterialCatalogAndOrganization(materialInstockDetail.getMaterialCatalog(), materialInstockDetail.getReceiver().getOrganization(),new PageRequest(0, 10));
			materialPlantInfo=materialPlantInfoes.getContent().get(0);
			materialPlantInfo.setStock(materialPlantInfo.getStock().add(materialInstockDetail.getQuantity()));
			materialPlantInfoService.save(materialPlantInfo);
			logger.debug("count >0");	
		}else {
			materialPlantInfo=new MaterialPlantInfo();
			materialPlantInfo.setMaterialCatalog(materialInstockDetail.getMaterialCatalog());
			materialPlantInfo.setOrganization(materialInstockDetail.getReceiver().getOrganization());
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
			materialPlantInfo.setRecordStatus(recordStatusService.findOne(-7L));
			MaterialPlantInfo newMaterialPlantInfo=materialPlantInfoService.save(materialPlantInfo);					
			logger.debug("count <0");
		}
		return true;		
	}

	public Boolean subMaterialOutstockQuantityToOrganization(MaterialOutstockDetail materialOutstockDetail) {
		Long count=materialPlantInfoService.countByMaterialCatalogAndOrganization(materialOutstockDetail.getMaterialCatalog(), getCurrentEmployee().getOrganization());
		if(count>0) {
			Page<MaterialPlantInfo> materialPlantInfoes=materialPlantInfoService.findByMaterialCatalogAndOrganization(materialOutstockDetail.getMaterialCatalog(),  materialOutstockDetail.getReceiver().getOrganization(),new PageRequest(0, 10));
			MaterialPlantInfo materialPlantInfo=materialPlantInfoes.getContent().get(0);
			if(materialPlantInfo.getStock().compareTo(materialOutstockDetail.getOutstockQuantity())>-1) {
				materialPlantInfo.setStock(materialPlantInfo.getStock().subtract(materialOutstockDetail.getOutstockQuantity()));
				materialPlantInfoService.save(materialPlantInfo);
				return true;	
			}else {
				return false;
			}		
				
		}else {
			return false;
		}		
	}
	
	
	
	public Boolean addMaterialInstockQuantityToStorageLocation(MaterialInstockDetail materialInstockDetail) {
		Long count=materialStorageLocationInfoService.countByMaterialCatalogAndStorageLocation(materialInstockDetail.getMaterialCatalog(), materialInstockDetail.getStorageLocation());
		logger.debug("count {}",count);
		MaterialStorageLocationInfo materialStorageLocationInfo;
		if(count>0) {
			Page<MaterialStorageLocationInfo> materialStorageLocationInfoes=materialStorageLocationInfoService.findByMaterialCatalogAndStorageLocation(materialInstockDetail.getMaterialCatalog(), materialInstockDetail.getStorageLocation(),new PageRequest(0, 10));
			materialStorageLocationInfo=materialStorageLocationInfoes.getContent().get(0);
			materialStorageLocationInfo.setStock(materialStorageLocationInfo.getStock().add(materialInstockDetail.getQuantity()));
			materialStorageLocationInfoService.save(materialStorageLocationInfo);
			logger.debug("count >0");	
		}else {
			materialStorageLocationInfo=new MaterialStorageLocationInfo();
			materialStorageLocationInfo.setMaterialCatalog(materialInstockDetail.getMaterialCatalog());
			materialStorageLocationInfo.setStorageLocation(materialInstockDetail.getStorageLocation());
			materialStorageLocationInfo.setStock(materialInstockDetail.getQuantity());			
			materialStorageLocationInfo.setVersion(1L);
			materialStorageLocationInfo.setRecordStatus(recordStatusService.findOne(-6L));
			materialStorageLocationInfoService.save(materialStorageLocationInfo);				
			logger.debug("count <0");
		}
		return true;		
	}

	public Boolean subMaterialOutstockQuantityToStorageLocation(MaterialOutstockDetail materialOutstockDetail) {
		Long count=materialStorageLocationInfoService.countByMaterialCatalogAndStorageLocation(materialOutstockDetail.getMaterialCatalog(), materialOutstockDetail.getStorageLocation());
		if(count>0) {
			Page<MaterialStorageLocationInfo> materialStorageLocationInfoes=materialStorageLocationInfoService.findByMaterialCatalogAndStorageLocation(materialOutstockDetail.getMaterialCatalog(),  materialOutstockDetail.getStorageLocation(),new PageRequest(0, 10));
			MaterialStorageLocationInfo materialStorageLocationInfo=materialStorageLocationInfoes.getContent().get(0);
			if(materialStorageLocationInfo.getStock().compareTo(materialOutstockDetail.getOutstockQuantity())>-1) {
				materialStorageLocationInfo.setStock(materialStorageLocationInfo.getStock().subtract(materialOutstockDetail.getOutstockQuantity()));
				materialStorageLocationInfoService.save(materialStorageLocationInfo);
				return true;	
			}else {
				return false;
			}		
				
		}else {
			return false;
		}		
	}
}
