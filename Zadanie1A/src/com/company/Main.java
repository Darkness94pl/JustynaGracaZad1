package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int wylosowana;
        int minimum = 0;
        int maksimum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum:");
        try{
            minimum = scanner.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Podane minimum nie jest liczba, podaj liczbe!");
            return;
        }

        System.out.println("Maksimum:");
        try{
            maksimum = scanner.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Podane maksimum nie jest liczba, podaj liczbe!");
            return;
        }

        wylosowana = ThreadLocalRandom.current().nextInt(minimum, maksimum + 1);
        System.out.println("Wylosowana liczba :" + wylosowana);
        for (int i = minimum; i <= maksimum; i++) {
            if (i == 0 || wylosowana == 0) {
            } else {
                if ((i % wylosowana) == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}