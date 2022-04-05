package Day_16_ForLoopStringPractice;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String word = "JavaJavaJava";
        int frequency = 0;

        for (int i = 0; i <= word.length()-4; i++) {
            String eachSub = word.substring(i, i+4);

            if (eachSub.equals("Java")){
                frequency++;
            }



        }

        System.out.println(frequency);



    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */