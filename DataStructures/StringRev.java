package DataStructures;

import org.codehaus.groovy.runtime.powerassert.SourceText;

/**
 * Created by Skatukam on 03/03/2018.
 */
public class StringRev {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int len=arr.length;
        Reverse reverse=new Reverse();
        reverse.rev(arr,len);
    }
}
class Reverse{
    public void rev(int[] arr,int n){
        int start=0;
        int end=n-1;
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse of an array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
