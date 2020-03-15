package com.ocmms.cmms.batch.instockdetail;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class InstockDetailRowMapper implements RowMapper<InstockDetail> {

	@Override
	public InstockDetail mapRow(RowSet rs) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		InstockDetail instockDetail = new InstockDetail();
		if (!rs.getColumnValue(0).equals("")) {
			instockDetail.setDtype(rs.getColumnValue(0));
		}
		if (!rs.getColumnValue(1).equals("")) {
			instockDetail.setId(Long.parseLong(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			instockDetail.setClosed(Boolean.parseBoolean(rs.getColumnValue(2)));

		}
		if (!rs.getColumnValue(3).equals("")) {
			instockDetail.setGoodReceiveNo(rs.getColumnValue(3));
		}
		if (!rs.getColumnValue(4).equals("")) {
			Date invoiceDate = sdf.parse(rs.getColumnValue(4));
			Calendar invoiceCal = Calendar.getInstance();
			invoiceCal.setTime(invoiceDate);
			instockDetail.setInvoiceDate(invoiceCal);
		}
		if (!rs.getColumnValue(5).equals("")) {
			instockDetail.setMemo(rs.getColumnValue(5));
		}
		if (!rs.getColumnValue(6).equals("")) {
			instockDetail.setOrderNo(rs.getColumnValue(6));
		}
		if (!rs.getColumnValue(7).equals("")) {
			Date paymentDate = sdf.parse(rs.getColumnValue(7));
			Calendar paymentCal = Calendar.getInstance();
			paymentCal.setTime(paymentDate);
			instockDetail.setPaymentDate(paymentCal);
		}
		if (!rs.getColumnValue(8).equals("")) {
			instockDetail.setQuantity(new BigDecimal(rs.getColumnValue(8)));
		}
		if (!rs.getColumnValue(9).equals("")) {
			Date receiveDate = sdf.parse(rs.getColumnValue(9));
			Calendar receiveCal = Calendar.getInstance();
			receiveCal.setTime(receiveDate);
			instockDetail.setReceiveDate(receiveCal);
		}
		if (!rs.getColumnValue(10).equals("")) {
			instockDetail.setUnitPrice(new BigDecimal(rs.getColumnValue(10)));
		}
		if (!rs.getColumnValue(11).equals("")) {
			Date expirationDate = sdf.parse(rs.getColumnValue(11));
			Calendar expirationCal = Calendar.getInstance();
			expirationCal.setTime(expirationDate);
			instockDetail.setExpirationDate(expirationCal);
		}
		if (!rs.getColumnValue(12).equals("")) {
			instockDetail.setSerialNumber(rs.getColumnValue(12));
		}
		if (!rs.getColumnValue(13).equals("")) {
			instockDetail.setCurrencyUnit(Long.parseLong(rs.getColumnValue(13)));
		}
		if (!rs.getColumnValue(14).equals("")) {
			instockDetail.setPaymentSubmitter(Long.parseLong(rs.getColumnValue(14)));
		}
		if (!rs.getColumnValue(15).equals("")) {
			instockDetail.setReceiver(Long.parseLong(rs.getColumnValue(15)));
		}
		if (!rs.getColumnValue(16).equals("")) {
			instockDetail.setKeeper(Long.parseLong(rs.getColumnValue(16)));
		}
		if (!rs.getColumnValue(17).equals("")) {
			instockDetail.setMaterialCatalog(Long.parseLong(rs.getColumnValue(17)));
		}
		if (!rs.getColumnValue(18).equals("")) {
			instockDetail.setOrganization(Long.parseLong(rs.getColumnValue(18)));
		}
		if (!rs.getColumnValue(19).equals("")) {
			instockDetail.setStorageLocation(Long.parseLong(rs.getColumnValue(19)));
		}

		if (!rs.getColumnValue(20).equals("")) {
			instockDetail.setStorageType(Long.parseLong(rs.getColumnValue(20)));
		}
		if (!rs.getColumnValue(21).equals("")) {
			instockDetail.setMaterialProcurementItemDetail(Long.parseLong(rs.getColumnValue(21)));
		}
		if (!rs.getColumnValue(22).equals("")) {
			instockDetail.setServiceProcurementItemDetail(Long.parseLong(rs.getColumnValue(22)));
		}

		return instockDetail;
	}
}
