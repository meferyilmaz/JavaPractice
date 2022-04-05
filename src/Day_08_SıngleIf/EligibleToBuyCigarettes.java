package Day_08_SıngleIf;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {

        byte age = 20;

        boolean isEligible = age >= 21;

        if(isEligible){
            System.out.println("Eligible");

        }
        if(!isEligible){
            System.out.println("not eligible");
        }
    }

}
/*
1. Given a number (byte) age, write a program that can check if the
person is eligible to buy Cigarettes
 */