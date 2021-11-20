package com.company.sda.cwiczenie1;

public class Dog extends Animal {
    String color;

    public Dog(String color, String name, int age, String race) {
        super(name, age, race);
        this.color = color;
    }
    @Override
    public void voice(){
        System.out.println("hau");
    }
}
