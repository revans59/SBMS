package com.revanit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STOCK_PRICE_DTLS")
public class StockPrice {

	@Id
	@Column(name = "STOCK_PRICE_ID")
	private Integer stockPriceId;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "COMPANY_STOCK_PRICE")
	private Double companyStockPrice;

	public Integer getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(Integer stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyStockPrice() {
		return companyStockPrice;
	}

	public void setCompanyStockPrice(Double companyStockPrice) {
		this.companyStockPrice = companyStockPrice;
	}

}
