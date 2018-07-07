package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class farToCel {

    static public double farToCel(double a)
    {
        return ((a - 32) * 5 / 9);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();

        System.out.printf("%.2f",farToCel(temperature));
    }
}
