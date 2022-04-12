package Day_35_Encapsulation.ItemTask;

public class ItemTask {

    public static void main(String[] args) {


        Item item1 = new Item("cheese", 5, 6);

        System.out.println(item1);

        item1.setName("olives");
        item1.setUnitPrice(4);
        item1.setQuantity(8);

        System.out.println(item1.getName());





    }
}
