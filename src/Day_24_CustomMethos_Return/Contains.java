package Day_24_CustomMethos_Return;

public class Contains {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};

        boolean contains = contains(array,10);

        System.out.println("contains = " + contains);
    }

    public static boolean contains(int[] array, int number){

        boolean result = false;

        for (int each : array) {
            if ( each == number){
                result = true;
            }
        }

        return result;
    }
}
