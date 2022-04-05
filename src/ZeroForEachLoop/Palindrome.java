package ZeroForEachLoop;

public class Palindrome {

    public static void main(String[] args) {

        String[] names = {"anna", "level", "Java"};

        int count = 0;
        for (String each : names) {

            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {

                reversed += each.charAt(i);

            }
            if(each.equalsIgnoreCase(reversed)){
                count++;
            }
        }
        System.out.println(count);
    }
}
