package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class isLeapYear {

    static boolean isLeapYear(int a) {
        if (a > 7) {
            if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {

                return true;

            } else return false;
        }
        if (a == -45 ||
                a == -42 ||
                a == -39 ||
                a == -36 ||
                a == -33 ||
                a == -30 ||
                a == -27 ||
                a == -24 ||
                a == -21 ||
                a == -18 ||
                a == -15 ||
                a == -12 ||
                a == -9) {
            return true;
        } else return false;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < -45) {

            System.out.println("Leap Years were invented 46 BC, first is 45 BC");

        } else System.out.println(isLeapYear(n));
    }
}
