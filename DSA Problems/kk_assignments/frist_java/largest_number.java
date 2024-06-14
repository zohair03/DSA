

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int n1 = sc.nextInt();
        System.out.println("Enter num2:");
        int n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("num1 is largest number");
        } else if (n2>n1) {
            System.out.println("num2 is largest number");
        } else {
            System.out.println("Both number are equal");
        }


    }
}
