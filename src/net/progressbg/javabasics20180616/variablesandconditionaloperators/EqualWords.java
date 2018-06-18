package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        String firstWord;
        String secondWord;

        Scanner sc = new Scanner(System.in);

        firstWord = sc.nextLine();
        secondWord = sc.nextLine();

        if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
