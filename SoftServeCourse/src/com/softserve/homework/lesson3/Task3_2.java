import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number");
        int num3 = scan.nextInt();
        scan.close();
        System.out.printf("The smallest number is %d",Task3_2.getSmallestNum(num1,num2,num3));
    }

    /**Uses Math.min() for finds smallest number.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return smallest number of three numbers
     */
    public static int getSmallestNum(int a,int b,int c){
        int d = Math.min(a,b);
        return Math.min(d,c);
    }
}
