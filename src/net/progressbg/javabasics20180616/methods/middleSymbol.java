package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class middleSymbol {

    static void printMid(String a)
    {
        if (a.length()%2==0){
            System.out.print(a.charAt(a.length()/2-1));
        }
        System.out.println(a.charAt(a.length()/2));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myStr = sc.nextLine();

        printMid(myStr);
        System.out.println(myStr.length());
    }
}

