
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        // 0,1,1,2,3,5,8,13,...
        // a + b = n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int c = 2; c <= n; c++){
           int temp = b;
            b = b + a;
            a = temp;

        }
        System.out.print(b);
    }
}
