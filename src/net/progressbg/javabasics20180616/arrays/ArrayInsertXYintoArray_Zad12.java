/*

Да се напише програма,
която на първия ред приема цяло число N и заделете масив с големина N+1
и после  N на брой числа, които трябва да се сложат в масива.
Програмата приема число x и y и числото x трябва да бъде вмъкнато на позиция y.

 */

package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class ArrayInsertXYintoArray_Zad12 {

    static int[] arrInput(int length) {

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


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number array members:");
        int n = sc.nextInt();

        int[] myArray = new int[n];

        System.out.println("Input array:");
        myArray = arrInput(n);

        System.out.println("Input the number to shove in array:");
        int insert = sc.nextInt();

        System.out.println("Input location to insert");
        myArray[sc.nextInt() - 1] = insert;

        System.out.println("Your new array is:");
        arrPrint(myArray);

    }
}
