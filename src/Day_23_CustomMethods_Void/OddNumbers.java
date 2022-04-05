package Day_23_CustomMethods_Void;

public class OddNumbers {

    public static void main(String[] args) {


        oddNums(0,100);

    }


    public static void  oddNums(int x,int y){

        for (int i = x; i <=y ; i++) {
            if (i %2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space
 */
