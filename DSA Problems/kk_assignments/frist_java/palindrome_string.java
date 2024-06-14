

import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        // To find out whether the given String is Palindrome or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String st = sc.nextLine();
        String rev = "";
        for(int i = st.length()-1; i >= 0; i--){
            rev = rev + st.charAt(i);
        }
        if(st.equals(rev)){
            System.out.println("This is a Palindrome String");
        }else {
            System.out.println("This is not a Palindrome String");
        }
    }
}
