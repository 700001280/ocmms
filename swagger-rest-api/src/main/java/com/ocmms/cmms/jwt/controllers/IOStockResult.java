package com.ocmms.cmms.jwt.controllers;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class IOStockResult {
	private BigDecimal plantStock;
	private BigDecimal locationStock;
	
	public IOStockResult(BigDecimal plantStock,BigDecimal locationStock) {
		this.locationStock=locationStock;
		this.plantStock=plantStock;
		}
	
	public IOStockResult() {
		plantStock=BigDecimal.valueOf(-1.00D);
		locationStock=BigDecimal.valueOf(-1.00D);
		}
}
