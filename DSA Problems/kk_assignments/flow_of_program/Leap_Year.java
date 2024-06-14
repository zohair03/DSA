
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        
        // Input a year and find whether it is a leap year or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int y = sc.nextInt();

        if(y % 4 == 0)
            System.out.println("This is a Leap Year");
        else
            System.out.println("This is a Normal Year");
    }
}
