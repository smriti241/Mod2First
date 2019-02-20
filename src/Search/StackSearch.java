package Search;

import java.sql.Array;
import java.util.Arrays;

public class StackSearch
{
    public static void main(String[] args) {
        MyStack myStack=new MyStack(10);

        for(int i=0;i<10;i++)
        {
            myStack.push((int)(Math.random()*100)+1);
            //System.out.println("Element inserted at:"+i+" is: "+);
        ///////////
        }
        myStack.display();
        System.out.println(myStack.search(42)?"found":"Not found");
    }
}
class MyStack
{
    private int top;
    private int[] stackArray;
    private int size;
    private int[] woHi;
    public MyStack(int size)
    {
        this.stackArray=new int[size];
        this.size=size;
        this.top=-1;
    }
    public void push(int ele)
    {
        if(!isFull()){
            top++;
            stackArray[top]=ele;
        }
    }
    public int pop()
    {
        int ele=-1;
        if(!isEmpty())
        {
            ele=stackArray[top];
            stackArray[top]=0;
            top--;
        }
        return ele;
    }
    public void display()
    {
        if(!isEmpty())
        {
            for (int i : this.stackArray)
            {
                if(i!=0){
                    System.out.println(i);
                }
            }
        }
    }
    public int peek()
    {
        int res=-1;
        if(!isEmpty())
        {
            res=stackArray[top];
        }
        return res;
    }
    public boolean isEmpty()
    {
        boolean response=false;
        if(top==-1)
            response=true;
        return response;
    }
    public boolean isFull()
    {
        boolean response=false;
        if(top==this.stackArray.length-1)
        {
            response=true;
        }
        return response;
    }
    public boolean search(int element)
    {
        boolean response=false;
        int temp=0;
        if(!isEmpty())
        {

            for(int i=0;i<stackArray.length;i++)
            {
                if(peek()==element)
                {
                    response=true;
                    break;
                }
                else
                {
                    temp++;
                    if(temp==1)
                    {
                        woHi=new int[stackArray.length];
                        for (int j = 0; j <woHi.length ; j++)
                        {
                            woHi[j]=stackArray[j];
                        }
                    }
                    System.out.println(Arrays.toString(woHi));
                    //System.out.println("Poped");
                    pop();
                }
            }
        }
        return response;
    }
}
