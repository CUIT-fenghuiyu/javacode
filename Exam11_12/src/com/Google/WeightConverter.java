package com.Google;

public class WeightConverter extends Converter{
    public double value;
    public double factor;

    public double getValue() {
        return value;
    }

    WeightConverter(String name, double value, double factor){
        super(name);
        this.value=value;
        this.factor=factor;
    }

    @Override
    public double convert() {
        return value * factor;
    }
}
