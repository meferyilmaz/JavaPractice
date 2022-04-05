package Day_09_IfElse_MultiBranchIf;

public class AgeGroups {

    public static void main(String[] args) {
        int number = 45;
        String result = " ";

        if ( number <= 2){
            result = "infant";
        }else if ( number <= 5){
           result = "toddler";
        }else if ( number <= 9){
            result = "Kid";
        }else if ( number <= 12){
            result = "Pre-Teen";
        }else if ( number <= 17){
            result = "Teenager";
        }else if ( number <= 20){
            result = "Young Adult";
        }else if ( number <= 39){
            result = "Adult";
        }else if ( number <= 49){
            result = "Young Middle-Aged Adult";
        }else if ( number <= 54 ){
            result = "Middle-Aged Adult";
        }else if ( number <= 64){
            result = "Very Young Senior";
        }else if ( number <= 74){
            result = "Young Senior Citizen";
        }else if ( number <= 84){
            result = "Senior Citizen";
        }else{
            result = "old senior citizen";
        }


        System.out.println(result);

















    }
}
/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */