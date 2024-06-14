

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num:");
//        int n = sc.nextInt();

//        int ans = isArmstrong(i);
//
//        if(ans == i){
//            System.out.println("is armstrong number");
//        }else {
//            System.out.println("not armstrong number");
//        }

        for (int i = 100; i < 1000; i++) {
           if (isArmstrong(i)){
               System.out.println(i);
           }
        }



    }
    static boolean isArmstrong(int n){
        int orignal = n;
        int sum = 0;
        while(n>0){
            int lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }
        return sum == orignal;
    }
}
