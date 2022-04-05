package Day_16_ForLoopStringPractice;

import java.util.Scanner;

public class TwoPosNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        int result = 0;

        for (int i = 0; i < num2; i++) {
            result += num1;

        }

        if (result>0){
            System.out.println("Multiplication = " + result);
        }else if (result<0){
            System.out.println("Invalid");
        }












    }
}
/*
. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */