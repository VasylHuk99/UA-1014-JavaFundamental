package lesson1.practical01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first line: ");
        String line1 = scan.nextLine();
        System.out.println("Enter the second line: ");
        String line2 = scan.nextLine();
        System.out.println("Enter the third line: ");
        String line3 = scan.nextLine();
        System.out.println(line3 + "\n" + line2 + "\n" + line1);
    }

}
