package com.company.sda.cwiczenie1;

public class Cat extends Animal {

    public Cat(String race, String name, int age) {
        super(name, age, race);
    }
    @Override
    public void voice(){
        System.out.println("Miau");
    }
    }
