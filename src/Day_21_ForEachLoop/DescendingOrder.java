package Day_21_ForEachLoop;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        int[] result = new int[nums.length];

        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--,j++) {
            result[j]=nums[i];
        }

        System.out.println(Arrays.toString(result));

    }
}
/*
1. Write a program that sort the array of integer in descending order
 */