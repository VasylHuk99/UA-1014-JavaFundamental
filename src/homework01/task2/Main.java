package homework01.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name +"?");
        String address = scanner.nextLine();

        System.out.println("Your name is " + name + "\nYour address: " + address);
    }
}