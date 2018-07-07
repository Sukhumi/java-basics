/*

Напишете функция, която приема аргумент цяло число и връща като резултат дали
числото е положително или отрицателно.Резултатът да се изпечата на екрана.

 */
package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class IsPositive {
    static String isPositive(int a) {
        if (a < 0) return " is negative.";
        else {
            if (a == 0) return " is Zero.";
            else return " is positive.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("The Number " + number + isPositive(number));
    }
}
