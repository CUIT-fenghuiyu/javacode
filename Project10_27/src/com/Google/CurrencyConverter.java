package com.Google;

class CurrencyConverter extends Converter{
    @Override
    public void convert() {
        foreignCurrency = localCurrency * exchangeRate;
    }

    public double localCurrency;
    public double getLocalCurrency() {
        return localCurrency;
    }

    public double foreignCurrency;
    public double getForeignCurrency() {
        return foreignCurrency;
    }

    public double exchangeRate;
    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    public double getExchangeRate() {
        return exchangeRate;
    }

    CurrencyConverter(String name, double localCurrency, double exchangeRate){
        super(name);
        this.localCurrency = localCurrency;
        this.exchangeRate = exchangeRate;
    }
}
