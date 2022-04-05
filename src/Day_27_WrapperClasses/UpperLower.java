package Day_27_WrapperClasses;

public class UpperLower {

    public static void main(String[] args) {

        String str = "JAVA java";

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (Character.isUpperCase(each)){
                upper++;
            }
            if (Character.isLowerCase(each)){
                lower++;
            }
            if (upper == lower){
                System.out.println("True");
            }else{
                System.out.println("False");
            }

        }





    }


}
