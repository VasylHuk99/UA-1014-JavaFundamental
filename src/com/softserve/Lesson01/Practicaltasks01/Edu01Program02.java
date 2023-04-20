package com.softserve.Lesson01.Practicaltasks01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Edu01Program02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = {"first", "second", "third"};
        double[] array = new double[3];
        double average = 0;
        try {
            for (int i = 0; i < 3; i++) {
                System.out.printf("Input %s number:\n", arrStr[i]);
                average += scanner.nextDouble();
            }
            System.out.println("Average is " + average / array.length);

        } catch (InputMismatchException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }
}
