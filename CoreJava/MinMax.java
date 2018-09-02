package CoreJava;

import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by Skatukam on 07/23/2018.
 */
public class MinMax {
    public static void main(String args[]){
        int min,max;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int SizeOfArray=scanner.nextInt();
        int arr[]=new int[SizeOfArray];
        System.out.println("Enter Numbers: ");
        for(int i=0;i<SizeOfArray;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<SizeOfArray;i++){
            System.out.println("Entered value is :"+arr[i]);
        }
        min=arr[0];
        max=arr[0];
        for (int i=1;i<SizeOfArray;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Min: "+min +"Max: "+max);

    }
}
