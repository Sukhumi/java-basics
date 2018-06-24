package net.progressbg.javabasics20180616.loops;
/*
Задача 2
Да се напише програма, която чака да прочете число, което е валидна оценка от училище.
Докато не прочете такава, програмата изписва съответно съобщение за грешка. Ако числото,
което е въвел потребителят, е под 2 да изведе "Invalid input. The number is less than 2."
Ако потребителят е въвел число по-голямо от 6 да се извежда "Invalid input.The number is bigger than 6."
След като прочете валидната оценка програмата да изпише с думи значението на оценката(Excellent, Very good, good...)
*/
import java.util.Scanner;
public class GetGradeStringType {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int input;

            System.out.println("Enter Number: ");
            input = sc.nextInt();

            while (input >= 2 && input <= 6) {

                switch (input) {
                    case 2:
                        System.out.println("Failed");
                        input = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Not good");
                        input = sc.nextInt();
                        break;
                    case 4:
                        System.out.println("good");
                        input = sc.nextInt();
                        break;
                    case 5:
                        System.out.println("Very good");
                        input = sc.nextInt();
                        break;
                    case 6:
                        System.out.println("Excellent");
                        input = sc.nextInt();
                        break;
                    default:
                        break;
                }
            }
            if (input < 2) {
                System.out.println("Invalid input. The number is less than 2.");
            } else {
                System.out.println("Invalid input.The number is bigger than 6.");
            }
        }
    }