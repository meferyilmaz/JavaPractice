package Day_28_ArrayList;

import java.util.ArrayList;

public class SwapNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(list.size() - 1, 1);
        list.set(0,5);
        System.out.println(list);


    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

 */