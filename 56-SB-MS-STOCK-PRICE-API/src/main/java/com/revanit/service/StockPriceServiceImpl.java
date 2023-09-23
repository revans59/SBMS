package com.revanit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.revanit.binding.StockPriceResponse;
import com.revanit.repository.StockPriceRepositroy;

@Service
public class StockPriceServiceImpl implements StockPriceService{

	@Autowired
	private StockPriceRepositroy stockPriceRepositroy;
	
	@Autowired
	private Environment env;
	
	@Override
	public StockPriceResponse getStockPrice(String companyName) {
		Double stockPrice = stockPriceRepositroy.findStockPriceByCompanyName(companyName);
		StockPriceResponse response = new StockPriceResponse();
		response.setCompanyName(companyName);
		response.setCompanyStockPrice(stockPrice);
		
		String port = env.getProperty("server.port");
		response.setPortNumber(Integer.parseInt(port));
		
		return response;
	}

	

}
