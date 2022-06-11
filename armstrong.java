import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    public static void main(String[] arg) {
        int count = 0;
        int i;
        int remainder;
        double sum = 0;

        System.out.println("please enter a number to be tested");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        sc.close();

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int temp1 = number;
        for (i = 0; i < count; i++) {
            remainder = temp1 % 10;
            sum = sum + Math.pow(remainder, 3);
            temp1 = temp1 / 10;
            System.out.println(sum);
        }
        if (sum == number) {
            System.out.println(number + " is armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
    }
}
