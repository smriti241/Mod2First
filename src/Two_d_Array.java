import static java.lang.Math.*;

public class Two_d_Array
{
    public static void main(String[] args)
    {
        int[][] ar=new int[20][20];
        int[] sumrow=new int[20];
        int[] sumcol=new int[20];
        for(int i=0;i<20;i++){
            for (int i1 = 0; i1 < 20; i1++) {
                ar[i][i1]=(int) (Math.random() *100);
                sumrow[i]+=ar[i][i1];
                sumcol[i]+=ar[i1][i];
            }
           // System.out.println("Sum of row:"+sumrow[i]);
            //System.out.println("Sum of Column:"+sumcol[i]);
        }
        int max=sumrow[0],min=sumrow[0],max2=sumcol[0],min2=sumcol[0];
        int rowmax=0,colmax=0;
        int rowmin=0,colmin=0;
        for (int i = 0; i < 20; i++) {
            if (max<sumrow[i])
            {
                max=sumrow[i];
                rowmax=i;
            }
            if (min>sumrow[i])
            {
                min=sumrow[i];
                rowmin=i;
            }
            if(max2<sumcol[i])
            {
                max2=sumcol[i];
                colmax=i;
            }
            if(min2>sumcol[i])
            {
                min2=sumcol[i];
                colmin=i;
            }
        }
        System.out.println("Maximum sum of row:"+(rowmax+1)+" Sum:"+max);
        System.out.println("Minimum sum of row:"+(rowmin+1)+" Sum:"+min);
        System.out.println("Maximum sum of column:"+(colmax+1)+" Sum:"+max2);
        System.out.println("Minimum sum of column:"+(colmin+1)+" Sum:"+min2);

       /* for (int i = 0; i < 20; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.println("arr["+i+"]["+i1+"]="+ar[i][i1]);
            }
        }*/
    }
}
