package Day_24_CustomMethos_Return;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "cab";
        String str2 = "bca";


        boolean anagram = anagram(str1,str2);

        System.out.println("anagram = " + anagram);


    }

    public static boolean anagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        return anagram;


    }

}
