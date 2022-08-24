import java.util.Scanner;
public class Work01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n+1) % 2 == 0)
            System.out.println(n+1);
        else
            System.out.println(n+2);
    }
}