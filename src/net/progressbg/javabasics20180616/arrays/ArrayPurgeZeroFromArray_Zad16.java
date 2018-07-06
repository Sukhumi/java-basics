/*

Да се напише програма, която на първия ред приема цяло число N,
което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива.
Да се премахнат всички елементи със стойност 0 от масива.(Да не се ползва допълнителен масив).

 */

package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class ArrayPurgeZeroFromArray_Zad16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("numbers in array:");
        int n = sc.nextInt();

        System.out.println("input array:");
        int[] myArray = arrayFunctions.arrInput(n);

        myArray = ArrayRemoveANumber_Zad10.removeNumber(myArray, 0);

        System.out.println("array after zero purge: ");
        arrayFunctions.arrPrint(myArray);
    }
}
