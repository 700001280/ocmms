package com.ocmms.cmms.jwt.controllers;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import lombok.Data;

@Data
public class BarCodeInterpreter {

	private static final String procurementOrderNumberIdTag = "POID";
	private static final String procurementOrderTag = "PODS";
	private static final String materialCatalogIdTag = "MTID";
	private static final String materialCatalogCodeTag = "MTCD";
	private static final String storageLoactionIdTag = "LCID";
	private static final String storageLoactionDescTag = "LCDS";
	private static final String warehouseIdTag = "WHID";
	private static final String warehouseDescTag = "WHDS";
	private static final String assetIdTag = "ASID";
	private static final String assetCodeTag = "ASCD";
	private static final String equipmentIdTag = "EQID";
	private static final String equipmentCodeTag = "EQCD";
	private static final String partMaintenanceIdTag = "PMID";
	private static final String partMaintenanceDescTag = "PMDS";
	private static final String workorderIdTag = "WOID";
	private static final String workorderCodeTag = "WOCD";
	private static final String materialProcurementDetailIdTag = "MPID";
	private static final String quantityTag = "QTY";
	private static final String storageTypeIdTag = "STID";
	private static final String userTag = "USER";
	private static final String formIdTag = "FORMID";
	private static final String objectClassTag = "OBJECTCLASS";
	private static final String actionTag = "ACTIONTAG";

	private String barCodeString = null;
	private Long procurementOrderNumberId = null;
	private String procurementOrder = null;
	private Long materialCatalogId = null;
	private String materialCatalogCode = null;
	private Long storageLoactionId = null;
	private String storageLoactionDesc = null;
	private Long warehouseId = null;
	private String warehouseDesc = null;
	private Long assetId = null;
	private String assetCode = null;
	private Long equipmentId = null;
	private String equipmentCode = null;
	private Long partMaintenanceId = null;
	private String partMaintenanceDesc = null;
	private Long workorderId = null;
	private String workorderCode = null;
	private Long storageTypeId = null;
	private String user = null;
	private Long materialProcurementDetailId = null;
	private BigDecimal quantity = null;
	private String formId = null;
	private String objectClass = null;
	private String action = null;

	public String createBarCodeString() {
		Map<String, Object> jsonHashMap = new HashMap<String, Object>();

		if (materialProcurementDetailId != null) {
			jsonHashMap.put(materialProcurementDetailIdTag, materialProcurementDetailId);
		}

		if (procurementOrderNumberId != null) {
			jsonHashMap.put(procurementOrderNumberIdTag, procurementOrderNumberId);
		}

		if (procurementOrder != null && procurementOrder != "") {
			jsonHashMap.put(procurementOrderTag, procurementOrder);
		}

		if (materialCatalogId != null) {
			jsonHashMap.put(materialCatalogIdTag, materialCatalogId);
		}

		if (materialCatalogCode != null && materialCatalogCode != "") {
			jsonHashMap.put(materialCatalogCodeTag, materialCatalogCode);
		}

		if (storageLoactionId != null) {
			jsonHashMap.put(storageLoactionIdTag, storageLoactionId);
		}

		if (storageLoactionDesc != null && storageLoactionDesc != "") {
			jsonHashMap.put(storageLoactionDescTag, storageLoactionDesc);
		}

		if (warehouseId != null) {
			jsonHashMap.put(warehouseIdTag, warehouseId);
		}

		if (warehouseDesc != null && warehouseDesc != "") {
			jsonHashMap.put(warehouseDescTag, warehouseDesc);
		}

		if (assetId != null) {
			jsonHashMap.put(assetIdTag, assetId);
		}

		if (assetCode != null && assetCode != "") {
			jsonHashMap.put(assetCodeTag, assetCode);
		}

		if (equipmentId != null) {
			jsonHashMap.put(equipmentIdTag, equipmentId);
		}

		if (equipmentCode != null && equipmentCode != "") {
			jsonHashMap.put(equipmentCodeTag, equipmentCode);
		}

		if (partMaintenanceId != null) {
			jsonHashMap.put(partMaintenanceIdTag, partMaintenanceId);
		}

		if (partMaintenanceDesc != null && partMaintenanceDesc != "") {
			jsonHashMap.put(partMaintenanceDescTag, partMaintenanceDesc);
		}

		if (workorderId != null) {
			jsonHashMap.put(workorderIdTag, workorderId);
		}

		if (workorderCode != null && workorderCode != "") {
			jsonHashMap.put(workorderCodeTag, workorderCode);
		}
		if (quantity != null) {
			jsonHashMap.put(quantityTag, quantity);
		}
		if (storageTypeId != null) {
			jsonHashMap.put(storageTypeIdTag, storageTypeId);
		}
		if (user != null) {
			jsonHashMap.put(userTag, user);
		}
		if (formId != null) {
			jsonHashMap.put(formIdTag, formId);
		}
		if (objectClass != null) {
			jsonHashMap.put(objectClassTag, objectClass);
		}

		if (action != null) {
			jsonHashMap.put(actionTag, action);
		}

		JSONObject jsonObj = new JSONObject(jsonHashMap);

		return jsonObj.toString();

	}

	@SuppressWarnings("unchecked")
	public void interpreterBarCodeString(String codeString) {

		interpreterBarCodeMap(JSON.parseObject(codeString, HashMap.class));

	}

