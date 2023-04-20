package com.softserve.practical;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi,please enter two numbers.\nFirst number: ");
        int num1 = scan.nextInt();
        System.out.println("Second number:");
        int num2 = scan.nextInt();
        scan.close();
        System.out.printf("The first number = %d,the second number = %d%n",num1,num2);
        System.out.printf("%d + %d = %d%n",num1,num2,(num1 + num2));
        System.out.printf("%d - %d = %d%n",num1,num2,(num1 - num2));
        System.out.printf("%d * %d = %d%n",num1,num2,(num1 * num2));
        System.out.printf("%d / %d = %f",num1,num2,((double)num1 / num2));
    }
}
