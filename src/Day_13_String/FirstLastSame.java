package Day_13_String;

import java.util.Scanner;

public class FirstLastSame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = scan.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);


        if ( firstChar == lastChar){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }







    }
}
