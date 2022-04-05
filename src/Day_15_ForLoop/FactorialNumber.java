package Day_15_ForLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");

        int num = scan.nextInt();

        int multiply = 1;

        for (int i = num ; i > 0 ; i--) {

            multiply *= i;

        }


        System.out.println("multiply = " + multiply);






    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */