package Day_23_CustomMethods_Void;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        anagram("silent","listen");

    }

    public static void anagram(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram =  Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);
    }
}

