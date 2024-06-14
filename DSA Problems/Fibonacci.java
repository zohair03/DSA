

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

//        Fibonacci Series: starts from 0,1,... by adding previous two numbers
//        Fibonacci Series: 0,1,1,2,3,5,8,13,...
//
//        Q: find the nth fibonacci number?

        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int count = 2; count<=n; count++){
            int temp=b;
            b = b + a;
            a = temp;
        }
        System.out.print(b);
    }
}
