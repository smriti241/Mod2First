package Search;

public class ArraySearch2
{
    ClassList[] classG=new ClassList[40];
    public static void main(String[] args) {
        ArraySearch2 arraySearch=new ArraySearch2();
        for(int i=0;i<arraySearch.classG.length;i++)
        {
            arraySearch.classG[i]=new ClassList();
            arraySearch.classG[i].setStrength(kuchbhi());
        }

        for (int i = 0; i <arraySearch.classG.length ; i++) {
            System.out.println(arraySearch.classG[i]);
        }
    }
    private static int kuchbhi()
    {
        int response=-1;
        response=(int)((Math.random()*100)+1);
        return response;
    }
}
class ClassList
{
    private int strength;
    public int getStrength()
    {
        return strength;
    }
    public void setStrength(int strength)
    {
        this.strength=strength;
    }
}