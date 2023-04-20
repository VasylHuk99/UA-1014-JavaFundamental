package com.softserve.Lesson01.Practicaltasks01;

import java.util.Scanner;

public class Edu01Program01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = new String[3];

        System.out.println("Input text:");
        for (int i = 0; i < 3; i++) {
            arrStr[i] = scanner.nextLine();
        }

        System.out.println("Output text:");
        for (int i = 2; i >= 0; i--) {
            System.out.println(arrStr[i]);
        }
    }
}
