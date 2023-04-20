package lesson1.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Whar is your name?");
        String name = scan.nextLine();
        System.out.println ("Where do you live, " + name + "?");
        String address = scan.nextLine();
        System.out.println ("Mister (Missis) " + name + " lives in " + address);
    }
}
