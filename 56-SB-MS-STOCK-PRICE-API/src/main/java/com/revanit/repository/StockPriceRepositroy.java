package com.revanit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revanit.entity.StockPrice;

public interface StockPriceRepositroy extends JpaRepository<StockPrice, Serializable> {

	@Query("select companyStockPrice from stockPrice where companyName=:companyName")
	public Double findStockPriceByCompanyName(String companyName);
}
