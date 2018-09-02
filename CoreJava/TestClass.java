package CoreJava;

/**
 * Created by Skatukam on 02/25/2018.
 */
class MethodOverLoading {
    public int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public int add(int a,int b,int c)
    {
        int sum=a+b+c;
        return sum;
    }

}
public class TestClass
{
    public static void main(String args[])
    {
        MethodOverLoading methodOverLoading=new MethodOverLoading();
       int i= methodOverLoading.add(10,20);
        int i1=methodOverLoading.add(10,20,30);
        System.out.println(i);
        System.out.println(i1);
    }
}
