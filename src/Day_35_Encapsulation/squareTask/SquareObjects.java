package Day_35_Encapsulation.squareTask;

public class SquareObjects {

    public static void main(String[] args) {


        Square square1 = new Square(10);

        System.out.println(square1);

        square1.setSide(5);
        System.out.println(square1.getSide());

        System.out.println(square1.calcArea());


    }

}
