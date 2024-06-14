
import java.util.Scanner;

public class list_of_N_numbers {
    public static void main(String[] args) {
        // Write a program to print the sum of negative numbers, sum of positive even
        // numbers and the sum of positive odd numbers from a list of numbers (N)
        // entered by the user. The list terminates when the user enters a zero.

        Scanner sc = new Scanner(System.in);
        int N;
        int s_of_neg = 0;
        int s_of_posi_even = 0;
        int s_of_posi_odd = 0;

        do {
            System.out.print("enter N:");
            N = sc.nextInt();
            if (N < 0) {
                s_of_neg = s_of_neg + N;
            }
            if (N >= 0 && N % 2 == 0) {
                s_of_posi_even = s_of_posi_even + N;
            }
            if (N >= 0 && N % 2 != 0) {
                s_of_posi_odd = s_of_posi_odd + N;
            }
        } while (N != 0);

        System.out.println("sum of -ve numbers: " + s_of_neg);
        System.out.println("sum of +ve even numbers: " + s_of_posi_even);
        System.out.println("sum of +ve odd numbers: " + s_of_posi_odd);
    }
}
