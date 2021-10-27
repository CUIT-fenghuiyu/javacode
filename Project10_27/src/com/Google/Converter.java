package com.Google;

abstract class Converter {
    private String name;
    public String getName(){
        return name;
    }
    Converter(String name){
        this.name = name;
    }
    public abstract void convert();
}
