package Day_23_CustomMethods_Void;

public class RegularFormat {

    public static void main(String[] args) {

        regular("cydeo","sChoOL");

    }

    public static void regular(String name1,String name2){

        name1 = name1.substring(0,1).toUpperCase() + name1.substring(1).toLowerCase();

        name2 = name2.substring(0,1).toUpperCase() + name2.substring(1).toLowerCase();

        System.out.println(name1+" "+name2);
    }
}
/*
	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


 */