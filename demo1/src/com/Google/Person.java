package com.Google;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doSelfIntroduction(){
        System.out.println("My name is "+name);
    }
}
