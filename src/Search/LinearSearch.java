package Search;

class Aadi
{
    private String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aadi(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Aadi{" +
                "name='" + name +
                ", marks=" + marks +
                '}';
    }
}

public class LinearSearch
{
    public static void main(String[] args)
    {
        int size=10;
            Aadi[] numbers = new Aadi[size];
            String x="Smriti";
            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i]=new Aadi(x,(i*10));
            }

        display(numbers);
        int value=50;
        int position=-1;
        position = Linear(numbers, value);
        if(position==-1)
        {
            System.out.println("Value not found");
        }
        else
        {
            System.out.println("Value found");
            System.out.println("Value found at:"+position);
        }
    }

    public static int Linear(Aadi[] numbers, int value) {
        int position =-1 ;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].getMarks()==value)
            {
                position=i;
                break;
            }
        }
        return position;
    }

    public static void display(Aadi[] numbers) {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
