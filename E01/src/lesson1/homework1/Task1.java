package lesson1.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the radius of the circle: ");
        double radius = Double.parseDouble(scan.nextLine());
        System.out.println ("The perimetr is " + 2*Math.PI*radius);
        System.out.println ("The area is " + Math.PI*radius*radius);
    }
}
