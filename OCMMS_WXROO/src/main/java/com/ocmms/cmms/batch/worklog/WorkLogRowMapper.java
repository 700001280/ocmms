package com.ocmms.cmms.batch.worklog;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class WorkLogRowMapper implements RowMapper<WorkLog> {

	@Override
	public WorkLog mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		WorkLog workLog = new WorkLog();	
								

		if (!rs.getColumnValue(0).equals("")) {
			workLog.setId(Long.parseLong(rs.getColumnValue(0)));
		}
		if (!rs.getColumnValue(1).equals("")) {
			workLog.setAssign(Boolean.parseBoolean(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			workLog.setDescription(rs.getColumnValue(2));
		}
		if (!rs.getColumnValue(3).equals("")) {
			Date logDate = sdf.parse(rs.getColumnValue(3));
			Calendar logCal = Calendar.getInstance();
			logCal.setTime(logDate);
			workLog.setLogDate(logCal);
		}		
		if (!rs.getColumnValue(4).equals("")) {
			workLog.setRemark(rs.getColumnValue(4));
		}		
		if (!rs.getColumnValue(5).equals("")) {
			workLog.setLogger(Long.parseLong(rs.getColumnValue(5)));
		}
		if (!rs.getColumnValue(6).equals("")) {
			workLog.setWorkLogType(Long.parseLong(rs.getColumnValue(6)));
		}				
		return workLog;
	}

}
