/*

Да се напише програма, която на първия ред приема цяло число N,
което е големина на масив и после  N на брой числа, които трябва да се сложат в масива.
Програмата да изведе всички прости, неповтарящи се делители на сумата от въведените числа.

 */

package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class ArrayPrimeDenominatorsOfSum_Zad13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number array members:");
        int n = sc.nextInt();
        int sum = 0;

        int[] myArray = new int[n];

        System.out.println("Input array:");
        myArray = arrayFunctions.arrInput(n);

        for (int i : myArray) {
            sum += i;

        }

        System.out.print("The prime denominators of sum: ");
        int limit = sum / 2;

        for (int i = 1; i < limit; i++) {
            if (sum % i == 0 && arrayFunctions.isPrime(i))
                System.out.print(i + " ");
        }

        if (arrayFunctions.isPrime(sum))
            System.out.print(sum);
    }

}
