package com.ocmms.cmms.batch.equipmentmaintenancerecord;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class EquipmentMaintenanceRecordRowMapper implements RowMapper<EquipmentMaintenanceRecord> {

	@Override
	public EquipmentMaintenanceRecord mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		EquipmentMaintenanceRecord equipmentMaintenanceRecord = new EquipmentMaintenanceRecord();								

		if (!rs.getColumnValue(0).equals("")) {
			equipmentMaintenanceRecord.setDtype(rs.getColumnValue(0));
		}
		if (!rs.getColumnValue(1).equals("")) {
			equipmentMaintenanceRecord.setId(Long.parseLong(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			equipmentMaintenanceRecord.setDescription(rs.getColumnValue(2));
		}
		if (!rs.getColumnValue(3).equals("")) {
			equipmentMaintenanceRecord.setDowntime(new BigDecimal(rs.getColumnValue(3)));
		}
		if (!rs.getColumnValue(4).equals("")) {
			Date maintendDate = sdf.parse(rs.getColumnValue(4));
			Calendar maintendCal = Calendar.getInstance();
			maintendCal.setTime(maintendDate);
			equipmentMaintenanceRecord.setMaintEndDate(maintendCal);
		}
		if (!rs.getColumnValue(5).equals("")) {
			Date maintstrartDate = sdf.parse(rs.getColumnValue(5));
			Calendar maintstrartCal = Calendar.getInstance();
			maintstrartCal.setTime(maintstrartDate);
			equipmentMaintenanceRecord.setMaintStartDate(maintstrartCal);
		}		
		if (!rs.getColumnValue(6).equals("")) {
			equipmentMaintenanceRecord.setShutdown(Boolean.parseBoolean(rs.getColumnValue(6)));

		}
		if (!rs.getColumnValue(7).equals("")) {
			equipmentMaintenanceRecord.setShutdown(Boolean.parseBoolean(rs.getColumnValue(7)));

		}
		if (!rs.getColumnValue(8).equals("")) {
			equipmentMaintenanceRecord.setOfflineRunTime(new BigDecimal(rs.getColumnValue(8)));
		}
		if (!rs.getColumnValue(9).equals("")) {
			equipmentMaintenanceRecord.setOnlineRunTime(new BigDecimal(rs.getColumnValue(9)));
		}
		
				
		if (!rs.getColumnValue(10).equals("")) {
			equipmentMaintenanceRecord.setEquipment(Long.parseLong(rs.getColumnValue(10)));
		}
		if (!rs.getColumnValue(11).equals("")) {
			equipmentMaintenanceRecord.setMaintainer(Long.parseLong(rs.getColumnValue(11)));
		}
		if (!rs.getColumnValue(12).equals("")) {
			equipmentMaintenanceRecord.setInterim(Boolean.parseBoolean(rs.getColumnValue(12)));

		}		
		
		return equipmentMaintenanceRecord;
	}

}
