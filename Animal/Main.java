package com.company.sda.cwiczenie1;

import com.company.sda.cwiczenie1.Animal;
import com.company.sda.cwiczenie1.Cat;
import com.company.sda.cwiczenie1.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Bartek", 2, "debil");
        Animal animal1 = new Animal("Goguś", 4, "nordycka");


        Cat cat1 = new Cat("Brytyjczyk", "Jełop", 2);
        Cat cat2 = new Cat("Dachowiec", "Ruduś", 3);

        Dog dog1 = new Dog("black", "Puluś", 2, "jełopowaty");
        Dog dog2 = new Dog("white", "Beżuś", 6, "męczący");
        cat1.voice();
        Animal[] animals = {cat1, cat2};

    }
}