	public void interpreterBarCodeMap(HashMap<String, Object> jsonHashMap) {
		procurementOrderNumberId = null;
		procurementOrder = null;
		materialCatalogId = null;
		materialCatalogCode = null;
		storageLoactionId = null;
		storageLoactionDesc = null;
		warehouseId = null;
		warehouseDesc = null;
		assetId = null;
		assetCode = null;
		equipmentId = null;
		equipmentCode = null;
		partMaintenanceId = null;
		partMaintenanceDesc = null;
		workorderId = null;
		workorderCode = null;
		materialProcurementDetailId = null;
		quantity = null;
		storageTypeId = null;
		user = null;
		formId = null;
		objectClass = null;
		action = null;

		if (jsonHashMap.containsKey(materialProcurementDetailIdTag)) {
			this.setMaterialProcurementDetailId(
					((Integer) jsonHashMap.get(materialProcurementDetailIdTag)).longValue());

		}

		if (jsonHashMap.containsKey(procurementOrderNumberIdTag)) {
			this.setProcurementOrderNumberId(((Integer) jsonHashMap.get(procurementOrderNumberIdTag)).longValue());

		}
		if (jsonHashMap.containsKey(procurementOrderTag)) {
			this.setProcurementOrder((String) jsonHashMap.get(procurementOrderTag));

		}

		if (jsonHashMap.containsKey(materialCatalogIdTag)) {
			this.setMaterialCatalogId(((Integer) jsonHashMap.get(materialCatalogIdTag)).longValue());

		}
		if (jsonHashMap.containsKey(materialCatalogCodeTag)) {
			this.setMaterialCatalogCode((String) jsonHashMap.get(materialCatalogCodeTag));
		}

		if (jsonHashMap.containsKey(storageLoactionIdTag)) {
			this.setStorageLoactionId(((Integer) jsonHashMap.get(storageLoactionIdTag)).longValue());

		}
		if (jsonHashMap.containsKey(storageLoactionDescTag)) {
			this.setStorageLoactionDesc((String) jsonHashMap.get(storageLoactionDescTag));
		}

		if (jsonHashMap.containsKey(warehouseIdTag)) {
			this.setWarehouseId(((Integer) jsonHashMap.get(warehouseIdTag)).longValue());

		}
		if (jsonHashMap.containsKey(warehouseDescTag)) {
			this.setWarehouseDesc((String) jsonHashMap.get(warehouseDescTag));
		}

		if (jsonHashMap.containsKey(assetIdTag)) {
			this.setAssetId(((Integer) jsonHashMap.get(assetIdTag)).longValue());

		}
		if (jsonHashMap.containsKey(assetCodeTag)) {
			this.setAssetCode((String) jsonHashMap.get(assetCodeTag));
		}
		if (jsonHashMap.containsKey(equipmentIdTag)) {
			this.setEquipmentId(((Integer) jsonHashMap.get(equipmentIdTag)).longValue());
		}

		if (jsonHashMap.containsKey(equipmentCodeTag)) {
			this.setEquipmentCode((String) jsonHashMap.get(equipmentCodeTag));
		}
		if (jsonHashMap.containsKey(partMaintenanceIdTag)) {
			this.setPartMaintenanceId(((Integer) jsonHashMap.get(partMaintenanceIdTag)).longValue());
		}
		if (jsonHashMap.containsKey(partMaintenanceDescTag)) {
			this.setPartMaintenanceDesc((String) jsonHashMap.get(partMaintenanceDescTag));
		}
		if (jsonHashMap.containsKey(workorderIdTag)) {
			this.setWorkorderId(((Integer) jsonHashMap.get(workorderIdTag)).longValue());
		}
		if (jsonHashMap.containsKey(workorderCodeTag)) {
			this.setWorkorderCode((String) jsonHashMap.get(workorderCodeTag));
		}
		if (jsonHashMap.containsKey(quantityTag)) {
			this.setQuantity(new BigDecimal((Integer) jsonHashMap.get(quantityTag)));
		}
		if (jsonHashMap.containsKey(storageTypeIdTag)) {
			this.setStorageTypeId(((Integer) jsonHashMap.get(storageTypeIdTag)).longValue());
		}
		if (jsonHashMap.containsKey(userTag)) {
			this.setUser((String) jsonHashMap.get(userTag));
		}
		if (jsonHashMap.containsKey(formIdTag)) {
			this.setFormId((String) jsonHashMap.get(formIdTag));
		}
		if (jsonHashMap.containsKey(objectClassTag)) {
			this.setObjectClass((String) jsonHashMap.get(objectClassTag));
		}
		if (jsonHashMap.containsKey(actionTag)) {
			this.setAction((String) jsonHashMap.get(actionTag));
		}

	}

	public static void main(String[] args) {
		BarCodeInterpreter bi = new BarCodeInterpreter();
		bi.setMaterialCatalogCode("1509860");
		bi.setMaterialCatalogId(-1760L);
		bi.setProcurementOrder("4501241254");
		bi.setProcurementOrderNumberId(-100L);
		bi.setQuantity(new BigDecimal("100.00"));
		bi.setStorageLoactionDesc("A01020304");
		bi.setStorageLoactionId(1L);
		bi.setStorageTypeId(53L);
		System.out.println(bi.createBarCodeString());

	}

}
