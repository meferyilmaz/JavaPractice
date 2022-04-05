package Day_23_CustomMethods_Void;

public class PosNegZero {

    public static void main(String[] args) {
        posNeg(15);
    }

    public static void posNeg(int number){
        if (number > 0){
            System.out.println(number + " is positive");
        }else if (number < 0){
            System.out.println(number+ " is negative");
        }else {
            System.out.println(number+ " is zero");
        }

    }
}
/*
12. create a method that can if the given integer is positive, negative or zero
 */
