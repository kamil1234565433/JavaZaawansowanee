package sda.pl.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {


        Random random = new Random ();
        int randomNumber = random.nextInt(100);
        //System.out.println("Wylosowana liczba to: " + randomNumber);
        System.out.print("Wprowadź liczbę: ");
        Scanner sc20 = new Scanner(System.in);
        int providedNumber = sc20.nextInt();

        do {
            if (providedNumber > randomNumber) {
                System.out.println("za dużo");
                providedNumber = sc20.nextInt();
            } else if (providedNumber < randomNumber) {
                System.out.println("za mało");
                providedNumber = sc20.nextInt();
            }
        }
        while (providedNumber != randomNumber); {
            System.out.println("Bingo");
        }
    }
}
