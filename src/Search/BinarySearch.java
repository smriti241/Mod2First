package Search;

import java.util.Scanner;

class Car
{
    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class BinarySearch
{
    private static void insert(Car[] car)
    {
        for (int i = 0; i < car.length; i++)
        {
            car[i]=new Car();
            car[i].setName("Car"+i);
            car[i].setPrice(i*100);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Car[] array = new Car[size];
        insert(array);

        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }*/
        int value=sc.nextInt();
        System.out.println("Position: "+Binary(array,value));

    }
    public static int Binary(Car[] array,int value)
    {
        int pos=-1;
        int beg=0,end=array.length-1,mid;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(array[mid].getPrice()==value)
            {
                pos=mid;
                break;
            }
            else if(array[mid].getPrice()>value)
            {
                end=mid-1;
            }
            else
            {
                beg=mid+1;
            }
        }
        return pos;
    }
}
