package Search;

public class ArraySearch
{
    public static void main(String[] args)
    {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=kuchbhi();}
            for (int i1 = 0; i1 < array.length; i1++) {
                System.out.println((i1 + 1) + "=" + array[i1]);
            }
        for(int i2=0;i2<array.length;i2++)
        {
            if(array[i2]==42)
            {
                System.out.println("Value found at:"+(i2+1));
                break;
            }
        }

    }
    private static int kuchbhi()
    {
        int response=-1;
        response=(int)(Math.random() *100) + 1;
        return response;
    }

}
