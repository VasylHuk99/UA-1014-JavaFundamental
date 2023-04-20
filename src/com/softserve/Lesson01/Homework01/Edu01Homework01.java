package com.softserve.Lesson01.Homework01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Edu01Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double perimeterCircle, areaCircle;
        try {
            System.out.print("Input the radius = ");
            double number = scanner.nextDouble();

            perimeterCircle = perimeter(number);
            areaCircle = area(number);
            System.out.printf("Perimeter = %.2f\nArea = %.2f", perimeterCircle, areaCircle);

        } catch (InputMismatchException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }

    public static double perimeter(double numb) {
        return 2 * Math.PI * numb;
    }

    public static double area(double numb) {
        return Math.PI * Math.pow(numb, 2);
    }
}
