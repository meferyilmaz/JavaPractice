package Day_35_Encapsulation.CarpetTask;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(4,5,10,true);

        System.out.println(carpet1);

        carpet1.setWidth(2);
        carpet1.setLength(6);
        carpet1.setUnitPrice(5);
        carpet1.setPersian(false);

        System.out.println(carpet1.getLength());
    }
}
