import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[]args)
    {
        int days;
        System.out.println("PLZ ENTER THE DAY IN NUMBER");
        Scanner s= new Scanner(System.in);
        days=s.nextInt();
        switch(days)
        {
           case 1:
           System.out.println("Its MONDAY");
         break;
           case 2:
           System.out.println("Its TUESDAY");
          break;
           case 3:
           System.out.println("Its WEDNESDAY");
           break;
           case 4:
           System.out.println("Its THURSDAY");
           break;
           case 5:
           System.out.println("Its FRIDAY");
           break;
           case 6:
           System.out.println("Its SATURDAY");
           break;
           case 7:
           System.out.println("Its SUNDAY");
           break;
           default:
           System.out.println("Plz Enter Number Between 1 to 7");
           

              
        }
    }
    
}
