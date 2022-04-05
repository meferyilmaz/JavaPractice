package Day_20_Arrays;

public class ClassMateInitial {

    public static void main(String[] args) {

        String[] classmates = {"Efe","Fatih","Barış","Mustafa","Gökmen","Zafer","Can","Orkun","Deniz","Yılmaz"};

        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) +".";
            System.out.println(initial);

        }







    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */