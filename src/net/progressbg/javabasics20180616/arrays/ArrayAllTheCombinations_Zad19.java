/*

Да се напише програма,
която изкарва всички възможни пароли на катинар с 4 цифри(всички стрингове с дължина 4 с цифрите от 1 до 9)

 */
package net.progressbg.javabasics20180616.arrays;

public class ArrayAllTheCombinations_Zad19 {

    static int firstNumber(int a) {
        return a / 1000;
    }

    static int secondNumber(int a) {
        return (a / 100) % 10;
    }

    static int thirdNumber(int a) {
        return (a / 10) % 10;
    }

    static int forthNumber(int a) {
        return a % 10;
    }

    public static void main(String[] args) {

        String[] myArray = new String[10000];

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = (
                    firstNumber(i) +
                            " " +
                            secondNumber(i) +
                            " " +
                            thirdNumber(i) +
                            " " +
                            forthNumber(i)
            );

        }

        for(int i=0; i<myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }

    }
}
