import java.util.Scanner;
public class Work02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Number: ");
        int n = in .nextInt();
        for (int i = 1; i <= 100; i++) {
            System.out.println(n + "+" + i + " =" + (n + i));
        }
    }
}
