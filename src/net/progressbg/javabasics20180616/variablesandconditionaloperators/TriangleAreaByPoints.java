/*
Напишете програма ,която чете 3 точки от равнината (x и y координатите), изчислява лицето на тригълника образуван от тези 3 точки.
Ако трите точки не сформират триъгълник ,да се изпише 0.

*/

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