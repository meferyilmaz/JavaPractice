package Day_24_CustomMethos_Return;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        int[] result = addElement(array,5);

        System.out.println(Arrays.toString(result));


    }

    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;




    }
}
