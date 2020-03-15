package com.ocmms.cmms.batch.purchasedetail;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class PurchaseDetailRowMapper implements RowMapper<PurchaseDetail> {

	@Override
	public PurchaseDetail mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		PurchaseDetail purchaseDetail = new PurchaseDetail();
		if (!rs.getColumnValue(0).equals("")) {
			purchaseDetail.setDtype(rs.getColumnValue(0));
		}
		if (!rs.getColumnValue(1).equals("")) {
			purchaseDetail.setId(Long.parseLong(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			purchaseDetail.setClosed(Boolean.parseBoolean(rs.getColumnValue(2)));

		}
		if (!rs.getColumnValue(3).equals("")) {
			purchaseDetail.setDescription(rs.getColumnValue(3));
		}
		if (!rs.getColumnValue(4).equals("")) {
			purchaseDetail.setMemo(rs.getColumnValue(4));
		}
		if (!rs.getColumnValue(5).equals("")) {
			Date poDate = sdf.parse(rs.getColumnValue(5));
			Calendar poCal = Calendar.getInstance();
			poCal.setTime(poDate);
			purchaseDetail.setPoDate(poCal);
		}
		if (!rs.getColumnValue(6).equals("")) {
			purchaseDetail.setPoNumber(rs.getColumnValue(6));
		}
		if (!rs.getColumnValue(7).equals("")) {
			Date prDate = sdf.parse(rs.getColumnValue(7));
			Calendar prCal = Calendar.getInstance();
			prCal.setTime(prDate);
			purchaseDetail.setPurchaseRequestDate(prCal);
		}
		if (!rs.getColumnValue(8).equals("")) {
			purchaseDetail.setPurchaseRequestNo(rs.getColumnValue(8));
		}
		if (!rs.getColumnValue(9).equals("")) {
			purchaseDetail.setQuantity(new BigDecimal(rs.getColumnValue(9)));
		}
		if (!rs.getColumnValue(10).equals("")) {
			Date sbDate = sdf.parse(rs.getColumnValue(10));
			Calendar sbCal = Calendar.getInstance();
			sbCal.setTime(sbDate);
			purchaseDetail.setSubmitDate(sbCal);
		}
		if (!rs.getColumnValue(11).equals("")) {
			purchaseDetail.setUnitPrice(new BigDecimal(rs.getColumnValue(11)));
		}
		if (!rs.getColumnValue(12).equals("")) {
			Date woDate = sdf.parse(rs.getColumnValue(12));
			Calendar woCal = Calendar.getInstance();
			woCal.setTime(woDate);
			purchaseDetail.setWorkOrderDate(woCal);
		}
		if (!rs.getColumnValue(13).equals("")) {
			purchaseDetail.setWorkOrderNo(rs.getColumnValue(13));
		}
		if (!rs.getColumnValue(14).equals("")) {
			Date ddDate = sdf.parse(rs.getColumnValue(14));
			Calendar ddCal = Calendar.getInstance();
			ddCal.setTime(ddDate);
			purchaseDetail.setDeliverDate(ddCal);
		}
		if (!rs.getColumnValue(15).equals("")) {
			purchaseDetail.setCatalogType(Long.parseLong(rs.getColumnValue(15)));
		}
		if (!rs.getColumnValue(16).equals("")) {
			purchaseDetail.setCurrencyUnit(Long.parseLong(rs.getColumnValue(16)));
		}

		if (!rs.getColumnValue(17).equals("")) {
			purchaseDetail.setPriorityType(Long.parseLong(rs.getColumnValue(17)));
		}
		if (!rs.getColumnValue(18).equals("")) {
			purchaseDetail.setRequester(Long.parseLong(rs.getColumnValue(18)));
		}
		if (!rs.getColumnValue(19).equals("")) {
			purchaseDetail.setSupplier(Long.parseLong(rs.getColumnValue(19)));
		}
		if (!rs.getColumnValue(20).equals("")) {
			purchaseDetail.setMaterialCatalog(Long.parseLong(rs.getColumnValue(20)));
		}
		if (!rs.getColumnValue(21).equals("")) {
			purchaseDetail.setOrganization(Long.parseLong(rs.getColumnValue(21)));
		}
		if (!rs.getColumnValue(22).equals("")) {
			purchaseDetail.setWorkorderMaterial(Long.parseLong(rs.getColumnValue(22)));
		}		
		
		return purchaseDetail;
	}

}
