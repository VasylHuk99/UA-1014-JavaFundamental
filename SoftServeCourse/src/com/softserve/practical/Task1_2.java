package com.softserve.practical;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number:");
        int num3 = scan.nextInt();
        scan.close();
        double average = (double)(num1 + num3 + num2) / 3;
        System.out.printf("Average value = %f",average);
    }
}
