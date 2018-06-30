package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;
/*
Да се напише програма, която на първия ред приема цяло число N,
 което е големина на масив и после  N на брой числа,
 които трябва да се сложат в масива.
  Програма трябва да направи всички четни числа на 0 и да изкара масива на екрана.
  Made by Niki :^]
 */
public class zadacha_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = sc.nextInt();
         if (myArray[i] %2 == 0) {
             myArray[i] = 0;
         }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
