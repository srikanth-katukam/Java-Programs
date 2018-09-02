import com.sun.prism.paint.Color;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by Skatukam on 02/23/2018.
 */
public class MapInterface {
    Map<String,Color> map= new HashMap<String, Color>();
    @Test
    public void chatCount()
    {
        Map<Character,Integer> map=new HashMap<Character, Integer>();
       String string = "abcadbcab";
        char[] ch=string.toCharArray();
        for (char c:ch)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }
        System.out.println(map);
        //Set<Entry<Character, Integer>> entrySet=map.entrySet();
            Set<Character> characterSet=map.keySet();
        for (char cc:characterSet)
        {
            int count=map.get(cc);
            if(count>=2)
                System.out.println("The Character "+cc+" count is:" +count);
        }
    }
@Test
public void Programs()
{
    String str = "aabcdbccddd";
    char[] ch=str.toCharArray();
    Map<Character,Integer> map=new HashMap<Character, Integer>();
    for (char c:ch)
    {
        if(map.containsKey(c))
            map.put(c,map.get(c)+1);
        else
            map.put(c,1);
    }
    System.out.println(map);

    Set<Character> characters=map.keySet();
    for(char ch1:characters)
    {
        int count=map.get(ch1);
        if(count>=0)
            System.out.println("Character"+ch1 +"Count"+count);
    }
}

@Test
public void AvgofNumbersFromArray(){
    int arr[]={10,20,30,40,50,60,70};
int Sum=0;
    int avg=0;
    int len=arr.length;
    for (int i=0;i<len;i++)
    {
        Sum=Sum+arr[i];
    }
    avg=Sum/len;
    System.out.println("Average is" +avg);
}

@Test
public void reverseOfANumber(){
    int num=121;
    int temp=num;
    int rem;
    int Sum=0;
    while(num>0){
        rem=num%10;  //1
        Sum=Sum*10+rem;
        num=num/10;
    }
    System.out.println("Reverse of a String is:  "+Sum);
    if(temp==Sum)
        System.out.println(temp +" is a palindrome");
    else
        System.out.println(temp +" is not a palindrome");
}

@Test
    public void largeNumber(){
    int n1=10;
    int n2=40;
    int n3=30;
    int temp=n1>n2?n1:n2;
    int max=n3>temp?n3:temp;
    System.out.println("Max is: "+max);
}
}

