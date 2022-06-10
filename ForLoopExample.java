import java.util.Scanner;

class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("Plz enter the number from where u want to print");
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (int i = num; i <= 10; i++) {
            System.out.println(i);
        }

    }
}
