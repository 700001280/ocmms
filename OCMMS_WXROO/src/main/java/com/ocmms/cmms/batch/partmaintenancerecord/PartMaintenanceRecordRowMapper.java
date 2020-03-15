package com.ocmms.cmms.batch.partmaintenancerecord;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class PartMaintenanceRecordRowMapper implements RowMapper<PartMaintenanceRecord> {

	@Override
	public PartMaintenanceRecord mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		PartMaintenanceRecord partMaintenanceRecord = new PartMaintenanceRecord();								

		if (!rs.getColumnValue(0).equals("")) {
			partMaintenanceRecord.setDtype(rs.getColumnValue(0));
		}
		if (!rs.getColumnValue(1).equals("")) {
			partMaintenanceRecord.setId(Long.parseLong(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			partMaintenanceRecord.setDescription(rs.getColumnValue(2));
		}
		if (!rs.getColumnValue(3).equals("")) {
			partMaintenanceRecord.setDowntime(new BigDecimal(rs.getColumnValue(3)));
		}
		if (!rs.getColumnValue(4).equals("")) {
			Date maintendDate = sdf.parse(rs.getColumnValue(4));
			Calendar maintendCal = Calendar.getInstance();
			maintendCal.setTime(maintendDate);
			partMaintenanceRecord.setMaintEndDate(maintendCal);
		}
		if (!rs.getColumnValue(5).equals("")) {
			Date maintstrartDate = sdf.parse(rs.getColumnValue(5));
			Calendar maintstrartCal = Calendar.getInstance();
			maintstrartCal.setTime(maintstrartDate);
			partMaintenanceRecord.setMaintStartDate(maintstrartCal);
		}
		if (!rs.getColumnValue(6).equals("")) {
			partMaintenanceRecord.setSerialNumber(rs.getColumnValue(6));
		}		
				
		if (!rs.getColumnValue(7).equals("")) {
			partMaintenanceRecord.setShutdown(Boolean.parseBoolean(rs.getColumnValue(7)));

		}		
		if (!rs.getColumnValue(8).equals("")) {
			partMaintenanceRecord.setMaterialCatalog(Long.parseLong(rs.getColumnValue(8)));
		}
		if (!rs.getColumnValue(9).equals("")) {
			partMaintenanceRecord.setPurchaseDetail(Long.parseLong(rs.getColumnValue(9)));
		}
		if (!rs.getColumnValue(10).equals("")) {
			partMaintenanceRecord.setSupportVendor(Long.parseLong(rs.getColumnValue(10)));
		}
		if (!rs.getColumnValue(11).equals("")) {
			partMaintenanceRecord.setWorker(Long.parseLong(rs.getColumnValue(11)));
		}	
		
		return partMaintenanceRecord;
	}

}
