/*

Да се напише програма, която на първия ред приема цяло число N и заделя 2 масива с големина N.
После четем 2*N на брой числа, които трябва да се сложат в масивите.
Първо четем числата за първия масив, после за втория.
Програмата сравнява всички числа с еднакви индекси от двата масива и записва в трети масив, по-голямото от двете числа.

 */

package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class ArrayBiggestArray_Zad14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number array members:");
        int n = sc.nextInt();

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];
        int[] bigArray = new int[n];

        System.out.println("Input first array:");
        firstArray = arrayFunctions.arrInput(n);

        System.out.println("Input second array:");
        secondArray = arrayFunctions.arrInput(n);

        for (int i = 0; i < n; i++) {
            if (firstArray[i] > secondArray[i]) {

                bigArray[i] = firstArray[i];
            } else {

                bigArray[i] = secondArray[i];
            }
        }

        System.out.println("The big array is: ");
        arrayFunctions.arrPrint(bigArray);

    }

}
