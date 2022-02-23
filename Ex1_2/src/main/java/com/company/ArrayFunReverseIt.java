package com.company;

import java.util.Scanner;

public class ArrayFunReverseIt {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int[] arr1 = new int [5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int[] arr2 = new int [5];
        arr2[0] = 5;
        arr2[1] = 4;
        arr2[2] = 3;
        arr2[3] = 2;
        arr2[4] = 1;

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
