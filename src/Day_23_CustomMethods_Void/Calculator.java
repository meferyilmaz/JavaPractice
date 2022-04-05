package Day_23_CustomMethods_Void;

public class Calculator {

    public static void main(String[] args) {

        calculate(100,50,'-');

    }

    public static void calculate(int num1,int num2,char operator){

        String result = "";
        result = (operator == '+'|| operator == '-' || operator == '*' || operator == '/')?
                (operator == '+')?"Addition: "+(num1+num2) :(operator == '-')?"Subtraction: "+ (num1 - num2) :(operator == '*')?"Multiplication: "+ (num1*num2)
                        :"Division: "+ (num1/num2) : "Invalid Score";

        System.out.println("result = " + result);
    }
}
