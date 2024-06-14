import java.util.Scanner;

public class user_input_output {

    public static void main(String[] args) {
        //  65 to 90 uppercase letters
        //  97 to 122 lowercase letters
        Scanner sc = new Scanner(System.in);
        char a = sc.next().trim().charAt(0);

//        if (a>=65 && a <= 90) {
//            System.out.println("1");
//        }else if (a>=97 && a<=122){
//            System.out.println("0");
//        }else{
//            System.out.println("-1");
//        }

        // Most Optimized Way:
        if (a>='A' && a<='Z'){
            System.out.println(1);
        } else if (a>='a' && a<='z') {
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}