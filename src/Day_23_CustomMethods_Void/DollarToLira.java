package Day_23_CustomMethods_Void;

public class DollarToLira {

    public static void main(String[] args) {

        convertDollar(10);
    }

    public static void convertDollar(int dollar){


        double lira = 15.5 * dollar;

        System.out.println("lira = " + lira);

    }
}
