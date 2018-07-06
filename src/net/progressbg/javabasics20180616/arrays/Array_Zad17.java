/*

Да се напише програма, която на първия ред приема цяло число N,
което е големина на масив и после  N на брой числа, които трябва да се сложат в масива.
Програмата да промени всички въведени числа в масива след най-голямото число както следва:
нечетните числа в по-малкото четно число;
четните числа в по-голямото нечетно число;

 */

package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class Array_Zad17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("numbers in array:");
        int n = sc.nextInt();

        System.out.println("input array:");
        int[] myArray = arrayFunctions.arrInput(n);

        for (int i = arrayFunctions.positionLargestMember(myArray) + 1; i < myArray.length; i++) {

            if (myArray[i] % 2 == 0) {

                myArray[i]++;
            } else {

                myArray[i]--;
            }
        }

        arrayFunctions.arrPrint(myArray);

    }
}
