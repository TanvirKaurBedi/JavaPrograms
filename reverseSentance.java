import java.util.Scanner;

public class reverseSentance {
    public static void main(String[] args) {
        String sentance;
        String reverseSentance = " ";
        int i;
        System.out.println("please Enter a sentence to be reversed");
        Scanner sc = new Scanner(System.in);
        sentance = sc.nextLine();
        for (i = sentance.length() - 1; i >= 0; i--) {
            reverseSentance += sentance.charAt(i);
        }
        System.out.println(reverseSentance);
    }
}