package Day_16_ForLoopStringPractice;

import java.util.Scanner;

public class PozAndNegNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pozNum = 0;
        int negNum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num > 0){

                pozNum++;

            }else if (num<0){
                negNum++;
            }

            System.out.println(pozNum+ " positive and "+negNum + " negative");


        }

























    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */