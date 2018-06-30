package net.progressbg.javabasics20180616.arrays;

import java.util.Scanner;

/*
Да се напише програма, която на първия ред приема цяло число N,
 което е големина на масив и после  N на брой числа, които трябва
  да се сложат в масива. Програма трябва да размени местата на
   най-големия и най-малкия елемент и да изкара масива на екрана.
   Ако има два най-малки или два най-големи да се разменят местата на най-десните.
   Made by Djuni;
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < myArr.length;i++) {
            myArr[i] = sc.nextInt();
            if(myArr[i] >= max) {
                max = myArr[i];
                index1 = i;
            }
            if(myArr[i] <= min) {
                min = myArr[i];
                index2 = i;
            }

        }

        int temp = myArr[index1];
        myArr[index1] = myArr[index2];
        myArr[index2] = temp;

        for(int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}
