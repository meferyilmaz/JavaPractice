package Day_13_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");

        String firstWord = scan.next();

        System.out.println("Enter your second word");

        String secondWord = scan.next();

        System.out.println("Enter your third word");

        String thirdWord = scan.next();

        scan.close();

        int length1 = firstWord.length();
        int length2 = secondWord.length();
        int length3 = thirdWord.length();

        if (length1 == length2 && length2 == length3){
            System.out.println("All words are same length");
        }else if (length1 == length2){
            System.out.println("Not Same nor Different lengths");
        }else if (length2 == length3){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }








    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */