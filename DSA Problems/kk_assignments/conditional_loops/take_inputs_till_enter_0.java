
import java.util.Scanner;

public class take_inputs_till_enter_0 {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.println("Enter the number: ");
            num = sc.nextInt();
            System.out.println("Enter 0 to end the loop");
            sum = sum + num;
        } while (num > 0);

        System.out.println("Sum is:" + sum);



    }
}
