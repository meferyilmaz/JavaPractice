package Day_24_CustomMethos_Return;

import java.util.Arrays;

public class Remove {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};

        int[] result = remove(array,2);

        System.out.println(Arrays.toString(result));

        String[] arr = {"ali","veli","efe","mustafa"};

        String[] result1 = remove(arr,1);

        System.out.println(Arrays.toString(result1));

    }

    public static int[] remove(int[] array, int index){

        if (index < 0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }

        return result;


    }

    public static String[] remove (String[] array, int index){

        if (index < 0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }

        return result;







    }







}
/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}


 */