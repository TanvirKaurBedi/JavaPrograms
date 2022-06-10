import java.util.Scanner;
//factorial of 5 = 5*4*3*2*1;

public class Factorial {
     public static void main(String[] args) {
       System.out.println("Please Enter a number");
       int num;
       int i;
       int product=1;
       Scanner s = new Scanner(System.in);
       num=s.nextInt();
    for(i=1;i<=num;i++)
    {
        product=product*i; //1*1=1
        //1*2=2;
        //2*3=6
        //6*4=24
        //24*5=120
    }
    System.out.println("Factorial of given Number is "+ product);
    }
    
}
