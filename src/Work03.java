
import java.util.Scanner;
public class Work03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Number: ");
        int n = in .nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + " =" + (n * i));
        }
    }
}
