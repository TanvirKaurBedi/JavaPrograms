public class reverseNumber {
    public static void main(String[] args) {
        int number = 124567128;
        String reverse = " ";
        int remainder;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse + remainder;
            number = number / 10;
        }
        System.out.println("reverse number is " + reverse);
    }
}
