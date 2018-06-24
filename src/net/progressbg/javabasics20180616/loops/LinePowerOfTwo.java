package net.progressbg.javabasics20180616.loops;

//Да се изведе следната редица, използвайкли цикъл while 1 2 4 8 16 32 64 128 256 512

public class LinePowerOfTwo {
    public static void main(String[] args) {


        //Using Math.pow function
        int a = 0;
        while (a < 10) {
            System.out.println(Math.pow(2, a));
            a++;
        }


        //without Math.pow
        a = 0;
        int b = 1;
        while (a < 10) {
            System.out.println(b);
            b *= 2;
            a++;
        }
    }
}