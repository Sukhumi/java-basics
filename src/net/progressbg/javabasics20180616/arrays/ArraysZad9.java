package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class ArraysZad9 {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int findGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] myArray = new int[n];
        int gcd = 0;
        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = sc.nextInt();
        }


        gcd = findGCD(myArray, n);

        for (int i = 2; i <= gcd; i++) {

            if (gcd % i == 0) System.out.println(i);
        }
    }
}