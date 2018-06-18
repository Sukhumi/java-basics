package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber;

        Scanner sc = new Scanner(System.in);
        firstNumber = sc.nextDouble();
        secondNumber = sc.nextDouble();
        thirdNumber = sc.nextDouble();

        if(firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
