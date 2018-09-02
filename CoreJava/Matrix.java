package CoreJava;

import java.util.Scanner;

/**
 * Created by Skatukam on 07/25/2018.
 */
public class Matrix {
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows & columns ");
    int row=scanner.nextInt();
    int column=scanner.nextInt();
        System.out.println("The matrix is: "+row+ " x "+column);
    int arr[][]=new int[row][column];
        System.out.println("Enter values in matrix:");
        for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            arr[i][j]=scanner.nextInt();
            System.out.println("a["+i+"]["+j+"] :"+arr[i][j]);
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
