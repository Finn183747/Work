import java.util.Scanner;

public class Work04 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("first Number: ");
        int a =scan.nextInt();
        System.out.print("second Number: ");
        int b =scan.nextInt();
        int sum = a + b;
        System.out.println("sum: "+sum);
    }
}
