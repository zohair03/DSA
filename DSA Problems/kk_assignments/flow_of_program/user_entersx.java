
import java.util.Scanner;

public class user_entersx {
    public static void main(String[] args) {

        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();

        while (n != 0){
            int temp = n;
            n = temp + n;
        }

        System.out.println(n);
    }
}
