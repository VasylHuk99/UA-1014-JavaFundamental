package com.softserve.practical;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        String word3 = scan.nextLine();
        scan.close();
        System.out.printf("%s%n%s%n%s",word3,word2,word1);
    }
}
