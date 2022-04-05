package Day_22_MultiDimensialArray;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[][] numbers2D = { {1,2,3}, {4,5,6}};

        int[][] reverse = new int[numbers2D.length][];



        for (int i = 0; i < numbers2D.length; i++) {
            int[] temp = new int[numbers2D[i].length]; // temporrary array variable to hold the elements
            for (int j = 0; j < numbers2D[i].length; j++) {
                temp[(temp.length - 1) - j] = numbers2D[i][j]; // getting the last elements of each 1D array and assigning to the beginning indexes of temp array
            }
            reverse[(numbers2D.length - 1) - i] = temp; // assign the 1D temp array to each index of the 2D array
        }

        System.out.println(Arrays.deepToString(reverse));







    }
}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

 */
