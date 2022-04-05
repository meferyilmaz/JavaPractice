package Day_20_Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5};

      int[] reversed = new int[numbers.length];

         int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--,j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));






    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */