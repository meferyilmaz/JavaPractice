package Day_21_ForEachLoop;

import java.util.Arrays;

public class OddOrEven {

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        int odds = 0;
        int evens = 0;

        for (int each : nums) {

            if (each %2 ==1){
                odds++;
            }
            if (each %2 == 0 ){
                evens++;
            }

        }


        System.out.println("evens = " + evens);
        System.out.println("odds = " + odds);

        System.out.println(Arrays.toString(nums) +" has "+evens+" even numbers and "+odds+" odd numbers");





    }
}
