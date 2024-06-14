
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();

        // 2,3,5,7,11,13,...

        int c = 2;


        boolean ans = isPrim(num);
        System.out.println(ans);

    }
    static boolean isPrim(int num) {


        if(num <= 1){
            return false;
        }

        int count = 2;
        while(count*count <= num){
            if(num % count == 0){
                return false;
            }
            count++;
        }

        return count * count > num;
    }
}


















