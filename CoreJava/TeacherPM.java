package CoreJava;

/**
 * Created by Skatukam on 07/19/2018.
 */
class Teacher
{
    String Subject;
    public void teaches()
    {
        System.out.println("Teaches a subject");
    }

}
class EnglishTeacher extends TeacherPM{
public void teaches()
{
    System.out.println("Teaches English subject");
}
}
public class TeacherPM
{
    public static void  main(String[] args){
        EnglishTeacher englishTeacher=new EnglishTeacher();
        englishTeacher.teaches();
        Teacher teacher=new Teacher();
        teacher.teaches();


    }
}
