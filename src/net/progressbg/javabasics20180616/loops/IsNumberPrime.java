package net.progressbg.javabasics20180616.loops;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        if(n == 1){
            isPrime = false;
        }

        int sqrtN = (int)Math.sqrt(n);

        for (int i = 2; i <= sqrtN; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);

        //TODO - use as method for show all prime numbers from 1 - n

    }
}
