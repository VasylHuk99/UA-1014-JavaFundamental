import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first side:");
        double a = scan.nextDouble();
        System.out.println("Enter the second side:");
        double b = scan.nextDouble();
        System.out.println("Enter the third side");
        double c = scan.nextDouble();
        scan.close();
        System.out.printf("Area of the triangle is %2f",Task3_1.getArea(a,b,c));
    }

    /**Finds and returns area of a triangle using Heron's formula
     *
     * @param a first side of a triangle
     * @param b second side of a triangle
     * @param c third side of a triangle
     * @return area of a triangle
     */
    public static double getArea(double a,double b,double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

