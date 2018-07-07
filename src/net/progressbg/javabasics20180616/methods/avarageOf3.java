package net.progressbg.javabasics20180616.methods;

import net.progressbg.javabasics20180616.arrays.arrayFunctions;

import java.util.Scanner;

public class avarageOf3 {

    static double printAvarage(int[] arr) {

        double sum = arr[0];

        for (int i = 1; i < arr.length; i++){

            sum += arr[i];
        }

        return sum/arr.length;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("numbers in array:");
        int n = 3;

        System.out.println("input numbers:");
        int[] myArray = arrayFunctions.arrInput(n);

        System.out.println(printAvarage(myArray));
    }
}

