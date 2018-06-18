package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class TriangleAreaByPoints{
    public static void main(String[] args) {
        int ax, ay, bx, by, cx, cy;

        Scanner sc = new Scanner(System.in);

        ax = sc.nextInt();
        ay = sc.nextInt();
        bx = sc.nextInt();
        by = sc.nextInt();
        cx = sc.nextInt();
        cy = sc.nextInt();

        double area = Math.abs(
                (ax * (cy - by) + bx * (cy - by) + cx * (ay - by)) / 2
        );

        System.out.println(area);
    }
}