import java.util.Scanner;

public class EvenNumber
{
    public static void main(String[]args)
    {
      int x;
      System.out.println("plz enter the number to be tested");
      Scanner s= new Scanner(System.in);
      x=s.nextInt();
      if(x%2==0)
      {
          System.out.println(x + " is an even number");
      }
      else
      {
        System.out.println(x + " is not a even number");
      }
    }
    
}

