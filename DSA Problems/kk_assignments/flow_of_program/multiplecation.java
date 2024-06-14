
import java.util.Scanner;

public class multiplecation {
    public static void main(String[] args) {

        // Take a number as input and print the multiplication table for it.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        sc.close();
        int m = 0;
        for (int i = 1; i <= 10; i++) {
            m = i * n;
            System.out.println(m);
        }
    }
}
