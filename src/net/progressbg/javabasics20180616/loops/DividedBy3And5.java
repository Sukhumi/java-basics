package net.progressbg.javabasics20180616.loops;

import java.util.Scanner;

public class DividedBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i %3 == 0 && i %5 == 0){
                System.out.println(i);
            }
        }
    }
}