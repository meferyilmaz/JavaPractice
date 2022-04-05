package Day_13_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");

        String firstWord = scan.next();

        System.out.println("Enter your second word");

        String secondWord = scan.next();

        int totalChar1 = firstWord.length();
        int totalChar2 = secondWord.length();

        if (totalChar1 > totalChar2){
            System.out.println(firstWord);
        }else{
            System.out.println(secondWord);
        }









    }
}
