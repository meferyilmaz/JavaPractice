package Day_13_String;

import java.util.Scanner;

public class İnitial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a firstname");
        String firstname = scan.nextLine();

        System.out.println("Enter a secondname");
        String secondName = scan.nextLine();

        scan.close();

        char f = firstname.toUpperCase().charAt(0);
        char l = secondName.toUpperCase().charAt(0);


        String result = f + "." + l;

        System.out.println(result);















    }
}
