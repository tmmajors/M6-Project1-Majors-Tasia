package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        String stringIn;

        for(int i = 0; i < numbers.length; i++) {

            stringIn = myScanner.nextLine();
            numbers[i] = Integer.parseInt(stringIn);

        }

        input.close();

        System.out.println("You've entered:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
