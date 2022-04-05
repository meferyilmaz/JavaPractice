package Day_23_CustomMethods_Void;

public class eligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(19,"USA");

    }


    public static void eligibleToVote(int age, String citizen){

        boolean isEligible = age >= 21 && citizen == "USA";
        if (isEligible){
            System.out.println("Eligible");
        }else {
            System.out.println("You are not eligible to vote! ");

        }
    }

}
/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */