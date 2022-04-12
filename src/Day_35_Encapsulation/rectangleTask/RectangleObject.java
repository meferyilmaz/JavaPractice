package Day_35_Encapsulation.rectangleTask;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5,10);

        System.out.println(rectangle1);

        rectangle1.setWidth(4);
        rectangle1.setLength(6);

        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getLength());

    }
}
