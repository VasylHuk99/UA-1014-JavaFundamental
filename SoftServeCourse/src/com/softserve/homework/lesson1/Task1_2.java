package com.softserve.homework;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.printf("Where do you live,%s?%n",name);
        String address = scan.nextLine();
        scan.close();
        System.out.printf("Name:%s%nAddress:%s",name,address);
    }
}
