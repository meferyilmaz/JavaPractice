package Day_21_ForEachLoop;

import java.util.Arrays;

public class JavaPython {

    public static void main(String[] args) {

        String sentence = "Java java python python java python";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        int javaCount = 0,
                pythonCount = 0;

        for (String each : words) {
            if(each.equalsIgnoreCase("java")){
                javaCount++;
        }
            if (each.equalsIgnoreCase("python")){

                pythonCount++;

            }
        }


        System.out.println(javaCount+ " Java and "+pythonCount+" Python");






















    }
}
/*
Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
 */