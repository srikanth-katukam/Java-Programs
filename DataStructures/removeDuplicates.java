package DataStructures;

import org.codehaus.groovy.runtime.StringGroovyMethods;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Skatukam on 03/06/2018.
 */
public class removeDuplicates {
    public static void main(String args[])
    {
        int arr[]={1,2,2,3,4,4,5,6};
        removeDuplicates removeDuplicates=new removeDuplicates();
        removeDuplicates.duplicate(arr);
    }
    public void duplicate(int[] arr)
    {
        int len=arr.length;
        Set<Integer> integerSet=new HashSet<Integer>();
        for(int c:arr)
        {
            integerSet.add(c);
        }
        System.out.println("Array without duplicates: "+integerSet);
    }
}
