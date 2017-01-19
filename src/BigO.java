
import java.util.Scanner;



public class BigO
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("PANGALAN MO");
        System.out.println("INPUT maxTime");
        //eto bale kung gano kahaba tumakbo ang bawat method :D
        
        long maxTime=1000000000*(Long.parseLong(sc.nextLine()));
        
        //starting times ng bawat method.
        long elapsedTime1=0;
        long elapsedTime2=0;
        long elapsedTime3=0;
        
        //counter para sa bawat method
        int n1=0;
        int n2=0;
        
        
        //first method
        long startTime1=System.nanoTime();    
        while(elapsedTime1<=maxTime)
        {
            
            n1++;//dagdag sa counter
            System.out.println("n= "+n1);
            System.out.println(PowerByReductionBy1(n1));
            System.out.println(System.nanoTime());
            elapsedTime1 = System.nanoTime()-startTime1;
        }
        
        //second method
        long startTime2=System.nanoTime();    
        while(elapsedTime2<=maxTime)
        {
            
            n2++;//dagdag sa counter
            System.out.println("n= "+n2);
            System.out.println(PowerByHalving(n2));
            System.out.println(System.nanoTime());
            elapsedTime2 = System.nanoTime()-startTime2;
        }
        System.out.println("max n for method 1 :"+n1 );
        System.out.println("max n for method 2 :"+n2 );
        
    }
    
    public static double PowerByReductionBy1(int n)
    {
        double b= 1.001;
        
        if (n==0)
        {
            return 1;
        }
        else
        {
            return b * PowerByReductionBy1(n-1);
        }
    }
    
    public static double PowerByHalving(int n) {
        double b=1.001;
    if (n < 0)
        return 1 / PowerByHalving (-n);
    if (n == 0)
        return 1;
    double halfPow = PowerByHalving(n/2);
    if (n % 2 == 0)
        return halfPow * halfPow;
    else
        return halfPow * halfPow * n;
}
    
}