package CoreJava;

import javax.sound.midi.Soundbank;

/**
 * Created by Skatukam on 03/03/2018.
 */
public class StackWithoutCollections {
    int capacity=3;
    int top=-1;
    int arr[]=new int[capacity];
    public void push(int item)
    {
        if(top<capacity-1){
            top++;
            arr[top]=item;
            System.out.println("The element added to top is:"+arr[top]);
            printStack();
        }
        else
            System.out.println("Stack over flow");

    }
    public void pop(){
        if(top>0){
            System.out.println("Element poped is"+arr[top]);
            top--;
            System.out.println("Pop operation done !");
        }
        else
            System.out.println("Stack underflow");


    }
    public void printStack()
    {System.out.println("Stack elements are:");
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        StackWithoutCollections stackWithoutCollections=new StackWithoutCollections();
        stackWithoutCollections.pop();
        stackWithoutCollections.push(23);
        stackWithoutCollections.push(45);
        stackWithoutCollections.push(66);
        stackWithoutCollections.pop();
        stackWithoutCollections.push(77);

    }
}
