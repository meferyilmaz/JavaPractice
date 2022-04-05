package Day_08_SıngleIf;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradelevel = 15;

        boolean elementarySchool = gradelevel >= 1 && gradelevel <= 5 ;
        boolean middleSchool = gradelevel >= 6 && gradelevel <= 8;
        boolean highSchool = gradelevel >= 9 && gradelevel <= 12;
        boolean college = gradelevel >= 13 && gradelevel <= 16;
        boolean gradSchool = gradelevel >= 17 && gradelevel <= 18;

        if(elementarySchool){
            System.out.println("Elementary School");
        }
        if(middleSchool){
            System.out.println("Middle School");
        }
        if(highSchool){
            System.out.println("High School");
        }
        if (college){
            System.out.println("College");
        }
        if (gradSchool){
            System.out.println("Grad School");
        }






    }
}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
        grade level and types are:
                1-5: Elementary school
                6-8: Middle school
                9-12: High school
                13-16: College
                17-18: Grad School
        Assume that the given number is 1 ~ 18
 */