package Day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4};
         arr1 = reverse(arr1);

        double[] arr2 = {1.5,2.5,3.5,4.5,5.5};
        arr2 = reverse(arr2);

        char[] arr3 = {'A','B','C','D'};
        arr3 = reverse(arr3);

        String[] arr4 = {"ali","veli","ada"};
        arr4 = reverse(arr4);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }

    public static int[] reverse(int[] array){
        
        int[] result = new int[array.length];
        
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;

    }

    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;

    }

    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;

    }

    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;

    }
}
