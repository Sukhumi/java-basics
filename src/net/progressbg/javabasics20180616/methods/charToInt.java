package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class charToInt {
    static int ConvertCharToInt(char a) {
        int b = a;
        if(b>96)b-=96;
        else b-=38;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.nextLine().charAt(0);
        System.out.println(ConvertCharToInt(input));
    }
}
