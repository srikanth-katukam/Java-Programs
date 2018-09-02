package CoreJava;

import org.testng.annotations.Test;

/**
 * Created by Skatukam on 02/25/2018.
 */
public class PrimitiveDataTypes {
    int value=2500;
    byte aByte=10;
    int avg=value/2;
    byte getaByte= (byte) (value/2);
    @Test
    public void test()
    {
        System.out.println(avg);
        System.out.println(aByte);
        System.out.println(getaByte);
    }
    @Test
    public void FloatAndDouble()
    {
        int i=5/3;
        float v=5f/3f;
        double v1=5d/3d;
        System.out.println(i);
        System.out.println(v);
        System.out.println(v1);
        System.out.println();
    }
    @Test
    public void byteAndChar()
    {
        char c='S';
        boolean b=true;
        System.out.println(c);
        System.out.println(b);
        if (!b)
        {
            System.out.println("False Method");
        }
        if (b)
        {
            System.out.println("True Method");
        }
    }
}
