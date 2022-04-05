package Day_24_CustomMethos_Return;

public class Palindrome {

    public static void main(String[] args) {

        String array ="Level";
        array = palindrome(array);

        System.out.println(array);





    }

    public static String palindrome(String array){
        String reversed = "";

        for (int i = array.length()-1; i >= 0; i--) {
            reversed += array.charAt(i);
        }

        if (array.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        return reversed;





    }
}
