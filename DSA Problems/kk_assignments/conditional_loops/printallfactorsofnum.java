
import java.util.Scanner;

public class printallfactorsofnum {
    public static void main(String[] args) {
        // Input a number and print all the factors of that number (use loops).
        // factors of 10 are 1,2,5 & 10

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 1;
        
        while (c <= n) {
            if (n % c == 0) {
                System.out.println(c);
            }
            c++;
        }
        
    }
}

















