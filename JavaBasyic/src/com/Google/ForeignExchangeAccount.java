package com.Google;

public class ForeignExchangeAccount implements Converter{
	double localCurrencyBalance;
	double foreignCurrencyBalance;
	String currency;
	double exchangeRate;
	
	double getLocalCurrencyBalance() {
		return localCurrencyBalance; 
	}
	double getForeignCurrencyBalance() {
		return foreignCurrencyBalance;
	}
	String getCurrency() {
		return currency;
	}
	void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	double getExchangeRate() {
		return exchangeRate;
	}
	
	ForeignExchangeAccount(String currency, double exchangeRate, double localCurrencyBalance){
		this.currency = currency;
		this.exchangeRate = exchangeRate;
		this.localCurrencyBalance = localCurrencyBalance;
	}
	
	@Override
	public void convert() {
		this.foreignCurrencyBalance = localCurrencyBalance * exchangeRate;
	}
	
}
