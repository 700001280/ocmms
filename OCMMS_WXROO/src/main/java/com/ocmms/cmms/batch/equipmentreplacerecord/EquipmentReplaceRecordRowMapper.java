package com.ocmms.cmms.batch.equipmentreplacerecord;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class EquipmentReplaceRecordRowMapper implements RowMapper<EquipmentReplaceRecord> {

	@Override
	public EquipmentReplaceRecord mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		EquipmentReplaceRecord equipmentReplaceRecord = new EquipmentReplaceRecord();										

		if (!rs.getColumnValue(0).equals("")) {
			equipmentReplaceRecord.setDtype(rs.getColumnValue(0));
		}
		if (!rs.getColumnValue(1).equals("")) {
			equipmentReplaceRecord.setId(Long.parseLong(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			equipmentReplaceRecord.setDescription(rs.getColumnValue(2));
		}
		if (!rs.getColumnValue(3).equals("")) {
			equipmentReplaceRecord.setMemo(rs.getColumnValue(3));
		}
		if (!rs.getColumnValue(4).equals("")) {
			Date offlineDate = sdf.parse(rs.getColumnValue(4));
			Calendar offlineCal = Calendar.getInstance();
			offlineCal.setTime(offlineDate);
			equipmentReplaceRecord.setOfflineDate(offlineCal);
		}
		if (!rs.getColumnValue(5).equals("")) {
			equipmentReplaceRecord.setOfflinePlan(Boolean.parseBoolean(rs.getColumnValue(5)));
		}
		if (!rs.getColumnValue(6).equals("")) {
			Date onlinedateDate = sdf.parse(rs.getColumnValue(6));
			Calendar onlinedateCal = Calendar.getInstance();
			onlinedateCal.setTime(onlinedateDate);
			equipmentReplaceRecord.setOnlineDate(onlinedateCal);
		}
		if (!rs.getColumnValue(7).equals("")) {
			equipmentReplaceRecord.setOnlinePlan(Boolean.parseBoolean(rs.getColumnValue(7)));
		}				
		if (!rs.getColumnValue(8).equals("")) {
			equipmentReplaceRecord.setOfflineRunTime(new BigDecimal(rs.getColumnValue(8)));
		}
		if (!rs.getColumnValue(9).equals("")) {
				equipmentReplaceRecord.setOnlineRunTime(new BigDecimal(rs.getColumnValue(9)));
		}	
		if (!rs.getColumnValue(10).equals("")) {
			equipmentReplaceRecord.setEquipment(Long.parseLong(rs.getColumnValue(10)));
		}
		if (!rs.getColumnValue(11).equals("")) {
			equipmentReplaceRecord.setOfflineMaintainer(Long.parseLong(rs.getColumnValue(11)));
		}
			
		if (!rs.getColumnValue(12).equals("")) {
			equipmentReplaceRecord.setOnlineMaintainer(Long.parseLong(rs.getColumnValue(12)));
		}
		if (!rs.getColumnValue(13).equals("")) {
			equipmentReplaceRecord.setTechnicalObject(Long.parseLong(rs.getColumnValue(13)));
		}
		if (!rs.getColumnValue(14).equals("")) {
			equipmentReplaceRecord.setShaftType(Long.parseLong(rs.getColumnValue(14)));
		}
		return equipmentReplaceRecord;
	}

}
