package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printHelloWorld();
        giveValue(1);
        int resultSum = sumNumber(15, 10);
        System.out.println(resultSum);

        int result = substraction(13, 17);
        System.out.println(result);

        int resultMultiplication = multiplication(resultSum, result);
        System.out.println(resultMultiplication);

        boolean even = checkEvenNumber(12);
        System.out.println("Even result="+even );
        Scanner scanner =new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scanner.nextLine();
        System.out.println("Witaj. Twoje imię to " + name);


        // write your code here
    }

    private static boolean checkEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }

    private static int multiplication(int resultSum, int result) {
        return resultSum * result;
    }

    private static int substraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int sumNumber(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static void giveValue(int number) {
        if (number > 5) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }

    private static void printHelloWorld() {
        String name = "Hello World";
        System.out.println(name);
    }

}
