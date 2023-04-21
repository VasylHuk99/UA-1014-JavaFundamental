import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {

        areaAndPerimeterOfCircle();
        // meetPerson();
        // callCost();
    }

    public static void areaAndPerimeterOfCircle() {

        Scanner scann = new Scanner(System.in);
        
        System.out.println("Please enter the radius:");
        double radius = scann.nextDouble();
        double perimeterResult = Math.round((2 * Math.PI * radius) * 100.0) / 100.0;
        double areaResult = Math.round((Math.PI * radius * radius) * 100.0) / 100.0;
        System.out.println("\nThe perimeter of circle equals: " + perimeterResult);
        System.out.println("\nThe area of circle equals: " + areaResult);
        scann.close();
    }
    
    public static void meetPerson() {
        
        String name = "";
        String adress = "";

        Scanner scann = new Scanner(System.in);

        System.out.println("What is your name?");
        name = scann.nextLine();
        System.out.println("\nWhere do you live, " + name + "?");
        adress = scann.nextLine();
        System.out.println("Your name is " + name + " and you are from " + adress + ".");
        scann.close();
    }
    
    public static void callCost() {
        
        Scanner scann = new Scanner(System.in);
        
        int c1;
        int c2;
        int c3;
        int d1;
        int d2;
        int d3;
        int totalCost;
        int totalMinutes;
        
        System.out.println("Please enter the call price to Germany:");
        c1 = scann.nextInt();
        System.out.println("Please enter the duration of call in minutes");
        d1 = scann.nextInt();
        System.out.println("Please enter the call price to Ukraine:");
        c2 = scann.nextInt();
        System.out.println("Please enter the duration of call in minutes");
        d2 = scann.nextInt();
        System.out.println("Please enter the call price to Spain:");
        c3 = scann.nextInt();
        System.out.println("Please enter the duration of call in minutes");
        d3 = scann.nextInt();
        
        int costGermany = c1 * d1;
        int costUkraine = c2 * d2;
        int costSpain = c3 * d3;
        totalMinutes = d1 + d2 + d3;
        totalCost = costGermany + costSpain + costUkraine;

        System.out.println("The call to Germany with duration of " + d1 + " minutes costs $" + costGermany);
        System.out.println("The call to Ukraine with duration of " + d2 + " minutes costs $" + costUkraine);
        System.out.println("The call to Spain with duration of " + d3 + " minutes costs $" + costSpain);
        System.out.println("The total cost for " + totalMinutes + " minutes is: $" + totalCost);
        scann.close();
    }
}