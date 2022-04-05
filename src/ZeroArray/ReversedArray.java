package ZeroArray;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5};

        int[] reversed = new int[numbers.length];

        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--,j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));


    }

}
