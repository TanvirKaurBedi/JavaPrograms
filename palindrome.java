import java.util.Scanner;

public class palindrome {
    // static void checkMethod() {
    // if (orignal.equals(reverse)) {

    // }}

    public static void main(String[] args) {
        String orignal;
        String reverse = "";
        int length, i;
        System.out.println("please enter a string or a number to check whether the number is palindrome or not");
        Scanner sc = new Scanner(System.in);
        orignal = sc.nextLine();
        sc.close();
        length = orignal.length();
        for (i = length - 1; i >= 0; i--) {
            reverse += orignal.charAt(i);
        }
        System.out.println("reverse = " + reverse);
        // checkMethod();
        if (orignal.equals(reverse)) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
