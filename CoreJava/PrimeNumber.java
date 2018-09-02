package CoreJava;

import org.apache.bcel.classfile.Field;
import org.testng.annotations.Test;

/**
 * Created by Skatukam on 07/25/2018.
 */
public class PrimeNumber {

    @Test
    public void primeNumberOrNot()
    {
        int GivenNumber=10;
        boolean Prime=true;
        for (int i=2;i<=Math.sqrt(GivenNumber);i++)
        {
            if(GivenNumber%2==0)
                Prime=false;
            break;
        }
        if (Prime)
            System.out.println("Given number " +GivenNumber+" is a Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
    @Test
    public void firstNPrimeNumbers()
    {
        int FirstNPrimeNumbers =10;
        int count=0;
        int num=2;
        System.out.println("First "+FirstNPrimeNumbers+" Prime numbers are:");
        while (count!=FirstNPrimeNumbers){
            boolean Prime=true;
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num%i==0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    @Test
    public void primeNumberFromANDTo(){
        int From=10;
        int To=100;
        //boolean Prime=true;
        System.out.println("Prime numbers between and to");
    for(int n=From;n<=To;n++){
        boolean Prime=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                Prime=false;
                break;
            }
        }
        if (Prime){
            System.out.println(n);
        }
    }
    }
}
