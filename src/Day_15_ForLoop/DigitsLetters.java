package Day_15_ForLoop;

public class DigitsLetters {

    public static void main(String[] args) {

  /*      String str = "mn@#123Ab!";

        String letters = "";
        String digits = "";
        String specialChar = "";

        for ( int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if ( ch >= '0' && ch <= '9'){
                digits += ch;
            }else if ( ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else if ( ch >= 'a' && ch <= 'z'){
                letters += ch;
            }else{

            if(ch != ' ') {
                    specialChars += ch;
                }

            }


            System.out.println("digits = " + digits);
            System.out.println("specialChar = " + specialChar);
            System.out.println("letters = " + letters);

*/


        System.out.println("------------------------------------------------------------------------");

        String str = "ABCD123#$@!";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9'){
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else if(ch >= 'a' && ch <= 'z'){
                letters += ch;
            }else{
                if(ch != ' ') {
                    specialChars += ch;
                }
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */