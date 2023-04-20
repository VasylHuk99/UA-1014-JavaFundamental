package lesson1.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double duration[] = new double[3];
        double cost_per_minute[] = new double[3];
        double sum = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter the duration of the " + i + " call: ");
            duration[i - 1] = scan.nextDouble();
            System.out.println("Enter the cost per minute for the " + i + " first call: ");
            cost_per_minute[i - 1] = scan.nextDouble();
        }
        for (int i = 1; i < 4; i++) {
            double cost = duration[i - 1] * cost_per_minute[i - 1];
            System.out.println("The cost of the " + i + " call is :" + cost);
            sum = sum + cost;
        }
        System.out.println("The total cost is: " + sum);
    }
}
