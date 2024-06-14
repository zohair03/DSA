
import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {

        //Write a program to print whether a number is even or odd, also take input from the user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enters a number:");
        int n = sc.nextInt();

        if (n != 0) {
            if (n % 2 == 0) {
                System.out.println("This is even number");
            } else {
                System.out.println("This is odd number");
            }
        } else {
            System.out.println("Zero is nor even nor odd");
        }


    }
}
