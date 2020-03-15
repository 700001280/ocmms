package com.ocmms.cmms.batch.mrocatalog;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class MroCatalogRowMapper implements RowMapper<MroCatalog> {

	@Override
	public MroCatalog mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		MroCatalog mroCatalog = new MroCatalog();
		if (!rs.getColumnValue(0).equals("")) {
			mroCatalog.setDtype(rs.getColumnValue(0));
		}
		if (!rs.getColumnValue(1).equals("")) {
			mroCatalog.setId(Long.parseLong(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			mroCatalog.setCode(rs.getColumnValue(2));
		}
		if (!rs.getColumnValue(3).equals("")) {
			mroCatalog.setMaterialGroup(rs.getColumnValue(3));
		}
		if (!rs.getColumnValue(4).equals("")) {
			mroCatalog.setMaterialName(rs.getColumnValue(4));
		}
		if (!rs.getColumnValue(5).equals("")) {
			mroCatalog.setHazardousMaterial(Boolean.parseBoolean(rs.getColumnValue(5)));
		}
		if (!rs.getColumnValue(6).equals("")) {
			mroCatalog.setInstockType(Boolean.parseBoolean(rs.getColumnValue(6)));
		}
		if (!rs.getColumnValue(7).equals("")) {
			mroCatalog.setLongDescription(rs.getColumnValue(8));
		}
		if (!rs.getColumnValue(8).equals("")) {
			mroCatalog.setShelfLifeDays(Integer.parseInt(rs.getColumnValue(8)));
		}
		if (!rs.getColumnValue(9).equals("")) {
			mroCatalog.setShortDescription(rs.getColumnValue(9));
		}
		if (!rs.getColumnValue(10).equals("")) {
			mroCatalog.setUsefulLife(Boolean.parseBoolean(rs.getColumnValue(10)));
		}
		if (!rs.getColumnValue(11).equals("")) {
			mroCatalog.setDiscipline(Long.parseLong(rs.getColumnValue(11)));
		}
		if (!rs.getColumnValue(12).equals("")) {
			mroCatalog.setMaterialType(Long.parseLong(rs.getColumnValue(12)));
		}
		if (!rs.getColumnValue(13).equals("")) {
			mroCatalog.setUom(Long.parseLong(rs.getColumnValue(13)));
		}
			
		
		return mroCatalog;
	}

}
