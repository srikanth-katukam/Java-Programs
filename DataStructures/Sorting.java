package DataStructures;

/**
 * Created by Skatukam on 03/03/2018.
 */
public class Sorting {
    public static void main(String args[]){
        int[] arr={5,3,4,2,6,1};
        for(int i=0;i<6;i++)
        {
            int temp;
            for(int j=i+1;j<6;j++){
                if(arr[i]>arr[j])
                {
                   temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i=0;i<6;i++){
            System.out.println(arr[i]+" ");
        }
    }

}
