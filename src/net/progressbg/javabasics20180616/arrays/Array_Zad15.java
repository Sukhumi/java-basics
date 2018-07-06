/*

Да се напише програма, която на първия ред приема цяло число N и заделя 2 масива с големина N и големина N*2.
После четем 3*N на брой числа, които трябва да се сложат в масивите.
Първо четем числата за първия масив(първите N числа) , после за втория.
Програмата проверява дали всички числа от първия масив се съдържат във втория масив,
т.е. дали първият масив е подмножество на втория.

 */
package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

public class Array_Zad15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number array members:");
        int n = sc.nextInt();

        int[] firstArray = new int[n];
        int[] secondArray = new int[n * 2];
        boolean isFirstinSecond = false;

        System.out.println("Input first array:");
        firstArray = arrayFunctions.arrInput(n);

        System.out.println("Input second array:");
        secondArray = arrayFunctions.arrInput(2 * n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < secondArray.length; j++) {

                if (firstArray[i] == secondArray[j]) {

                    isFirstinSecond = true;
                    break;

                } else {

                    isFirstinSecond = false;

                }
            }

            if (!isFirstinSecond) {
                break;
            }
        }

        System.out.println(isFirstinSecond);

    }

}
