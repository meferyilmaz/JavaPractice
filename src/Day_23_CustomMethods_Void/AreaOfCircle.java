package Day_23_CustomMethods_Void;

public class AreaOfCircle {

    public static void main(String[] args) {

        squareCircle(10);

    }

    public static void squareCircle(int radius){

        double pi = 3.14;

        double areaOfCircle = pi * radius * radius;
        System.out.println(areaOfCircle);
    }
}
/*
 create a method that can calculate the area of a circle
 */