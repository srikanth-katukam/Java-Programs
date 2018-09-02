package DataStructures;

/**
 * Created by Skatukam on 03/03/2018.
 */
class Student {
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}
    public class CFG{
        public static void main(String args[])
        {
            Student[] st=new Student[5];
            int count=st.length;
            st[0]=new Student(1,"Srikanth");
            st[1]=new Student(2,"Lasvika");
            st[2]=new Student(3,"Ramya");
            st[3]=new Student(4,"Katukam");
            st[4]=new Student(5,"Test");
            for (int i=0;i<count;i++){
                System.out.println("Student "+i+" is: "+st[i].rollno +" "+st[i].name);
            }
        }


    }

