package com.softserve.homework;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much is the first call cost per minute and how long is it?");
        int c1 = scan.nextInt();
        int t1 = scan.nextInt();
        System.out.println("How much is the second call cost per minute and how long is it?");
        int c2 = scan.nextInt();
        int t2 = scan.nextInt();
        System.out.println("How much is the third call cost per minute and how long is it?");
        int c3 = scan.nextInt();
        int t3 = scan.nextInt();
        scan.close();
        int call1 = c1 * t1;
        int call2 = c2 * t2;
        int call3 = c3 * t3;
        int allCall = call1 + call2 + call3;

        System.out.printf("The coast of the first call = %d$;%nThe coast of the second call = %d$;%nThe coast of the third call = %d$;%nTotal cost of all calls = %d$",call1,call2,call3,allCall);
    }
}
