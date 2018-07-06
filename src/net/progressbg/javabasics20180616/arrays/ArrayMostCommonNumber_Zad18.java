/*

Да се напише програма, която на първия ред приема цяло число N,
което е големина на масив и после  N на брой числа, които трябва да се сложат в масива.
Програмата изважда на екрана най-често срещаното число.

 */
package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class ArrayMostCommonNumber_Zad18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("numbers in array:");
        int n = sc.nextInt();

        System.out.println("input array:");
        int[] myArray = arrayFunctions.arrInput(n);

        int[] occuranceArray = new int[n];

        for (int i = 0; i < myArray.length; i++) {

            occuranceArray[i] = 0;

            for (int j = i; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]){

                    occuranceArray[i]++;
                }

            }

        }

        System.out.println(myArray[arrayFunctions.positionLargestMember(occuranceArray)]);

    }
}
