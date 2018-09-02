package CoreJava;

/**
 * Created by Skatukam on 07/25/2018.
 */
public class NearestPrimeNo {
    public static boolean isPrime(int i){
        boolean Prime=true;
        for(int j=2;j<=Math.sqrt(i);j++)
        {
            if (i%j==0)
            {
                Prime=false;
                break;
            }
        }
        if (Prime)
        {
            return true;

        }
        else
            return false;
    }
    public static void main(String args[]){
        int GivenNumber=50;
        int num1=0,num2=0;
        int diff1=0,diff2=0;
        for (int i = GivenNumber;; i--) {
            if (isPrime(i)){
                System.out.println("Lower Prime: "+i);
                diff1=GivenNumber-i;
                num1=i;
                break;
            }
        }
        for (int i = GivenNumber;; i++) {
            if (isPrime(i)){
                System.out.println("Upper Prime: "+i);
                diff2=i-GivenNumber;
                num2=i;
                break;
            }
        }
        if (diff1==diff2)
            System.out.println("Nearest Prime is:" +num1 +"," +num2);
        else if (diff1>diff2){
            System.out.println("Nearest Prime is:" +num2);
        }
        else
            System.out.println("Nearest Prime is:" +num1);

    }

}
