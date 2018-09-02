package CoreJava;

import org.testng.annotations.Test;

/**
 * Created by Skatukam on 02/25/2018.
 */
public class SwitchExample {
    int switchValue=1;
@Test
    public void getSwitchValue()
    {
        switch(switchValue)
        {
            case 1:
                System.out.println("Case1");
                break;
            case 2:
                System.out.println("Case2");
                break;
        }

    }
}
