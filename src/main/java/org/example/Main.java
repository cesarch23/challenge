package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero flotante");
        float floatNumber = scanner.nextFloat();
        int intNumber = (int) floatNumber;
        float decimalNumber = (float) (floatNumber - (intNumber * 1.0));
        System.out.println("La parte entera de: " + floatNumber + " es: " + intNumber);
        System.out.println("La parte decimal de: " + floatNumber + " es: " +  decimalNumber);


    }
}