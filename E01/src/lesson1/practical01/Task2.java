package lesson1.practical01;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int number1 = scan.nextInt();
        System.out.println("Input the second number: ");
        int number2 = scan.nextInt();
        System.out.println("Input the third number: ");
        int number3 = scan.nextInt();
        double average = (number1 + number2 + number3) / 3.0;
        System.out.println("The average is " + average);
    }
}