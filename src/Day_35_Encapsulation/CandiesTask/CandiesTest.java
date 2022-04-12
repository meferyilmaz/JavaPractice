package Day_35_Encapsulation.CandiesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandiesTest {

    public static void main(String[] args) {

        Candies candy1 = new Candies("eti",5,4,true);
        Candies candy2 = new Candies("ülker", 2,6,true);
        Candies candy3 = new Candies("kinder",8,10,true);

        Candies[] candies = {candy1,candy2,candy3};

        System.out.println(Arrays.toString(candies));

        for (Candies candy : candies) {
            System.out.println(candy.getBrand()+ " : "+candy.getPrice());
        }















    }
}
