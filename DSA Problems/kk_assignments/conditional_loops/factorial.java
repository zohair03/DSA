
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // 5!=5x4x3x2x1x1=120
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++){

            fact = fact * i;

        }
        
        System.out.println(fact);
    }
}
