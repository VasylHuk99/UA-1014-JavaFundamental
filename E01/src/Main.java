import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the first line: ");
        String line1 = scan.nextLine();
        System.out.println ("Enter the second line: ");
        String line2 = scan.nextLine();
        System.out.println ("Enter the third line: ");
        String line3 = scan.nextLine();
        System.out.println (line3 + "\n" + line2 + "\n" + line1);
    }
}
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Input the first number: ");
        int number1 = scan.nextInt();
        System.out.println ("Input the second number: ");
        int number2 = scan.nextInt();
        System.out.println ("Input the third number: ");
        int number3 = scan.nextInt();
        double average = (number1+number2+number3)/3.0;
        System.out.println ("The average is " +  average);
    }
}

 */
/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Input the first number a: ");
        int number1 = scan.nextInt();
        System.out.println ("Input the second number b: ");
        int number2 = scan.nextInt();
        System.out.println ("a + b = " +  (number1+number2));
        System.out.println ("a - b = " +  (number1-number2));
        System.out.println ("a * b = " +  (number1*number2));
        if (number2 !=0) {
            System.out.println ("a / b = " +  (double) number1/number2);
        }
        else System.out.println ("Cannot be divided by zero");
   }
}

 */

/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("How are you?");
        String answer = scan.nextLine();
        System.out.println ("You are " + answer);
        }
}

 */

/*public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter the radius of the circle: ");
        double radius = Double.parseDouble(scan.nextLine());
        System.out.println ("The perimetr is " + 2*Math.PI*radius);
        System.out.println ("The area is " + Math.PI*radius*radius);
    }
}


 */

/*public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Whar is your name?");
        String name = scan.nextLine();
        System.out.println ("Where do you live, " + name + "?");
        String address = scan.nextLine();
        System.out.println ("Mister (Missis) " + name + " lives in " + address);
    }
}

 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double duration[] = new double[3];
        double cost_per_minute[] = new double[3];
        double sum=0;
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

