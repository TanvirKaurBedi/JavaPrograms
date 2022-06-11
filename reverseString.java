import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        String word;
        int i, k;
        String reversedWord = " ";
        System.out.println("Plz enter a word to be reversed");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        sc.close();
        k = word.length();
        for (i = k - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println(reversedWord);
    
    }
}
