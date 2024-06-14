
import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        //To find Armstrong Number between two given number.
        // 153 = 1^3 + 5^3 + 3^3 = 153
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number:");
//        int n = sc.nextInt();
//        int og_n = n;
        int ans = 0;
//        while (n != 0){
//            int lastdigit = n % 10;
//            ans = ans + (lastdigit * lastdigit * lastdigit);
//            n = n / 10;
//
//        }

        for (int i = 100; i < 1000; i++){
            int lastdigit = i % 10;
            ans = ans + (lastdigit * lastdigit * lastdigit);
        }

        

//        if (og_n == ans){
//            System.out.println("is armstrong number");
//        }else {
//            System.out.println("is not armstrong number");
//        }
    }
}
