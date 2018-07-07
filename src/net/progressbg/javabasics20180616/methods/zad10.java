package net.progressbg.javabasics20180616.methods;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class zad10 {

    static public String forString(String a, String b) {
        if (a.compareTo(b) > 0) return a;
        else return b;
    }

    static public int forInt(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    static public char forChar(char a, char b) {
        if (a > b) return a;
        else return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String index = sc.nextLine();
        index = index.toLowerCase();

        switch (index) {
            case "char": {
                char a = sc.nextLine().charAt(0);
                char b = sc.nextLine().charAt(0);
                System.out.println(forChar(a, b));
                break;
            }

            case "int": {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(forInt(a, b));
                break;
            }

            case "string": {
                String a = sc.nextLine();
                String b = sc.nextLine();
                System.out.println(forString(a, b));
                break;
            }
            default:
                System.out.println("Error");
                break;
        }
    }
}
