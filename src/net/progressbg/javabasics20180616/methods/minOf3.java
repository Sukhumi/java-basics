package net.progressbg.javabasics20180616.methods;

import net.progressbg.javabasics20180616.arrays.arrayFunctions;

import java.util.Scanner;

public class minOf3 {

    static int returnLesser(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    static int printMin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++){

            min = returnLesser(arr[i], min);
        }

        return min;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("numbers in array:");
        int n = 3;

        System.out.println("input numbers:");
        int[] myArray = arrayFunctions.arrInput(n);

        System.out.println(printMin(myArray));
    }
}

