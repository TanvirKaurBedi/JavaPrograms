public class reverseSent {
    public static void main(String[] args) {
        int i;
        String reverse = " ";
        String sentance = "MY NAME IS TANVIR";
        String[] splits = sentance.split(" ");
        int l = splits.length;
        // System.out.println(l);
        for (i = l - 1; i >= 0; i--) {
            reverse += splits[i] + " ";
        }
        System.out.println(reverse);
    }
}