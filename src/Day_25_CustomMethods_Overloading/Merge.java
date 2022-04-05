package Day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = merge(arr1, arr2);

        String[] arr3 = {"a","b","c"};
        String[] arr4 = {"d","e","f"};

        String[] result2 = merge(arr3,arr4);

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'D','E','F'};

        char[] result3 = merge(ch1,ch2);

        double[] num1 = {1.5,2.5,3.5};
        double[] num2 = {4.5,5.5,6.5};

        double[] result4 = merge(num1,num2);

        System.out.println("result4 = " + Arrays.toString(result4));
        System.out.println("result3 = " + Arrays.toString(result3));
        System.out.println("result2 = " + Arrays.toString(result2));
        System.out.println("result = " + Arrays.toString(result));

    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = new String[arr1.length + arr2.length];

        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    public static char[] merge(char[] ch1, char[] ch2){

        char[] result = new char[ch1.length + ch2.length];

        int i = 0;

        for (char each : ch1) {
            result[i++] = each;
        }

        for (char each : ch2) {
            result[i++] = each;
        }

        return result;

    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = new double[arr1.length + arr2.length];

        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }

        return result;

    }
}