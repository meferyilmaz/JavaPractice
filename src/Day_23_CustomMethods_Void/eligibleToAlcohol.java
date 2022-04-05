package Day_23_CustomMethods_Void;

public class eligibleToAlcohol {

    public static void main(String[] args) {


        eligibleToAlcohol(26);
    }

    public static void eligibleToAlcohol(int age){

        boolean isEligible = age >= 21;

        if(isEligible) {
            System.out.println("Eligible");

        }else {

            System.out.println("Not Eligible");

        }
        }

}
