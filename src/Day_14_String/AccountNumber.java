package Day_14_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your account number:");

        String account = scan.next();

        scan.close();

        String result = "";

        if(account.charAt(0) == '2' && account.length() == 7){

                result = "Valid";

        }else if(account.charAt(0) == '5' && account.length() == 10){
                result = "Valid";

        }else{
            result = "İnvalid account number";
        }

        System.out.println(result);


        System.out.println("---------------------------------------");
        //            0123456
        String str = "Cydeo School";
        str = str.substring(6);

        System.out.println(str);











    }
}
