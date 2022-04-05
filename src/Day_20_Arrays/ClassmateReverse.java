package Day_20_Arrays;

public class ClassmateReverse {

    public static void main(String[] args) {

        String[] classmates = {"Efe","Fatih","Barış","Mustafa","Gökmen","Zafer","Can","Orkun","Deniz","Yılmaz"};


        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);

        }












    }
}
