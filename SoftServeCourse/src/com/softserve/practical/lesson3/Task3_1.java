import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        int a = Task3_1.getNumber("Enter the first number:");
        int b = Task3_1.getNumber("Enter the second number:");
        Task3_1 task = new Task3_1();
        double average = task.getAverage(a,b);
        int sum = task.getTotal(a,b);
        System.out.printf("The sum of %d and %d is %d%nThe average of %d and %d is %.2f",a,b,sum,a,b,average);

    }

    /**
     * Find the total sum of two numbers
     * @param a The first number
     * @param b The second number
     * @return their sum
     */
    public int getTotal(int a,int b){
        return a + b;
    }

    /**
     * Return average of two numbers,accepts integer return double
     * @param a first number
     * @param b second number
     * @return their average
     */
    public double getAverage(int a,int b){
        return (double)(a + b) / 2;
    }

    /**
     * Allows input of numbers using scanner
     * @param prompt message before entering number
     * @return entering number
     */
    static int getNumber(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextInt();
    }
}
