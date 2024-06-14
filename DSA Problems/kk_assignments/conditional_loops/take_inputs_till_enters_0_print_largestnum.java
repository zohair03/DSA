
import java.util.Scanner;

public class take_inputs_till_enters_0_print_largestnum {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the largest number from all.

        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n;

        do {
            System.out.println("enter n:");
            n = sc.nextInt();
            if(n > max){
                max = n;
            }
        } while (n != 0);

        System.out.println("this is max number:" + max);


    }
}
