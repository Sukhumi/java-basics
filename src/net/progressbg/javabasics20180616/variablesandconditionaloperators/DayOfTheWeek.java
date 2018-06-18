package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        int dayAsInt;

        Scanner sc = new Scanner(System.in);
        dayAsInt = sc.nextInt();

        switch (dayAsInt) {
            case 1:
                System.out.printf("Monday");
                break;
            case 2:
                System.out.printf("Tuesday");
                break;
            case 3:
                System.out.printf("Wednesday");
                break;
            case 4:
                System.out.printf("Thursday");
                break;
            case 5:
                System.out.printf("Friday");
                break;
            case 6:
                System.out.printf("Saturday");
                break;
            case 7:
                System.out.printf("Sunday");
                break;
            default:
                System.out.printf("Invalid input");
                break;
        }
    }
}
