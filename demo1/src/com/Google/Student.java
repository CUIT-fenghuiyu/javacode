package com.Google;

class Student extends Person{
    String stuID;

    Student(String name, String stuID){
        super(name);
        this.stuID = stuID;
    }

    @Override
    public void doSelfIntroduction() {
        System.out.println("My name is "+ getName() +" and my stuID is "+ stuID);
    }

    void study(){
        System.out.println("I am studying");
    }
}
