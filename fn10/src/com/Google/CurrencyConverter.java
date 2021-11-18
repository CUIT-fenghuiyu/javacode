package com.Google;

public class CurrencyConverter extends Converter{
	double localCurrency, foreignCurrency;
	double exchangeRate;
	
	CurrencyConverter(String name, double localCurrency, double exchangeRate){
		super(name);
		this.localCurrency = localCurrency;
    	this.exchangeRate = exchangeRate;
    }
	
	double getLocalCurrency() {
		return localCurrency;
	}
	
	double getForeignCurrency() {
		return foreignCurrency;
	}
	
	void setExchangeRate(double exchangerate) {
		this.exchangeRate = exchangerate;
	}
	double getExchangeRate() {
		return exchangeRate;
	}
	
	
	
	public void convert() {
		foreignCurrency = localCurrency * exchangeRate;
	}
    
}
