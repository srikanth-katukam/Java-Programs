package CoreJava;

import org.testng.annotations.Test;

/**
 * Created by Skatukam on 02/24/2018.
 */
public class findSunArray {
    @Test
    public void subArray()
    {
        int array[]={42, 15, 12, 8, 6, 32};
        int num=26;
        for (int i=0;i<array.length;i++)
        {
            int ele = num - array[i];
            num=ele;
            if (ele==0)
            {

            }
        }
    }
}
