package com.softserve.homework;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println("Enter radius of the flower bed:");
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        scan.close();
        double area = Math.PI * (radius * radius);
        System.out.printf("S = %f",area);
    }
}
