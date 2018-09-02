import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Skatukam on 02/23/2018.
 */
public class SetInterface {
    @Test
    public void testSet()
    {
        Set<String> set=new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        Iterator<String> iterator=set.iterator();
        System.out.println("Iterator loop");
        while (iterator.hasNext())
        {
            String SetValues=iterator.next();
            System.out.println(SetValues);
        }
        System.out.println("For loop:");
        for (String SValues:set)
        {
            System.out.println(SValues);
        }
        set.remove("A");
        set.remove("B");
        set.remove("C");
        set.remove("D");
        set.remove("E");
        //set.contains("E");
        System.out.println(set.contains("A"));
        for (String SValues:set)
        {
            System.out.println(SValues);
        }
        if(set.isEmpty())
        {
            System.out.println("Set is Empty");
        }
        else
            System.out.println("Set is not Empty");

    }
}
