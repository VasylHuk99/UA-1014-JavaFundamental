package com.softserve.practical;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scan.nextLine();
        scan.close();
        System.out.println("You are " + answer);
    }
}
