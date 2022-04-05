package Day_33_Statics.CydeoStudent_Task;

public class StudentTest {

    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("John",25,'M',15,'A',78,4);
        CydeoStudent student2 = new CydeoStudent("Ali",25,'M',15,'A',78,4);
        System.out.println(student1);
        System.out.println(student2);

        student1.study();
        student2.study();

        student1.attendClass();
        student2.attendClass();

        System.out.println(CydeoStudent.schoolName);

        System.out.println(CydeoStudent.programmingLanguage);












    }



}
