/*

Функции от мързел

 */

package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class arrayFunctions {

    static int positionLargestMember(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {

                largest = arr[i];
                position = i;
            }
        }

        return position;

    }


    static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n == 1) {
            isPrime = false;
        }

        int sqrtN = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return (isPrime);
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static int[] arrInput(int length) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {

            arr[i] = sc.nextInt();
        }

        return arr;

    }


    static void arrPrint(int arr[]) {

        for (int i : arr) {

            System.out.print(i + " ");
        }

    }

}