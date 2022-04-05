package Day_23_CustomMethods_Void;

public class EuroToDollar {

    public static void main(String[] args) {
        euro(10);
    }

    public static void euro(int dollar){
        double euro = dollar*0.9;

        System.out.println("euro = " + euro);
    }
}
/*
9. create a method that can convert dollar to euro
 */