/*

Да се напише програма, която въвежда час и минути от 24-часово денонощие и изчислява колко ще е часът след 15 минути. Резултатът да се
отпечата във формат hh:mm. Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59. Часовете се изписват с една или две цифри.
Минутите се изписват винаги с по две цифри, с водеща нула когато е необходимо.

*/
package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;


public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        if ((hours < 0 && hours > 23) ||
        (minutes < 0 && minutes > 59)) {
            System.out.println("Invalid input");
        }

        minutes += 15;

        if(minutes > 59){
            hours++;
            minutes -= 60;
        }

        if(hours > 23){
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
