package com.ocmms.cmms.jwt.controllers;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import lombok.Data;

@Data
public class MaterialInfo {

	private Long id;

	private String code;

	private String materialName;

	private String longDescription;

	private String image;

	private Set<StorageInfo> storageInfoes = new HashSet<StorageInfo>();

	public MaterialInfo(MaterialCatalog materialCatalog) {
		this.setId(materialCatalog.getId());
		this.setCode(materialCatalog.getCode());
		this.setMaterialName(materialCatalog.getMaterialName());
		this.setLongDescription(materialCatalog.getLongDescription());
		this.setImage(materialCatalog.getImage());

		Set<MaterialStorageLocationInfo> materialStorageLocationInfos = materialCatalog
				.getMaterialStorageLocationInfos();
		for (MaterialStorageLocationInfo ms : materialStorageLocationInfos) {
			StorageInfo storageInfo = new StorageInfo(ms.toString(), ms.getStorageLocation().getId(), ms.getStock());
			this.getStorageInfoes().add(storageInfo);
		}
	}

	public MaterialInfo(MaterialStorageLocationInfo materialStorageLocationInfo) {
		this.setId(materialStorageLocationInfo.getMaterialCatalog().getId());
		this.setCode(materialStorageLocationInfo.getMaterialCatalog().getCode());
		this.setMaterialName(materialStorageLocationInfo.getMaterialCatalog().getMaterialName());
		this.setLongDescription(materialStorageLocationInfo.getMaterialCatalog().getLongDescription());
		this.setImage(materialStorageLocationInfo.getMaterialCatalog().getImage());
		this.getStorageInfoes().add(new StorageInfo(materialStorageLocationInfo.toString(),
				materialStorageLocationInfo.getStorageLocation().getId(), materialStorageLocationInfo.getStock()));
	}

	class StorageInfo {
		Long locationId;
		String location;
		BigDecimal stock;

		public StorageInfo(String location, Long locationId, BigDecimal stock) {
			this.location = location;
			this.locationId = locationId;
			this.stock = stock;

		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public BigDecimal getStock() {
			return stock;
		}

		public void setStock(BigDecimal stock) {
			this.stock = stock;
		}

		public Long getLocationId() {
			return locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

	}
}
