import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // 5! = 1x2x3x4x5
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int f = 1;
        
        for (int i = 1; i <= n; i++) {
            f *= i;
            
        }
        System.out.println(f);

    }
}
