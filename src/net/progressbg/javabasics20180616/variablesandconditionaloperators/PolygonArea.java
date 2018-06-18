package net.progressbg.javabasics20180616.variablesandconditionaloperators;

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        String polygonType;

        Scanner sc = new Scanner(System.in);
        polygonType = sc.nextLine();

        switch (polygonType){
            case "square" : {
                double side = sc.nextDouble();
                System.out.println(side * side);
                break;
            }
            case "rectangle" : {
                double firstSide = sc.nextDouble();
                double secondSide = sc.nextDouble();

                System.out.println(firstSide * secondSide);
                break;
            }
            case "circle" : {
                double radius = sc.nextDouble();

                System.out.println(Math.PI * radius * radius);
                break;
            }
            case "triangle" : {
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
