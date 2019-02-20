import java.util.Scanner;

class Stack{
    int[] ar;
    int n;
    int top;
    public Stack(int n)
    {
        this.n=n;
        ar=new int[n];
        top=-1;
    }
    void push(int ele)
    {
        if(top!=n-1)
        {
            top++;
            ar[top]=ele;
        }
    }
    void display()
    {
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }
    int check()
    {
        int num=0,m=0;
        for (int i = n-1; i > 0; i--)
        {
            if(ar[i]>ar[i-1])
            {
                m=ar[i]-ar[i-1];
                num+=m;
                ar[i-1]+=m;
            }

        }
        return num;
    }
    /*void pop()
    {
        if(top!=-1)
        {
            ar[top]=0;
            top--;
        }
    }*/
}
public class Water
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack s=new Stack(size);
        int element;
        for (int i = 0; i < size; i++)
        {
            element=sc.nextInt();
            s.push(element);
        }

        //s.display();
        System.out.println(s.check());
    }
}
