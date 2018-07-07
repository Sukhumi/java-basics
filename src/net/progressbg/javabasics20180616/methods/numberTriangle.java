package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class numberTriangle {

    static void printNumberLine(int a) {
        for (int i = 1; i <= a; i++)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int i=1;

        boolean flag = true;

        while (i>0)
        {
            printNumberLine(i);
            System.out.println("");

            if (i == number)flag = false;

            if (flag) i++;
            else i--;
        }

    }
}
