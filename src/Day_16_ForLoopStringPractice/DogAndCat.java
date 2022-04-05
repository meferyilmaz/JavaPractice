package Day_16_ForLoopStringPractice;

public class DogAndCat {

    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt";
        int catNum = 0;
        int dogNum = 0;

        for(int i= 0 ; i <= sentence.length()-3; i++){ //i:0 , 1, 2,3, 4

            String str = sentence.substring(i, i+3);
            if(str.equalsIgnoreCase("dog")){
                dogNum++;
            }

            if(str.equalsIgnoreCase("cat")){
                catNum++;
            }

        }

        boolean result = dogNum == catNum;

        System.out.println(result);


    }
}
