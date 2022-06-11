import java.util.Scanner;

public class factorialEg {
    public static void main(String[] args) {
        int product = 1;
        System.out.println("please enter  a number to find factorial");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        sc.close();
        for (int i = numb; i > 0; i--) {
            product = product * i;
        }
        System.out.println("Factorial of " + numb + " is " + product);
    }
}
