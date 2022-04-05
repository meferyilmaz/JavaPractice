package Day_23_CustomMethods_Void;

public class EvenNumbers {

    public static void main(String[] args) {


        evenNums(0,100);

    }


    public static void  evenNums(int x,int y){

        for (int i = x; i <=y ; i++) {
            if (i %2 == 0){
                System.out.print(i + " ");
            }
        }
    }



}
/*
2. create a method that can print even numbers between 1~100 in a same line saperated by space
 */