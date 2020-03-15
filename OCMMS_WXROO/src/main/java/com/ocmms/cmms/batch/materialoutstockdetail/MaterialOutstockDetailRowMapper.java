package com.ocmms.cmms.batch.materialoutstockdetail;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class MaterialOutstockDetailRowMapper implements RowMapper<MaterialOutstockDetail> {

	@Override
	public MaterialOutstockDetail mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		MaterialOutstockDetail materialOutstockDetail = new MaterialOutstockDetail();
		if (!rs.getColumnValue(0).equals("")) {
			materialOutstockDetail.setId(Long.parseLong(rs.getColumnValue(0)));
		}
		if (!rs.getColumnValue(1).equals("")) {
			Date issueDate = sdf.parse(rs.getColumnValue(1));
			Calendar issueCal = Calendar.getInstance();
			issueCal.setTime(issueDate);
			materialOutstockDetail.setIssueDate(issueCal);
		}
		if (!rs.getColumnValue(2).equals("")) {
			materialOutstockDetail.setMemo(rs.getColumnValue(2));
		}
		if (!rs.getColumnValue(3).equals("")) {
			materialOutstockDetail.setOrderNo(rs.getColumnValue(3));
		}
		if (!rs.getColumnValue(4).equals("")) {
			materialOutstockDetail.setOutstockQuantity(new BigDecimal(rs.getColumnValue(4)));
		}
		if (!rs.getColumnValue(5).equals("")) {
			materialOutstockDetail.setSerialNumber(rs.getColumnValue(5));
		}
		if (!rs.getColumnValue(6).equals("")) {
			materialOutstockDetail.setEquipmentMaintenanceRecord(Long.parseLong(rs.getColumnValue(6)));
		}
		if (!rs.getColumnValue(7).equals("")) {
			materialOutstockDetail.setKeeper(Long.parseLong(rs.getColumnValue(7)));
		}
		if (!rs.getColumnValue(8).equals("")) {
			materialOutstockDetail.setMaterialCatalog(Long.parseLong(rs.getColumnValue(8)));
		}
		if (!rs.getColumnValue(9).equals("")) {
			materialOutstockDetail.setOrganization(Long.parseLong(rs.getColumnValue(9)));
		}
		if (!rs.getColumnValue(10).equals("")) {
			materialOutstockDetail.setPartMaintenanceRecord(Long.parseLong(rs.getColumnValue(10)));
		}
		if (!rs.getColumnValue(11).equals("")) {
			materialOutstockDetail.setReceiver(Long.parseLong(rs.getColumnValue(11)));
		}
		if (!rs.getColumnValue(12).equals("")) {
			materialOutstockDetail.setStorageLocation(Long.parseLong(rs.getColumnValue(12)));
		}
		if (!rs.getColumnValue(13).equals("")) {
			materialOutstockDetail.setStorageType(Long.parseLong(rs.getColumnValue(13)));
		}											

		return materialOutstockDetail;
	}

}
