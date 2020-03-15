package com.ocmms.cmms.batch.partreplacerecord;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class PartReplaceRecordRowMapper implements RowMapper<PartReplaceRecord> {

	@Override
	public PartReplaceRecord mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		PartReplaceRecord partReplaceRecord = new PartReplaceRecord();										

		if (!rs.getColumnValue(0).equals("")) {
			partReplaceRecord.setDtype(rs.getColumnValue(0));
		}
		if (!rs.getColumnValue(1).equals("")) {
			partReplaceRecord.setId(Long.parseLong(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			partReplaceRecord.setDescription(rs.getColumnValue(2));
		}		

		if (!rs.getColumnValue(3).equals("")) {
			partReplaceRecord.setMemo(rs.getColumnValue(3));
		}
							
		if (!rs.getColumnValue(4).equals("")) {
			Date offlineDate = sdf.parse(rs.getColumnValue(4));
			Calendar offlineCal = Calendar.getInstance();
			offlineCal.setTime(offlineDate);
			partReplaceRecord.setOfflineDate(offlineCal);
		}
		if (!rs.getColumnValue(5).equals("")) {
			partReplaceRecord.setOfflinePlan(Boolean.parseBoolean(rs.getColumnValue(5)));
		}
		if (!rs.getColumnValue(6).equals("")) {
			Date onlinedateDate = sdf.parse(rs.getColumnValue(6));
			Calendar onlinedateCal = Calendar.getInstance();
			onlinedateCal.setTime(onlinedateDate);
			partReplaceRecord.setOnlineDate(onlinedateCal);
		}
		if (!rs.getColumnValue(7).equals("")) {
			partReplaceRecord.setOnlinePlan(Boolean.parseBoolean(rs.getColumnValue(7)));
		}	
		if (!rs.getColumnValue(8).equals("")) {
			partReplaceRecord.setSerialNumber(rs.getColumnValue(8));
		}
		if (!rs.getColumnValue(9).equals("")) {
			partReplaceRecord.setOfflineRunTime(new BigDecimal(rs.getColumnValue(9)));
		}
		if (!rs.getColumnValue(10).equals("")) {
				partReplaceRecord.setOnlineRunTime(new BigDecimal(rs.getColumnValue(10)));
		}	
		if (!rs.getColumnValue(11).equals("")) {
			partReplaceRecord.setEquipment(Long.parseLong(rs.getColumnValue(11)));
		}
		if (!rs.getColumnValue(12).equals("")) {
			partReplaceRecord.setMaterialCatalog(Long.parseLong(rs.getColumnValue(12)));
		}
		if (!rs.getColumnValue(13).equals("")) {
			partReplaceRecord.setOfflineMaintainer(Long.parseLong(rs.getColumnValue(13)));
		}
			
		if (!rs.getColumnValue(14).equals("")) {
			partReplaceRecord.setOnlineMaintainer(Long.parseLong(rs.getColumnValue(14)));
		}
		
		
		return partReplaceRecord;
	}

}
