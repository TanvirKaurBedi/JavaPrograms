import java.util.Scanner;

public class reverseUserInputSentence {

    public static void main(String[] args) {
        String reverse = "";
        System.out.println("Please Enter A sentence to be reversed");
        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine();
        String[] splits = sentance.split(" ");
        sc.close();
        for (int i = splits.length - 1; i >= 0; i--) {
            reverse += splits[i] + " ";
        }
        System.out.println(reverse);
    }
}
