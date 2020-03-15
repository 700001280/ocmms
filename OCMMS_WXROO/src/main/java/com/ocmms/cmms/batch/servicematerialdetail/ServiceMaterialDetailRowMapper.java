package com.ocmms.cmms.batch.servicematerialdetail;

import java.math.BigDecimal;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

public class ServiceMaterialDetailRowMapper implements RowMapper<ServiceMaterialDetail> {

	@Override
	public ServiceMaterialDetail mapRow(RowSet rs) throws Exception {
		ServiceMaterialDetail serviceMaterialDetail = new ServiceMaterialDetail();		
		if (!rs.getColumnValue(0).equals("")) {
			serviceMaterialDetail.setId(Long.parseLong(rs.getColumnValue(0)));
		}
		if (!rs.getColumnValue(1).equals("")) {
			serviceMaterialDetail.setClosed(Boolean.parseBoolean(rs.getColumnValue(1)));
		}
		if (!rs.getColumnValue(2).equals("")) {
			serviceMaterialDetail.setDescription(rs.getColumnValue(2));
		}
		if (!rs.getColumnValue(3).equals("")) {
			serviceMaterialDetail.setMemo(rs.getColumnValue(3));
		}		
		if (!rs.getColumnValue(4).equals("")) {
			serviceMaterialDetail.setQuantity(new BigDecimal(rs.getColumnValue(4)));
		}
		if (!rs.getColumnValue(5).equals("")) {
			serviceMaterialDetail.setUnitPrice(new BigDecimal(rs.getColumnValue(5)));
		}
		if (!rs.getColumnValue(6).equals("")) {
			serviceMaterialDetail.setCurrencyUnit(Long.parseLong(rs.getColumnValue(6)));
		}
		if (!rs.getColumnValue(7).equals("")) {
			serviceMaterialDetail.setServiceCatalog(Long.parseLong(rs.getColumnValue(7)));
		}
		if (!rs.getColumnValue(8).equals("")) {
			serviceMaterialDetail.setServicePurchaseDetail(Long.parseLong(rs.getColumnValue(8)));
		}		
		return serviceMaterialDetail;
	}

}
