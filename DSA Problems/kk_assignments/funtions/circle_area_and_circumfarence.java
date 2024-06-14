

import java.util.Scanner;

public class circle_area_and_circumfarence {
    public static void main(String[] args) {
        // Write a program to print the circumference and area of a circle of radius
        // entered by user by defining your own method.

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double circum = circle_circumfarence(radius);
        double area = circle_area(radius);
        System.out.format("circumfarence:%.1f\n",circum);
        // System.out.println(String.format("circumfarence:%.1f",circum));
        System.out.println("area:" + area);
    }

    static double circle_circumfarence(int r) {
        double pi = 3.14;
        double circumference = 2 * pi * r;
        return circumference;
    }

    static double circle_area(int r) {
        double pi = 3.14;
        double area = pi * (r * r);
        return area;
    }

}
