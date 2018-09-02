import org.apache.xerces.impl.dv.xs.YearDV;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by Skatukam on 02/23/2018.
 */
public class Conversion {
    String y="2015";
    int x=2016;
  int i=Integer.parseInt(y);
    @Test
    public void stringToInt()
    {
        System.out.println(i);
    }
    @Test
    public void intToString()
    {
        String s=Integer.toString(x);
        System.out.println(s);
    }
    @Test
    public void stringToIntWithoutMethod()
    {
        String s="2017";
        char[] ch=s.toCharArray();
        int sum=0;
        int zero= (int)'0';
        for (char c1:ch)
        {
            int temp=(int)c1;
            sum=sum*10+(temp-zero);
        }
        System.out.println(sum);
    }
    @Test
    public static void duplicatewithSet()
    {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};

        Set<String> set = new HashSet<String>();

        for (String arrayElement : strArray)
        {
            if(set.add(arrayElement)==false)
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }

}
