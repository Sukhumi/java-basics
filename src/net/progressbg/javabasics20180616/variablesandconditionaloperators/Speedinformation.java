/*
Да се напише програма, която въвежда скорост (десетично число) и отпечатва информация за скоростта. При скорост до 10 (включително)
отпечатайте “slow”. При скорост над 10 и до 50 отпечатайте “average”. При скорост над 50 и до 150 отпечатайте “fast”. При
скорост над 150 и до 1000 отпечатайте “ultra fast”. При по-висока скорост отпечатайте “extremely fast”.
*/

package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class Speedinformation {
    public static void main(String[] args) {
        double speed;

        Scanner sc = new Scanner(System.in);
        speed = sc.nextDouble();

        if (speed < 10) {
            System.out.printf("slow");
        } else if (speed < 50) {
            System.out.printf("average");
        } else if (speed < 150) {
            System.out.printf("fast");
        } else if (speed < 1000) {
            System.out.printf("ultra fast");
        } else {
            System.out.printf("extremely fast");
        }
    }
}
