package net.progressbg.javabasics20180616.methods;

import net.progressbg.javabasics20180616.arrays.arrayFunctions;

import java.util.Scanner;

public class isNumberPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(arrayFunctions.isPrime(number));

    }
}

