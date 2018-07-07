package net.progressbg.javabasics20180616.methods;

import java.util.Scanner;

public class sumOfDigits {

    static int sumDigits(int a){
        int sum=0;
        while (a>9){
            sum += a%10;
            a/=10;
        }
        sum += a;
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(sumDigits(a));

    }
}
