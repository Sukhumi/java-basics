package net.progressbg.javabasics20180616.loops;

import java.util.Scanner;

public class PrintFirst_n_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.MAX_VALUE;
        long first = 1;
        long second = 0;

        for(int i = 1;i <= n;i++)
        {
            long result = first + second;
            first = second;
            second = result;
            System.out.print(result +" ");

        }}
}
