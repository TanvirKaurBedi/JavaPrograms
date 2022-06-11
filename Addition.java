import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("plz enter two numbers to be added");
        int a, b;
        double sum = 0,average=0;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        sum = a + b;
        average = sum/2;
        System.out.println("The Sum of the numbers entered is:" + sum +" " + average);
        System.out.println("The Average of the numbers entered is:" + average);
        s.close();

    }

}
