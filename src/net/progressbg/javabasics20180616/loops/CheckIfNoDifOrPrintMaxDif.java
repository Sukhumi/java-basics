package net.progressbg.javabasics20180616.loops;

import java.util.Scanner;

public class CheckIfNoDifOrPrintMaxDif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = first + second;
            if (result > max) {
                max = result;
            }
            if (result < min) {
                min = result;
            }
        }
        if (max - min == 0) {
            System.out.println("Yes, value=" + max);
        } else {
            System.out.println("No, maxdiff=" + (max - min));
        }
    }
}
