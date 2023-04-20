import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task ");
            System.out.println("\t2 - Check second practical task");
            System.out.println("\t3 - Check third practical task");
            System.out.println("\t4 - Check fourth practical task");
            System.out.println("\t5 - Check  first home task");
            System.out.println("\t6 - Check  second home task");
            System.out.println("\t7 - Check  third home task");
            System.out.println("\t8 - End work ");
            int choice = sc.nextInt();

            switch (choice) {
                case 8:
                    sc.close();
                    return;
                case 1:
                    firstPracticalTask(scanner);
                    break;
                case 2:
                    secondPracticalTask(scanner);
                    break;
                case 3:
                    thirdPracticalTask(scanner);
                    break;
                case 4:
                    fourthPracticalTask(scanner);
                    break;
                case 5:
                    firstHomeTask(scanner);
                    break;
                case 6:
                    secondHomeTask(scanner);
                    break;
                case 7:
                    thirdHomeTask(scanner);
                    break;
                default:
                    System.out.println("Necessary to enter option 1-8\n");
            }
        }
    }
    public static void firstPracticalTask(Scanner scanner){
        String word1, word2,word3;
        System.out.println("enter text");
        word1=scanner.nextLine();
        word2=scanner.nextLine();
        word3=scanner.nextLine();
        System.out.println("output text");
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);

    }
    public static void secondPracticalTask(Scanner scanner){
        double a,b,c;
        double average;
        System.out.println("enter first num");
        a=scanner.nextDouble();
        System.out.println("enter second num");
        b=scanner.nextDouble();
        System.out.println("enter third num");
        c=scanner.nextDouble();
        average=(a+b+c)/3;
        System.out.println("average is " +average);
    }
    public static void thirdPracticalTask(Scanner scanner){
        double a,b;
        double sum, difference, multiplication,division;
        System.out.println("enter first num");
        a=scanner.nextDouble();
        System.out.println("enter second num");
        b=scanner.nextDouble();
        sum=a+b;
        difference=a-b;
        multiplication=a*b;
        division=a/b;
        System.out.println("a+b="+ sum);
        System.out.println("a-b="+ difference);
        System.out.println("a*b="+ multiplication);
        System.out.println("a/b="+ division);

    }
    public static void  fourthPracticalTask(Scanner scanner){
        String answer;
        System.out.println("How are you");
        answer=scanner.nextLine();
        System.out.print("You are "+answer);
    }
    public static void firstHomeTask(Scanner scanner){
        double radius, result1,result2;
        System.out.println("enter radius");
        radius=scanner.nextDouble();
        result1=Math.PI*Math.pow(radius,2);
        result2=2*Math.PI*radius;
        System.out.println("perimeter is "+result2 +"\n area is "+ result1);
    }
    public static void secondHomeTask(Scanner scanner){
        String name;
        String address;
        System.out.println("What is your name?");
        name=scanner.nextLine();
        System.out.println("Where do you live "+name);
        address=scanner.nextLine();
        System.out.println("Your name is "+name+"\nYour address is "+ address);
    }
    public static void thirdHomeTask(Scanner scanner){
        double c1,c2,c3,t1,t2,t3,r1,r2,r3;
        System.out.println("Enter cost and time first call");
        System.out.print("Enter cost per/min ");
        c1= scanner.nextDouble();
        System.out.print("Enter time ");
        t1= scanner.nextDouble();
        System.out.println("Enter cost second call");
        System.out.print("Enter cost per/min ");
        c2= scanner.nextDouble();
        System.out.print("Enter time ");
        t2= scanner.nextDouble();
        System.out.println("Enter cost third call");
        System.out.print("Enter cost per/min ");
        c3= scanner.nextDouble();
        System.out.print("Enter time ");
        t3= scanner.nextDouble();
        r1=t1*c1;
        r2=t2*c2;
        r3=t3*c3;
        System.out.println("First next cost is "+r1);
        System.out.println("Second next cost is "+r2);
        System.out.println("Third next cost is "+r3);
    }

}