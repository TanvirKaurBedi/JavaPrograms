import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[]args)
    {
        System.out.println("PLZ Enter The Number to be Tested");
        int x;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                count++;
             }
        }
        if(count==2)
        {
            System.out.println(x + " is a Prime Number");
        }
        else{
            System.out.println(x + " is not a prime Number");
        }
    }
}

