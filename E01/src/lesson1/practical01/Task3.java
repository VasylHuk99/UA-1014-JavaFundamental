package lesson1.practical01;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println ("Input the first number a: ");
        int number1 = scan.nextInt();
        System.out.println ("Input the second number b: ");
        int number2 = scan.nextInt();
        System.out.println ("a + b = " +  (number1+number2));
        System.out.println ("a - b = " +  (number1-number2));
        System.out.println ("a * b = " +  (number1*number2));
        if (number2 !=0) {
            System.out.println ("a / b = " +  (double) number1/number2);
        }
        else System.out.println ("Cannot be divided by zero");
   }
}

