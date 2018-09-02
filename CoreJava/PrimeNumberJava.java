package CoreJava;

/**
 * Created by Skatukam on 07/25/2018.
 */
public class PrimeNumberJava
{
    public static void main(String args[])
    {
            int FirstNPrimeNumbers =10;
            int count=0;
            int num=2;
            boolean Prime=true;
            System.out.println("First "+FirstNPrimeNumbers+" Prime numbers are:");
            while (count!=FirstNPrimeNumbers){
                for (int i=2;i<=Math.sqrt(num);i++) {
                    if (num % i == 0) {
                        Prime = false;
                        break;
                    }
                }
                if (Prime){
                    System.out.println(num);
                    count++;
                    System.out.println(count);
                }
                num++;
            }

    }
}
