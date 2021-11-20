package com.company.sda.cwiczenie1;

public class Animal {
    String name;
    int age;
    String race;

    public Animal(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public void voice(){
        System.out.println(".....");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }

}
