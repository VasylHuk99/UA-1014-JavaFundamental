package lesson1.practical01;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("How are you?");
        String answer = scan.nextLine();
        System.out.println ("You are " + answer);
        }
}
