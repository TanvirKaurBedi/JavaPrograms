import java.util.Scanner;

public class ocuurenceOfGivenNumber {
    public static void main(String[] args) {
        int i;
        int count = 0;
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Enter the letter whose occurence you want to find");
        Character letter = sc.next().charAt(0);
        sc.close();
        for (i = 0; i < word.length(); i++) {
            if (letter.equals(word.charAt(i))) {
                count++;
            }
        }
        System.out.println(letter + " occurs " + count + " times in " + word);
    }
}
