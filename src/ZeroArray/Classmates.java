package ZeroArray;

import java.util.Arrays;

public class Classmates {

    public static void main(String[] args) {
        String[] name = {"ofdsf","eggfd","wsdsd","rfdf","qfdg",};


        for (int i = 0; i < name.length; i++) {
            String result = name[i].charAt(0)+ ".";

            System.out.println(result);
        }






        System.out.println(Arrays.toString(name));
    }
}
