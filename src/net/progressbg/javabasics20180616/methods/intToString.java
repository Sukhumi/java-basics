package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class intToString {
    static String intString(int a) {

        int digits = 1;

        StringBuilder result = new StringBuilder();

        while (a % Math.pow(10, digits) != a)
            digits++;

        for (; digits > 0; digits--) {

            result.append((int)(a / Math.pow(10, digits - 1) % 10));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myInt = sc.nextInt();

        System.out.println(intString(myInt));

    }
}
