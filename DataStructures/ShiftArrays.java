package DataStructures;

/**
 * Created by Skatukam on 03/03/2018.
 */
class ShiftTest{
    public void shift(int[] arr,int d,int n)
    {
        for (int i=0;i<d;i++){
            for(int j=0;j<n-1;j++)
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
public class ShiftArrays {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7};
        ShiftTest shiftArrays= new ShiftTest();
        shiftArrays.shift(arr,2,6);
    }

}
