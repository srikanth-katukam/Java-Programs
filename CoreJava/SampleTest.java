package CoreJava;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by Skatukam on 04/26/2018.
 */
public class SampleTest {
    @Test
    public void findElementInArray()
    {
        int arr[]={1,2,3,4,5,6,7,8};
        int element=16;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(element==arr[i])
            {
                System.out.println("Element found");
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Element not found");
        }
    }
    @Test
    public void minMax(){
        int min,max,count=0;
        int arr[]=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter integer values");
        //while (scanner.hasNextInt()){
            //[count]=scanner.nextInt();
            int num=scanner.nextInt();
        //}
        System.out.println("given values: "+num);
        for (int i=0;i<arr.length;i++){
            System.out.println("given values: "+arr[i]);
        }
    }
    @Test
    public void reverseWithoutStringFunction(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scanner.nextLine();


        //System.out.println("Entered number is: "+num);
    }
}
