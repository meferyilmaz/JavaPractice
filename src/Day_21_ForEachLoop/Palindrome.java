package Day_21_ForEachLoop;

public class Palindrome {

    public static void main(String[] args) {

        String[] names = {"anna", "level", "Java"};

        int count = 0;

        for (String each : names) {

            String reverse ="";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
                count++;
            }
        }

        System.out.println(count);

    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */