import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        // printReverse();
        // averageOfNumbers();
        // calculateInput();
        // askQuestion();
    }
    
    public static void printReverse() {
        
        System.out.println("Hello! Please enter 3 strings:\n");
        Scanner scann = new Scanner(System.in);

        String thirdtOutput = scann.nextLine();
        String secondOutput = scann.nextLine();
        String firstOutput = scann.nextLine();

        System.out.println("\nThank you! The output is:");
        System.out.println("\n\t" + firstOutput);
        System.out.println("\n\t" + secondOutput);
        System.out.println("\n\t" + thirdtOutput);
    }

    public static void averageOfNumbers() {
        Scanner scann = new Scanner(System.in);

        System.out.println("Input first number:");
        int firstNumber = scann.nextInt();
        System.out.println("\nInput second number:");
        int secondNumber = scann.nextInt();
        System.out.println("\nInput third number:");
        int thirdNumber = scann.nextInt();
        
        double result = (double)(firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("\nAverage is: " + result);
    }

    public static void calculateInput() {

        Scanner scann = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int a = scann.nextInt();
        System.out.println("Please enter second number:");
        int b = scann.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (double)(a / b));
    }

    public static void askQuestion() {

        Scanner scann = new Scanner(System.in);

        System.out.println("How are you?");
        String respond = scann.nextLine();
        System.out.println("\nYou are " + respond + ".");
    }    
}