package Day_17_While_DoWhile;

import java.util.Scanner;

public class DivisionTwoNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        int result = 0;


        while(num2>num1){
           num2-=num1;
           result++;
        }
        System.out.println(result);

        System.out.println(result+" with a remainder of "+num2);


    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */