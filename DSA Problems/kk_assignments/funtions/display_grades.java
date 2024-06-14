

import java.util.Scanner;
import java.lang.String;

public class display_grades {
    public static void main(String[] args) {
        // Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as
        // below:

        // Marks Grade
        // 91-100 AA
        // 81-90 AB
        // 71-80 BB
        // 61-70 BC
        // 51-60 CD
        // 41-50 DD
        // <=40 Fail

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks:");
        int marks = sc.nextInt();
        String GRDs = grades(marks);
        System.out.println("Your Grades are: " + GRDs);
    }

    static String grades(int m) {
        if (m > 100 || m < 0) {
            return "Invalid";
        } else if (m >= 91 && m <= 100) {
            return "AA";
        } else if (m >= 81 && m <= 90) {
            return "AB";
        } else if (m >= 71 && m <= 80) {
            return "BB";
        } else if (m >= 61 && m <= 70) {
            return "BC";
        } else if (m >= 51 && m <= 60) {
            return "CD";
        } else if (m >= 41 && m <= 50) {
            return "DD";
        } else {
            return "Fail";
        }
    }

}
