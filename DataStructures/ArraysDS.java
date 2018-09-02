package DataStructures;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by Skatukam on 03/03/2018.
 */
public class ArraysDS {
    public static void main(String args[])
    {
        char cha[]=new char[10];
        char[] ch ={'s','r','i','k','a','n','t','h','K','a','t','u','k','a','m'};
        int len=ch.length;
        System.out.println("Lenth of the array is:"+len);
        for(char c:ch){
        System.out.println(c);
    }
    }
    @Test
    public void multiDC()
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans=new int[10][10];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++)
            {
                //System.out.print(arr[i][j]+" ");
                trans[i][j]=arr[j][i];
                System.out.print(trans[i][j]+" ");
            }
            System.out.println("");
        }

    }
    @Test
    public void matrix(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows & columns ");
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        System.out.println("The matrix is: "+row+ "x "+column);
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=scanner.nextInt();
                System.out.println("a["+i+"]["+j+"]");
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
