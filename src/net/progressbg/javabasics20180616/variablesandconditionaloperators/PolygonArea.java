/*
Да се напише програма, която въвежда размерите на геометрична фигура и пресмята лицето й. Фигурите са четири вида: квадрат (square),
правоъгълник (rectangle), кръг (circle) и триъгълник (triangle). На първия ред на входа се чете вида на фигурата (square, rectangle,
circle или triangle). Ако фигурата е квадрат, на следващия ред се чете едно число – дължина на страната му. Ако фигурата е правоъгълник,
на следващите два реда четат две числа – дължините на страните му. Ако фигурата е кръг, на следващия ред чете едно число – радиусът на кръга.
Ако фигурата е триъгълник, на следващите два реда четат две числа – дължината на страната му и дължината на височината към нея. Резултатът да се
закръгли до 3 цифри след десетичната точка.
*/

package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        String polygonType;

        Scanner sc = new Scanner(System.in);
        polygonType = sc.nextLine();

        switch (polygonType) {
            case "square": {
                double side = sc.nextDouble();
                System.out.println(side * side);
                break;
            }
            case "rectangle": {
                double firstSide = sc.nextDouble();
                double secondSide = sc.nextDouble();

                System.out.println(firstSide * secondSide);
                break;
            }
            case "circle": {
                double radius = sc.nextDouble();

                System.out.println(Math.PI * radius * radius);
                break;
            }
            case "triangle": {
                double side = sc.nextDouble();
                double height = sc.nextDouble();

                System.out.println(side * height / 2);
                break;
            }
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
