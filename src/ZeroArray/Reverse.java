package ZeroArray;

public class Reverse {

    public static void main(String[] args) {


    String[] name = {"Java","Python","c#"};



        String result = "";
        for (int i = 0; i < name.length; i++) {
            result = name[i];
            String reversed ="";

            for (int j = result.length()-1; j >= 0; j--) {
                reversed += result.charAt(j);

            }
            System.out.println(reversed);
        }

        int[] number = {1,2,3,4,5,6};

        int nums = 0;
        for (int i = 0; i < number.length; i++) {
            nums = number[i];

            System.out.println(nums);
        }

        int initial = 0;

        for (int i = number.length - 1; i >= 0; i--) {
            initial =  number[i];
            System.out.println(initial);
        }





    }
}
