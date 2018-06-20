/*
Да се напише програма, която въвежда цяло число и проверява дали е под 100, между 100 и 200 или над 200.
*/

package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class NumbersFrom100To200 {

    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number < 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 20");
        }
    }
}
