package com.ocmms.cmms.batch.tasktracking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class TaskTrackingRowMapper implements RowMapper<TaskTracking> {

	@Override
	public TaskTracking mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		TaskTracking taskTracking = new TaskTracking();
																
		if (!rs.getColumnValue(0).equals("")) {
			taskTracking.setId(Long.parseLong(rs.getColumnValue(0)));
		}
			if (!rs.getColumnValue(1).equals("")) {
				Date assignDate = sdf.parse(rs.getColumnValue(1));
				Calendar assignCal = Calendar.getInstance();
				assignCal.setTime(assignDate);
				taskTracking.setAssignDate(assignCal);
			}
			if (!rs.getColumnValue(2).equals("")) {
				Date completeDate = sdf.parse(rs.getColumnValue(2));
				Calendar completeCal = Calendar.getInstance();
				completeCal.setTime(completeDate);
				taskTracking.setCompleteDate(completeCal);
			}
		
		if (!rs.getColumnValue(3).equals("")) {
			taskTracking.setDescription(rs.getColumnValue(3));
		}
		if (!rs.getColumnValue(4).equals("")) {
			taskTracking.setMemo(rs.getColumnValue(4));
		}
		if (!rs.getColumnValue(5).equals("")) {
			taskTracking.setReference(rs.getColumnValue(5));
		}
		if (!rs.getColumnValue(6).equals("")) {
			Date submitDate = sdf.parse(rs.getColumnValue(6));
			Calendar submitCal = Calendar.getInstance();
			submitCal.setTime(submitDate);
			taskTracking.setSubmitDate(submitCal);
		}
		if (!rs.getColumnValue(7).equals("")) {
			Date targetDate = sdf.parse(rs.getColumnValue(7));
			Calendar targetCal = Calendar.getInstance();
			targetCal.setTime(targetDate);
			taskTracking.setTargetDate(targetCal);
		}
		if (!rs.getColumnValue(8).equals("")) {
			taskTracking.setSubmitter(Long.parseLong(rs.getColumnValue(8)));
		}
		if (!rs.getColumnValue(9).equals("")) {
			taskTracking.setSupportVendor(Long.parseLong(rs.getColumnValue(9)));
		}

		if (!rs.getColumnValue(10).equals("")) {
			taskTracking.setTaskOwner(Long.parseLong(rs.getColumnValue(10)));
		}
		if (!rs.getColumnValue(11).equals("")) {
			taskTracking.setTaskTrackingPriority(Long.parseLong(rs.getColumnValue(11)));
		}
		if (!rs.getColumnValue(12).equals("")) {
			taskTracking.setTaskTrackingStatus(Long.parseLong(rs.getColumnValue(12)));
		}

		if (!rs.getColumnValue(13).equals("")) {
			taskTracking.setTaskTrackingType(Long.parseLong(rs.getColumnValue(13)));
		}
		if (!rs.getColumnValue(14).equals("")) {
			taskTracking.setTechnicalObject(Long.parseLong(rs.getColumnValue(14)));
		}		
		
		return taskTracking;
	}

}
