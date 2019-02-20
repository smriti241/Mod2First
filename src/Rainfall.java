import java.util.Scanner;

class Rain
{
    private double[] rain_per_month;
    public void setRain_per_month(double[] rain_per_month)
    {
        this.rain_per_month = rain_per_month;
    }
    public double[] getRain_per_month()
    {
        return rain_per_month;
    }
    public double total()
    {
        double sum=0.0;
        for (int i = 0; i < 12; i++) {
            sum+=rain_per_month[i];
        }
        return sum;
    }
    public double average()
    {
        double avg=0.0;
        for(int i=0;i<12;i++)
        {
            avg=total()/12;
        }
        return avg;
    }
    public double maximum()
    {
        int max=0;
        for(int i=0;i<12;i++)
        {
            if (rain_per_month[max] > rain_per_month[i])
            {
                max=i;
            }
        }
        return max+1;
    }
    public double minimum()
    {
        int min=0;
        for(int i=0;i<12;i++)
        {
            if (rain_per_month[min] < rain_per_month[i])
            {
                min=i;
            }
        }
        return min+1;
    }
}
public class Rainfall
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double rain=0.0;
        for (int i = 0; i < 12; i++)
        {
            rain=sc.nextDouble();
            Rain r=new Rain();
        }
    }
}
