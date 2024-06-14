

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char  a = 122;
        System.out.println(a);

//  65 to 90 uppercase letters
//  97 to 122 lowercase letters

//        System.out.print("enter name:");
//        String naam = sc.next();
//
//        String msg = greet(naam); // calling of function and storing its value in msg variable;
//
//        System.out.println(msg);
    }

    static String greet(String name) {
        String greeting = "hello " + name;
        return greeting;
    }


}