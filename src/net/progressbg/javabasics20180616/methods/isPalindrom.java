package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class isPalindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();

        String mirrorString = reverseString.ReverseString(myString);

        if(mirrorString.equalsIgnoreCase(myString)) System.out.println("True");

        else System.out.println("False");


    }
}