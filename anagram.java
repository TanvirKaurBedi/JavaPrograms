
//anagram=>Two strings are said to be anagram if we can form one string by arranging the another string
//example=>care and race are anagram;
import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        System.out.println("ENTER TWO STRINGS");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        sc.close();

        String word_1 = word1.toLowerCase();
        String word_2 = word2.toLowerCase();
        System.out.println(word_1);
        if (word_1.length() == word2.length()) {
            char[] array1 = word_1.toCharArray();
            char[] array2 = word_2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            System.out.println(array1);
            if (Arrays.equals(array1, array2)) {
                System.out.println(word1 + " and " + word2 + " are anagram");

            } else {
                System.out.println(word1 + " and " + word2 + " are not anagram");
            }

        }

    }
}
