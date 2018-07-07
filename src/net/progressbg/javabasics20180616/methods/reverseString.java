package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class reverseString {

    public static String ReverseString(String str) {

        StringBuilder result = new StringBuilder();
        //code to reverse string
        for (int i = str.length() - 1; i >= 0; i--) {

            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(ReverseString(str));
    }

}