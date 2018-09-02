package CoreJava;

import org.testng.annotations.Test;

/**
 * Created by Skatukam on 07/26/2018.
 */
public class Pattern {
    @Test
    public void pattern1()
    {
        System.out.println("The simple pattern is: ");
        for (int i=1;i<=7;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.println("");
        }
    }

}
