/*

Да се напише програма, която на първия ред приема цяло число N,
което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива.
Програмата приема число, което трябва да бъде изтрито от масива.

 */

package net.progressbg.javabasics20180616.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRemoveANumber_Zad10 {

    static int[] removeNumber(int arr[], int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {

                for (int j = i; j < arr.length - 1; j++) {

                    arr[j] = arr[j + 1];
                }

                arr = Arrays.copyOf(arr, arr.length - 1);
                i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number array members:");
        int n = sc.nextInt();

        int[] myArray = new int[n];

        System.out.println("Imput array:");
        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = sc.nextInt();
        }


        System.out.println("Imput the number to remove:");
        int numberToRemove = sc.nextInt();


//        int[] newArray = removeNumber(myArray, numberToRemove);
        myArray = removeNumber(myArray, numberToRemove);


        System.out.println("Your new array is:");
        for (int i = 0; i < myArray.length; i++) {

            System.out.print(myArray[i] + " ");

        }


    }
}