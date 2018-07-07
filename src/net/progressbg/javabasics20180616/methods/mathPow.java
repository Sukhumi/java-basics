package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class mathPow {
    static double mathPow(int a, int b) {
        double result = 1;
        if (b > -1) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else {
            for (int i = 0; i < -b; i++) {
                result /= a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(mathPow(a, b));
    }
}
