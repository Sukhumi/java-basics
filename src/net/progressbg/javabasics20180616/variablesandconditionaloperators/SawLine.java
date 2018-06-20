/*
 Ще казваме,че поредица от числа е трион,ако всяко число в нея е едновременно по-голямо или равно от двата си
 съседа или пък едновременно по-малко или равно от тях.За първия и последния елемент имаме само по един съсед.За
 определеност,считаме,че празната редица и всяка редица съставена само от един елемент също са трион.Например дадените
 по-долу редица са триони:
*/
package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;


public class SawLine {
    public static void main(String[] args) {
        int a, b, c, d, e;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        if ((b >= a && b >= c) && (d >= c && d >= e) ||
                (b >= a && b >= c) && (d >= c && d >= e)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
