import java.util.Date;

public class Array
{
    public static void main(String[] args) {
       /* int[] ar=new int[10];
        for(int i=0;i<10;i++)
        {
            ar[i]=i*i;
        }
        int i=0;
        for (int i1 : ar) {
            System.out.println(i1);
        }*/
       Date[] d=new Date[10];
       for(int i=0;i<10;i++) {
           d[i] = new Date(2005 - 1900, 12 - 1, i+1);
       }
       for (Date date : d) {
            System.out.println(date);
        }
    }
}
//-1900