import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Skatukam on 02/22/2018.
 */
public class ListInterface {
    int x = 10;
    int y = 20;
    Student[] students = new Student[1000];
    Object[] object = new Object[1000];

    //object[0]= new Student[];
    @Test
    public void listTest() {
        System.out.println("Test");
        List<String> list = new ArrayList<String>();
        //List<Integer> li=new ArrayList<Integer>();
        list.add("Srikanth");
        list.add(" ");
        list.add("Ramesh");
        list.add(" ");
        list.add("Rakesh");
        list.add("\n");

       // list.remove(1);
        String l0 = list.get(0);
       // System.out.println("Index o element" + l0);
        //list.remove(list.get(0));
        for (String names : list) {
            System.out.print(names);
        }
        System.out.println("Using iteraor:");
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.print((iterator.next()));
        }
        LinkedList<String> linkedList=new LinkedList();
        Iterator it = linkedList.iterator();
        linkedList.add("LL1");
        linkedList.add("LL2");
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
